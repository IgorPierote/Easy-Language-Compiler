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

prog : 'programa'
       {
           curThread = new ArrayList<AbstractCommand>();
           stack.push(curThread); 
		   initScope();
       }
       decl 
       rotinas
       bloco 
       'fimprog;'
       {
		   program.setVarTable(globalSymbolTable);
           program.setComandos(stack.pop());
       }
     ;

rotinas : (funcao | procedimento)* ;

funcao : FUNCAO_KW tipo{
        int tipo_funcao;
        tipo_funcao = _tipo;
}
	nomeF=ID AP params=param_list FP ACH
         { 
             String nomeFuncao = $nomeF.text;
             if (!symbolTable.exists(nomeFuncao)) {
                 symbolTable.add(new EasyVariable(nomeFuncao, _tipo, null)); 
             } else {
                 throw new EasySemanticException("Função " + nomeFuncao + " já declarada.");
             }
             enterScope(); 
             if ($params.listaRetorno != null) {
                 for (EasySymbol p : $params.listaRetorno) {
                    symbolTable.add(p); 
                 }
             }
             curThread = new ArrayList<AbstractCommand>();
             stack.push(curThread);
         }
         bloco_funcao
         FCH
         { 
             ArrayList<AbstractCommand> corpoComandos = stack.pop(); 
             CommandFuncao cmd = new CommandFuncao(nomeFuncao, tipo_funcao, $params.listaRetorno, corpoComandos);
             stack.peek().add(cmd);
             exitScope(); 
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

procedimento : PROCEDIMENTO_KW TIPO_VOID ID AP param_list FP ACH
               { enterScope(); }
               bloco_funcao
               FCH
               { exitScope(); }
             ;

bloco_funcao : 
    decl_local 
    (cmd | cmd_retorno)* ;

cmd_retorno : RETORNO_KW { _exprContent = ""; } expr SC 
              { 
                  CommandRetorno cmd = new CommandRetorno(_exprContent); 
                  stack.peek().add(cmd);
                  _exprContent = "";
              }
            ;
		
decl    :  (declaravar | declaracao_array)* ;

declaravar :  tipo ID  {
	                  _varName = _input.LT(-1).getText();
	                  EasyVariable novoSimbolo = new EasyVariable(_varName, _tipo, _varValue);
					  if (!symbolTable.exists(_varName)){
	                     		symbolTable.add(novoSimbolo);    
	                 		} else {
	                     		throw new EasySemanticException("Symbol "+_varName+" already declared");
	                 		}
	                 		CommandDeclaracaoLocal cmd = new CommandDeclaracaoLocal(novoSimbolo);
	                 		stack.peek().add(cmd);
                    } 
              (  VIR ID {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new EasyVariable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new EasySemanticException("Symbol "+_varName+" already declared");
	                  }
                    }
              )* 
               SC
           ;

decl_local : (declaravar | declaracao_array)* ;
           
tipo       : TIPO_NUMERO { _tipo = EasyVariable.NUMBER;  }
           | TIPO_TEXTO  { _tipo = EasyVariable.TEXT;  }
		   | TIPO_BOOLEANO   { _tipo = EasyVariable.BOOLEANO;  }
		   | TIPO_VOID   { _tipo = EasyVariable.VOID;  }
           ;

bloco	:	'bloco'
		ACH
		{
			enterScope();
			curThread = new ArrayList<AbstractCommand>();
			stack.push(curThread);
		}
		decl_local
		(cmd)*
		FCH
		{
			ArrayList<AbstractCommand> corpoDoBloco = stack.pop();
			CommandBlocoMain cmdBloco = new CommandBlocoMain(corpoDoBloco);
			stack.peek().add(cmdBloco);
			exitScope();
		}
		;

cmd:  cmdleitura  
 		|  cmdescrita 
 		|  cmdattrib
 		|  cmdselecao
		|  cmdEnquanto 
		|  cmdLaço
		| cmd_chamada
		;

