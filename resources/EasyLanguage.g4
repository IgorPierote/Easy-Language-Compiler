grammar EasyLanguage;

@header{
	import br.edu.cefsa.compiler.datastructures.EasySymbol;
	import br.edu.cefsa.compiler.datastructures.EasyVariable;
	import br.edu.cefsa.compiler.datastructures.EasySymbolTable;
	import br.edu.cefsa.compiler.exceptions.EasySemanticException;
	import br.edu.cefsa.compiler.abstractsyntaxtree.EasyProgram;
	import br.edu.cefsa.compiler.abstractsyntaxtree.AbstractCommand;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandLeitura;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandEscrita;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandAtribuicao;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandDecisao;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandEnquanto;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandLaço;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandVetor;
	import br.edu.cefsa.compiler.datastructures.EasyArray;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandFuncao;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandRetorno;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandBlocoMain;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandDeclaracaoLocal;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandChamada;
	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private EasySymbolTable symbolTable = new EasySymbolTable();
	private EasySymbol symbol;
	private EasyProgram program = new EasyProgram();
	private ArrayList<AbstractCommand> curThread;
	private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
	private String _readID;
	private String _writeID;
	private String _exprID;
	private String _exprContent;
	private String _exprDecision;
	private int _lastExprType; // Usado para verificação de tipo
	private ArrayList<AbstractCommand> listaTrue;
	private ArrayList<AbstractCommand> listaFalse;
	private Stack<EasySymbolTable> scopeStack = new Stack<>(); 	
	private EasySymbolTable globalSymbolTable;
	private String _funcaoNome; 
    	private ArrayList<String> _argumentosLista;


    public void initScope() {
        EasySymbolTable globalTable = new EasySymbolTable();
        scopeStack.push(globalTable);
        this.symbolTable = globalTable;
        this.globalSymbolTable = globalTable; 
    }

    public EasySymbol getSymbol(String id) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            EasySymbolTable currentScope = scopeStack.get(i);
            if (currentScope.exists(id)) {
                return currentScope.get(id);
            }
        }
        return null;
    }
    
    public void verificaID(String id){
        if (getSymbol(id) == null) {
            throw new EasySemanticException("Symbol "+id+" not declared");
        }
    }
	
	public void exibeComandos(){
		for (AbstractCommand c: program.getComandos()){
			System.out.println(c);
		}
	}
	
	public void generateCode(){
		program.generateTarget();
	}

	public void enterScope() {
		EasySymbolTable newScope = new EasySymbolTable(); 
		scopeStack.push(newScope);
		this.symbolTable = newScope; 
	}

	public void exitScope() {
    		if (!scopeStack.isEmpty()) {
        		scopeStack.pop();
    		}
    		if (!scopeStack.isEmpty()) {
        		this.symbolTable = scopeStack.peek(); 
    		} else {
        		this.symbolTable = null; 
    		}
    }
    
    public EasyProgram getProgram() {
        return this.program;
    }
}

prog :
    'programa'
    {
        initScope();
        curThread = new ArrayList<AbstractCommand>();
        stack.push(curThread);
    }
    decl
    rotinas
    bloco
    'fimprog;'
    {
        program.setVarTable(globalSymbolTable);
    }
;

rotinas : (funcao | procedimento)* ;

funcao : FUNCAO_KW tipo{
        int tipo_funcao;
        tipo_funcao = _tipo;
}
	nomeF=ID 
         { 
             String nomeFuncao = $nomeF.text;
             if (getSymbol(nomeFuncao) != null) {
                 throw new EasySemanticException("Symbol " + nomeFuncao + " already declared");
             }
             globalSymbolTable.add(new EasyVariable(nomeFuncao, _tipo, null));
             enterScope(); // Entra no novo escopo ANTES de processar os parâmetros
         }
         AP params=param_list FP
         { 
             if ($params.listaRetorno != null) {
                 for (EasySymbol p : $params.listaRetorno) {
                    symbolTable.add(p); // Adiciona os parâmetros ao novo escopo
                 }
             }
             curThread = new ArrayList<AbstractCommand>();
             stack.push(curThread);
         }
         ACH bloco_funcao FCH
         { 
             ArrayList<AbstractCommand> corpoComandos = stack.pop(); 
             CommandFuncao cmd = new CommandFuncao($nomeF.text, tipo_funcao, $params.listaRetorno, corpoComandos);
             cmd.setGlobal(true); // <--- AGORA ESTÁ AQUI!
             program.addFuncao(cmd); // Adiciona à lista de funções
             exitScope(); // Sai do escopo da função
         }
       ;

param_list returns [List<EasySymbol> listaRetorno]
@init {
    $listaRetorno = new ArrayList<EasySymbol>();
}
    :
    (
        tipo ID {
            String paramName = $ID.text;
            EasyVariable paramSymbol = new EasyVariable(paramName, _tipo, null); 
            $listaRetorno.add(paramSymbol);
        }
        (VIR tipo ID {
            paramName = $ID.text;
            paramSymbol = new EasyVariable(paramName, _tipo, null);
            $listaRetorno.add(paramSymbol);
        })*
    )?
;

procedimento : PROCEDIMENTO_KW TIPO_VOID nomeP=ID 
               { 
                   if (getSymbol($nomeP.text) != null) {
                       throw new EasySemanticException("Symbol " + $nomeP.text + " already declared");
                   }
                   globalSymbolTable.add(new EasyVariable($nomeP.text, EasyVariable.VOID, null));
                   enterScope(); 
               }
               AP params=param_list FP
               {
                   if ($params.listaRetorno != null) {
                       for (EasySymbol p : $params.listaRetorno) {
                           symbolTable.add(p);
                       }
                   }
                   curThread = new ArrayList<AbstractCommand>();
                   stack.push(curThread);
               }
               ACH bloco_funcao FCH
               {
                   ArrayList<AbstractCommand> corpo = stack.pop();
                   CommandFuncao cmd = new CommandFuncao($nomeP.text, EasyVariable.VOID, $params.listaRetorno, corpo);
                   cmd.setGlobal(true); // <--- AGORA ESTÁ AQUI!
                   program.addFuncao(cmd);
                   exitScope();
               }
             ;

bloco_funcao : (cmd | cmd_retorno)* ;

cmd_retorno : RETORNO_KW e=expr SC 
              { 
                  CommandRetorno cmd = new CommandRetorno($e.text); 
                  stack.peek().add(cmd);
              }
            ;
		
decl    :  (declaravar | declaracao_array)* ;

// REGRA CORRIGIDA E SIMPLIFICADA
declaravar
    : tipo var_decl (VIR var_decl)* SC
    ;

var_decl
    : ID (ATTR e=expr {
            // Declaração com inicialização: numero x = 10;
            _varName = $ID.text;
            if (getSymbol(_varName) != null && scopeStack.peek().exists(_varName)) {
                throw new EasySemanticException("Symbol " + _varName + " already declared in this scope");
            }
            if (_tipo != $e.type) {
                throw new EasySemanticException("Type mismatch for variable " + _varName + ". Expected " + _tipo + " but got " + $e.type);
            }
            EasyVariable novoSimbolo = new EasyVariable(_varName, _tipo, null);
            symbolTable.add(novoSimbolo);
            
            // Adiciona CommandDeclaracaoLocal SOMENTE se não for o escopo global
            if (scopeStack.size() > 1) { 
                CommandDeclaracaoLocal cmdDecl = new CommandDeclaracaoLocal(novoSimbolo);
                stack.peek().add(cmdDecl);
            }
            
            CommandAtribuicao cmdAttr = new CommandAtribuicao(_varName, $e.text);
            stack.peek().add(cmdAttr);
        }
    |   { // Declaração sem inicialização: numero x;
            _varName = $ID.text;
             if (getSymbol(_varName) != null && scopeStack.peek().exists(_varName)) {
                throw new EasySemanticException("Symbol " + _varName + " already declared in this scope");
            }
            EasyVariable novoSimbolo = new EasyVariable(_varName, _tipo, null);
            symbolTable.add(novoSimbolo);

            // Adiciona CommandDeclaracaoLocal SOMENTE se não for o escopo global
            if (scopeStack.size() > 1) {
                CommandDeclaracaoLocal cmd = new CommandDeclaracaoLocal(novoSimbolo);
                stack.peek().add(cmd);
            }
        }
    )
    ;
           