cmd_chamada
    : ID { 
        _funcaoNome = _input.LT(-1).getText(); 
        verificaID(_funcaoNome);
        _exprContent = "";
      }
      AP
      { _argumentosLista = new ArrayList<String>(); } 
      (
          expr
          {
              _argumentosLista.add(_exprContent);
              _exprContent = "";
          }
          ( VIR expr { _argumentosLista.add(_exprContent); _exprContent = ""; } )*
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
			
cmdescrita: 'escreva' AP { _exprContent = ""; } expr FP SC
      {
          CommandEscrita cmd = new CommandEscrita(_exprContent);
          stack.peek().add(cmd);
      }
    ;
			
cmdattrib :
    id_ou_array
    {
         _exprID = _exprContent;
         String varName = _exprID;
         int bracketPos = _exprID.indexOf('[');
         if (bracketPos != -1) {
            varName = _exprID.substring(0, bracketPos);
         }
         EasySymbol var = getSymbol(varName);
         if (var == null) throw new EasySemanticException("Symbol " + varName + " not declared");
         _lastExprType = var.getType(); // Guarda o tipo da variável de destino
         _exprContent = "";
    }
    ATTR e=expr SC
    {
        // Compara o tipo da variável com o tipo da expressão
        if (_lastExprType != $e.type) {
            throw new EasySemanticException("Type mismatch for attribution command: expected type " + _lastExprType + " but got type " + $e.type);
        }
        CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
        stack.peek().add(cmd);
    }
    ;
			
cmdselecao : 'se' AP { _exprContent = ""; } e=expr FP ACH
             {
                if ($e.type != EasyVariable.BOOLEANO) {
                    throw new EasySemanticException("Conditional expression in 'se' must be boolean");
                }
                _exprDecision = _exprContent;
                curThread = new ArrayList<AbstractCommand>(); 
                stack.push(curThread); 
             }
             (cmd)+ 
             FCH
             { listaTrue = stack.pop(); listaFalse = null; } 
             ('senao' ACH
                 { 
                    curThread = new ArrayList<AbstractCommand>(); 
                    stack.push(curThread); 
                 }
                 (cmd+) 
                 FCH
                 { listaFalse = stack.pop(); }
             )?
	     {       
             CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
             stack.peek().add(cmd);
             _exprDecision = null; 
         }
         ;

cmdEnquanto : 	'enquanto' AP { _exprContent = ""; } e=expr FP 'faça' ACH
                {
                    if ($e.type != EasyVariable.BOOLEANO) {
                        throw new EasySemanticException("While condition must be a boolean expression");
                    }
                    _exprDecision = _exprContent;
                    curThread = new ArrayList<AbstractCommand>();
                    stack.push(curThread); 
                }
                (cmd)+ 
                FCH
                {
                    ArrayList<AbstractCommand> listaComandosDoWhile = stack.pop();
                    CommandEnquanto cmd = new CommandEnquanto(_exprDecision, listaComandosDoWhile);
                    stack.peek().add(cmd);
                }
            ;

cmdLaço : 'para' ID { String _varControle = $ID.text; verificaID(_varControle); } 'de' (v_inicial_id=ID | v_inicial_num=NUMBER) { String _valorInicial = $v_inicial_id.text != null ? $v_inicial_id.text : $v_inicial_num.text; } 'ate' (v_final_id=ID | v_final_num=NUMBER) {  String _valorFinal = $v_final_id.text != null ? $v_final_id.text : $v_final_num.text; } 'passo' (v_passo_id=ID | v_passo_num=NUMBER) {String _passo = $v_passo_id.text != null ? $v_passo_id.text : $v_passo_num.text; } DP ACH                            
            {
                curThread = new ArrayList<AbstractCommand>();
                stack.push(curThread); 
            }
            (cmd)+                         
            FCH                            
            {
                ArrayList<AbstractCommand> listaComandosDoPara = stack.pop();
                CommandLaço cmd = new CommandLaço(_varControle, _valorInicial, _valorFinal, _passo, listaComandosDoPara);
                stack.peek().add(cmd);
            }
        ;

declaracao_array
    : tipo ID { _varName = $ID.text; } AC NUMBER
      {
          int tamanho = Integer.parseInt($NUMBER.text); 
          if (getSymbol(_varName) != null){
               throw new EasySemanticException("Symbol "+_varName+" already declared");
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

expr returns [int type]
    : t1=termo_logico { $type = $t1.type; }
      (
        OPBOOL t2=termo_logico
        {
            if ($type != EasyVariable.BOOLEANO || $t2.type != EasyVariable.BOOLEANO) {
                throw new EasySemanticException("Logical operators require boolean operands");
            }
            _exprContent += " " + $OPBOOL.text + " " + _exprContent; // Corrigido para usar o conteúdo do termo
            $type = EasyVariable.BOOLEANO;
        }
      )*
    ;

termo_logico returns [int type]
    : t1=termo_relacional { $type = $t1.type; }
      (
        OPREL t2=termo_relacional
        {
            if ($type != $t2.type) {
                throw new EasySemanticException("Relational operators require operands of the same type");
            }
            _exprContent += " " + $OPREL.text + " " + _exprContent;
            $type = EasyVariable.BOOLEANO;
        }
      )*
    ;

termo_relacional returns [int type]
    : t1=termo_aritmetico { $type = $t1.type; }
      (
        OP t2=termo_aritmetico
        {
            if ($type != EasyVariable.NUMBER || $t2.type != EasyVariable.NUMBER) {
                throw new EasySemanticException("Arithmetic operators require numeric operands");
            }
            _exprContent += " " + $OP.text + " " + _exprContent;
            $type = EasyVariable.NUMBER;
        }
      )*
    ;

termo_aritmetico returns [int type]
    :   ID 
        {
            verificaID($ID.text);
            EasySymbol s = getSymbol($ID.text);
            $type = s.getType();
            _exprContent = $ID.text;
        }
    |   NUMBER
        {
            $type = EasyVariable.NUMBER;
            _exprContent = $NUMBER.text;
        }
    |   STRING_LITERAL
        {
            $type = EasyVariable.TEXT;
            _exprContent = $STRING_LITERAL.text;
        }
    |   BOOLEANO
        {
            $type = EasyVariable.BOOLEANO;
            _exprContent = $BOOLEANO.text;
        }
    |   NAO_KW termo_aritmetico
        {
            if ($termo_aritmetico.type != EasyVariable.BOOLEANO) {
                throw new EasySemanticException("'nao' operator requires a boolean operand");
            }
            _exprContent = "!(" + _exprContent + ")";
            $type = EasyVariable.BOOLEANO;
        }
    |   AP expr FP
        {
            $type = $expr.type;
            _exprContent = "(" + _exprContent + ")";
        }
    |   chamada_funcao
        {
            EasySymbol s = getSymbol(_funcaoNome);
            $type = s.getType();
        }
    |   id_ou_array
        {
            String text = $id_ou_array.text;
            String varName = text;
            int bracketPos = text.indexOf('[');
            if (bracketPos != -1) {
                varName = text.substring(0, bracketPos);
            }
            EasySymbol s = getSymbol(varName);
            $type = s.getType();
        }
    ;

id_ou_array : ID {
    verificaID($ID.text);
    _exprContent = $ID.text;
}
(AC { _exprContent += "["; } expr { _exprContent += "]"; } FC)?
;

arg_list : expr (VIR expr)* ;
    
chamada_funcao
    : ID { _funcaoNome = $ID.text; verificaID(_funcaoNome); }
      AP
      { 
          String _exprContentSAVE = _exprContent; 
          _exprContent = "";
          _argumentosLista = new ArrayList<String>(); 
      }
      (arg_list)?
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
          _exprContent = _exprContentSAVE + sb.toString(); 
          _funcaoNome = null;
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
			
AP	: '(';
AC : '[' ; 
FC : ']' ; 
FP	: ')';
SC	: ';';
OP	: '+' | '-' | '*' | '/';
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
		
WS	: (' ' | '\t' | '\n' | '\r') -> skip;