tipo       : TIPO_NUMERO { _tipo = EasyVariable.NUMBER;  }
           | TIPO_TEXTO  { _tipo = EasyVariable.TEXT;  }
		   | TIPO_BOOLEANO   { _tipo = EasyVariable.BOOLEANO;  }
		   | TIPO_VOID   { _tipo = EasyVariable.VOID;  }
           ;

bloco	:	'bloco'
		ACH
		{
			enterScope();
			// A pilha de comandos principal já foi criada no 'prog'
		}
		(cmd)*
		FCH
		{
			program.setComandos(stack.pop());
			exitScope();
		}
		;

// declaravar e declaracao_array agora são tipos de comando
cmd:  cmdleitura  
 		|  cmdescrita 
 		|  cmdattrib
 		|  cmdselecao
		|  cmdEnquanto 
 		|  cmdLaço
		|  cmd_chamada
		|  declaravar
		|  declaracao_array
		;

cmd_chamada
    : ID { 
        _funcaoNome = _input.LT(-1).getText(); 
        verificaID(_funcaoNome);
      }
      AP
      { _argumentosLista = new ArrayList<String>(); } 
      (
          e=expr
          {
              _argumentosLista.add($e.text);
          }
          ( VIR e2=expr { _argumentosLista.add($e2.text); } )*
      )? 
      FP SC
      {
          CommandChamada cmd = new CommandChamada(_funcaoNome, _argumentosLista);
          stack.peek().add(cmd);
          _funcaoNome = null;
      }
    ;
		
cmdleitura	: 'leia' AP ID { verificaID($ID.text); _readID = $ID.text; } FP SC 
              {
              	EasyVariable var = (EasyVariable)getSymbol(_readID);
              	CommandLeitura cmd = new CommandLeitura(_readID, var);
              	stack.peek().add(cmd);
              }   
			;
			
cmdescrita: 'escreva' AP e=expr FP SC
      {
          CommandEscrita cmd = new CommandEscrita($e.text);
          stack.peek().add(cmd);
      }
    ;
			
cmdattrib :
    id_ou_array
    {
         _exprID = $id_ou_array.text;
         String varName = _exprID;
         int bracketPos = _exprID.indexOf('[');
         if (bracketPos != -1) {
            varName = _exprID.substring(0, bracketPos);
         }
         EasySymbol var = getSymbol(varName);
         if (var == null) throw new EasySemanticException("Symbol " + varName + " not declared");
         _lastExprType = var.getType(); // Guarda o tipo da variável de destino
    }
    ATTR e=expr SC
    {
        // Compara o tipo da variável com o tipo da expressão
        if (_lastExprType != $e.type) {
            throw new EasySemanticException("Type mismatch for attribution command: expected type " + _lastExprType + " but got type " + $e.type);
        }
        CommandAtribuicao cmd = new CommandAtribuicao(_exprID, $e.text);
        stack.peek().add(cmd);
    }
    ;
			
cmdselecao : 'se' AP e=expr FP ACH
             {
                if ($e.type != EasyVariable.BOOLEANO) {
                    throw new EasySemanticException("Conditional expression in 'se' must be boolean");
                }
                _exprDecision = $e.text;
                curThread = new ArrayList<AbstractCommand>(); 
                stack.push(curThread); 
             }
             (cmd)* 
             FCH
             { listaTrue = stack.pop(); listaFalse = null; } 
             ('senao' ACH
                 { 
                    curThread = new ArrayList<AbstractCommand>(); 
                    stack.push(curThread); 
                 }
                 (cmd)* 
                 FCH
                 { listaFalse = stack.pop(); }
             )?
	     {       
             CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
             stack.peek().add(cmd);
             _exprDecision = null; 
         }
         ;

cmdEnquanto : 	'enquanto' AP e=expr FP (FACA_KW DP)? ACH
                {
                    if ($e.type != EasyVariable.BOOLEANO) {
                        throw new EasySemanticException("While condition must be a boolean expression");
                    }
                    _exprDecision = $e.text;
                    curThread = new ArrayList<AbstractCommand>();
                    stack.push(curThread);
                }
                (cmd)* 
                FCH
                {
                    ArrayList<AbstractCommand> listaComandosDoWhile = stack.pop();
                    CommandEnquanto cmd = new CommandEnquanto(_exprDecision, listaComandosDoWhile);
                    stack.peek().add(cmd);
                }
            ;

cmdLaço : 'para' ID 
            { 
                String _varControle = $ID.text;
                enterScope(); // Entra no escopo do laço
                symbolTable.add(new EasyVariable(_varControle, EasyVariable.NUMBER, null)); // Adiciona a variável de controle ao escopo
            }
            'de' (v_inicial_id=ID | v_inicial_num=NUMBER) { String _valorInicial = $v_inicial_id.text != null ? $v_inicial_id.text : $v_inicial_num.text; } 
            'ate' (v_final_id=ID | v_final_num=NUMBER) {  String _valorFinal = $v_final_id.text != null ? $v_final_id.text : $v_final_num.text; } 
            'passo' (v_passo_id=ID | v_passo_num=NUMBER) {String _passo = $v_passo_id.text != null ? $v_passo_id.text : $v_passo_num.text; } 
            DP ACH                            
            {
                curThread = new ArrayList<AbstractCommand>();
                stack.push(curThread); 
            }
            (cmd)*                         
            FCH                            
            {
                ArrayList<AbstractCommand> listaComandosDoPara = stack.pop();
                CommandLaço cmd = new CommandLaço($ID.text, _valorInicial, _valorFinal, _passo, listaComandosDoPara);
                exitScope(); // Sai do escopo do laço
                stack.peek().add(cmd);
            }
        ;

declaracao_array
    : tipo ID { _varName = $ID.text; } AC NUMBER
      {
          int tamanho = Integer.parseInt($NUMBER.text); 
          if (getSymbol(_varName) != null && scopeStack.peek().exists(_varName)){
               throw new EasySemanticException("Symbol "+_varName+" already declared in this scope");
          }
          symbol = new EasyArray(_varName, _tipo, null, tamanho);
          symbolTable.add(symbol); 
          
          String tipoJava;
          if (_tipo == EasyVariable.NUMBER) tipoJava = "double";
          else if (_tipo == EasyVariable.TEXT) tipoJava = "String";
          else tipoJava = "Boolean";
          
          CommandVetor cmdVetor = new CommandVetor(_varName, tipoJava, tamanho);
          stack.peek().add(cmdVetor);
      } 
      FC SC
    ;

expr returns [int type, String text]
    : t1=termo_logico { $type = $t1.type; $text = $t1.text; }
      (
        op=OPBOOL 
        t2=termo_logico
        {
            if ($type != EasyVariable.BOOLEANO || $t2.type != EasyVariable.BOOLEANO) {
                throw new EasySemanticException("Logical operators require boolean operands");
            }
            String operator = $op.text.equals("e") ? "&&" : "||";
            $text = $text + " " + operator + " " + $t2.text;
            $type = EasyVariable.BOOLEANO;
        }
      )*
    ;

termo_logico returns [int type, String text]
    : t1=termo_relacional { $type = $t1.type; $text = $t1.text; }
      (
        op=OPREL 
        t2=termo_relacional
        {
            if ($type != $t2.type) {
                // Permite comparar numero com numero, texto com texto, etc.
            }
            $text = $text + " " + $op.text + " " + $t2.text;
            $type = EasyVariable.BOOLEANO;
        }
      )*
    ;

termo_relacional returns [int type, String text]
    : t1=termo_aritmetico { $type = $t1.type; $text = $t1.text; }
      (
        op=OP 
        t2=termo_aritmetico
        {
            if ($type != EasyVariable.NUMBER || $t2.type != EasyVariable.NUMBER) {
                throw new EasySemanticException("Arithmetic operators require numeric operands");
            }
            $text = $text + " " + $op.text + " " + $t2.text;
            $type = EasyVariable.NUMBER;
        }
      )*
    ;

termo_aritmetico returns [int type, String text]
    :   ID 
        {
            verificaID($ID.text);
            EasySymbol s = getSymbol($ID.text);
            $type = s.getType();
            $text = $ID.text;
        }
    |   NUMBER
        {
            $type = EasyVariable.NUMBER;
            $text = $NUMBER.text;
        }
    |   STRING_LITERAL
        {
            $type = EasyVariable.TEXT;
            $text = $STRING_LITERAL.text;
        }
    |   BOOLEANO
        {
            $type = EasyVariable.BOOLEANO;
            $text = $BOOLEANO.text.equals("verdadeiro") ? "true" : "false";
        }
    |   NAO_KW t=termo_aritmetico
        {
            if ($t.type != EasyVariable.BOOLEANO) {
                throw new EasySemanticException("'nao' operator requires a boolean operand");
            }
            $text = "!(" + $t.text + ")";
            $type = EasyVariable.BOOLEANO;
        }
    |   AP e=expr FP
        {
            $type = $e.type;
            $text = "(" + $e.text + ")";
        }
    |   c=chamada_funcao
        {
            String funcName = $c.text.substring(0, $c.text.indexOf('('));
            EasySymbol s = getSymbol(funcName);
            if (s == null) throw new EasySemanticException("Function " + funcName + " not declared");
            $type = s.getType();
            $text = $c.text;
        }
    |   id_ou_array
        {
            String idName = $id_ou_array.text;
            int bracketPos = idName.indexOf('[');
            if (bracketPos != -1) {
                idName = idName.substring(0, bracketPos);
            }
            EasySymbol s = getSymbol(idName);
            if (s == null) throw new EasySemanticException("Symbol " + idName + " not declared");
            $type = s.getType();
            $text = $id_ou_array.text;
        }
    ;

id_ou_array returns [String text]
    : ID { $text = $ID.text; }
      (AC e=expr FC { $text += "[" + $e.text + "]"; })?
    ;

arg_list : expr (VIR expr)* ;
    
chamada_funcao returns [String text]
    : ID { _funcaoNome = $ID.text; verificaID(_funcaoNome); }
      AP
      { 
          _argumentosLista = new ArrayList<String>(); 
      }
      (e=expr { _argumentosLista.add($e.text); } (VIR e2=expr { _argumentosLista.add($e2.text); })* )?
      FP
      {
          StringBuilder sb = new StringBuilder(_funcaoNome).append("(");
          if (_argumentosLista != null) {
            for (int i = 0; i < _argumentosLista.size(); i++) {
                sb.append(_argumentosLista.get(i));
                if (i < _argumentosLista.size() - 1) {
                    sb.append(", ");
                }
            }
          }
          sb.append(")");
          $text = sb.toString();
          _funcaoNome = null; // Manter a limpeza da variável global é uma boa prática
      }
    ;

TIPO_NUMERO   : 'numero';
TIPO_TEXTO    : 'texto';
TIPO_BOOLEANO : 'booleano';
TIPO_VOID     : 'vazio';

FUNCAO_KW : 'funcao'; 
PROCEDIMENTO_KW : 'procedimento';
RETORNO_KW : 'retorne';
NAO_KW: 'nao';
FACA_KW: 'faca';
			
AP	: '(';
AC : '[' ; 
FC : ']' ; 
FP	: ')';
SC	: ';';
OP	: '+' | '-' | '*' | '/' | '%';
ATTR : '=';
VIR  : ',' ;
ACH  : '{' ;
FCH  : '}' ;
DP   : ':' ;

OPBOOL : 'e' | 'ou';
STRING_LITERAL : '"' (~'"')* '"' ;
BOOLEANO : 'verdadeiro' | 'falso';
	 
OPREL : '>' | '<' | '>=' | '<=' | '==' | '!=' ;
      
ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;
	
NUMBER	: [0-9]+ ('.' [0-9]+)?
	;

COMMENT: '//' ~[\r\n]* -> skip;
		
WS	: (' ' | '\t' | '\n' | '\r') -> skip;
