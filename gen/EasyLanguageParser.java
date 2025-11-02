// Generated from C:/Users/Piero/Desktop/EasyLanguage-main/resources/EasyLanguage.g4 by ANTLR 4.13.2

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EasyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, TIPO_NUMERO=13, TIPO_TEXTO=14, TIPO_BOOLEANO=15, 
		TIPO_VOID=16, FUNCAO_KW=17, PROCEDIMENTO_KW=18, RETORNO_KW=19, NAO_KW=20, 
		FACA_KW=21, AP=22, AC=23, FC=24, FP=25, SC=26, OP=27, ATTR=28, VIR=29, 
		ACH=30, FCH=31, DP=32, OPBOOL=33, STRING_LITERAL=34, BOOLEANO=35, OPREL=36, 
		ID=37, NUMBER=38, COMMENT=39, WS=40;
	public static final int
		RULE_prog = 0, RULE_rotinas = 1, RULE_funcao = 2, RULE_param_list = 3, 
		RULE_procedimento = 4, RULE_bloco_funcao = 5, RULE_cmd_retorno = 6, RULE_decl = 7, 
		RULE_declaravar = 8, RULE_var_decl = 9, RULE_tipo = 10, RULE_bloco = 11, 
		RULE_cmd = 12, RULE_cmd_chamada = 13, RULE_cmdleitura = 14, RULE_cmdescrita = 15, 
		RULE_cmdattrib = 16, RULE_cmdselecao = 17, RULE_cmdEnquanto = 18, RULE_cmdLaço = 19, 
		RULE_declaracao_array = 20, RULE_expr = 21, RULE_termo_logico = 22, RULE_termo_relacional = 23, 
		RULE_termo_aritmetico = 24, RULE_id_ou_array = 25, RULE_arg_list = 26, 
		RULE_chamada_funcao = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "rotinas", "funcao", "param_list", "procedimento", "bloco_funcao", 
			"cmd_retorno", "decl", "declaravar", "var_decl", "tipo", "bloco", "cmd", 
			"cmd_chamada", "cmdleitura", "cmdescrita", "cmdattrib", "cmdselecao", 
			"cmdEnquanto", "cmdLaço", "declaracao_array", "expr", "termo_logico", 
			"termo_relacional", "termo_aritmetico", "id_ou_array", "arg_list", "chamada_funcao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'bloco'", "'leia'", "'escreva'", "'se'", 
			"'senao'", "'enquanto'", "'para'", "'de'", "'ate'", "'passo'", "'numero'", 
			"'texto'", "'booleano'", "'vazio'", "'funcao'", "'procedimento'", "'retorne'", 
			"'nao'", "'faca'", "'('", "'['", "']'", "')'", "';'", null, "'='", "','", 
			"'{'", "'}'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TIPO_NUMERO", "TIPO_TEXTO", "TIPO_BOOLEANO", "TIPO_VOID", "FUNCAO_KW", 
			"PROCEDIMENTO_KW", "RETORNO_KW", "NAO_KW", "FACA_KW", "AP", "AC", "FC", 
			"FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "DP", "OPBOOL", "STRING_LITERAL", 
			"BOOLEANO", "OPREL", "ID", "NUMBER", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EasyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public EasyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public RotinasContext rotinas() {
			return getRuleContext(RotinasContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);

			        initScope();
			        curThread = new ArrayList<AbstractCommand>();
			        stack.push(curThread);
			    
			setState(58);
			decl();
			setState(59);
			rotinas();
			setState(60);
			bloco();
			setState(61);
			match(T__1);

			        program.setVarTable(globalSymbolTable);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RotinasContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<ProcedimentoContext> procedimento() {
			return getRuleContexts(ProcedimentoContext.class);
		}
		public ProcedimentoContext procedimento(int i) {
			return getRuleContext(ProcedimentoContext.class,i);
		}
		public RotinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotinas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterRotinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitRotinas(this);
		}
	}

	public final RotinasContext rotinas() throws RecognitionException {
		RotinasContext _localctx = new RotinasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rotinas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCAO_KW || _la==PROCEDIMENTO_KW) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCAO_KW:
					{
					setState(64);
					funcao();
					}
					break;
				case PROCEDIMENTO_KW:
					{
					setState(65);
					procedimento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public Token nomeF;
		public Param_listContext params;
		public TerminalNode FUNCAO_KW() { return getToken(EasyLanguageParser.FUNCAO_KW, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public Bloco_funcaoContext bloco_funcao() {
			return getRuleContext(Bloco_funcaoContext.class,0);
		}
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(FUNCAO_KW);
			setState(72);
			tipo();

			        int tipo_funcao;
			        tipo_funcao = _tipo;

			setState(74);
			((FuncaoContext)_localctx).nomeF = match(ID);
			 
			             String nomeFuncao = (((FuncaoContext)_localctx).nomeF!=null?((FuncaoContext)_localctx).nomeF.getText():null);
			             if (getSymbol(nomeFuncao) != null) {
			                 throw new EasySemanticException("Symbol " + nomeFuncao + " already declared");
			             }
			             globalSymbolTable.add(new EasyVariable(nomeFuncao, _tipo, null));
			             enterScope(); // Entra no novo escopo ANTES de processar os parâmetros
			         
			setState(76);
			match(AP);
			setState(77);
			((FuncaoContext)_localctx).params = param_list();
			setState(78);
			match(FP);
			 
			             if (((FuncaoContext)_localctx).params.listaRetorno != null) {
			                 for (EasySymbol p : ((FuncaoContext)_localctx).params.listaRetorno) {
			                    symbolTable.add(p); // Adiciona os parâmetros ao novo escopo
			                 }
			             }
			             curThread = new ArrayList<AbstractCommand>();
			             stack.push(curThread);
			         
			setState(80);
			match(ACH);
			setState(81);
			bloco_funcao();
			setState(82);
			match(FCH);
			 
			             ArrayList<AbstractCommand> corpoComandos = stack.pop(); 
			             CommandFuncao cmd = new CommandFuncao((((FuncaoContext)_localctx).nomeF!=null?((FuncaoContext)_localctx).nomeF.getText():null), tipo_funcao, ((FuncaoContext)_localctx).params.listaRetorno, corpoComandos);
			             cmd.setGlobal(true); // <--- AGORA ESTÁ AQUI!
			             program.addFuncao(cmd); // Adiciona à lista de funções
			             exitScope(); // Sai do escopo da função
			         
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_listContext extends ParserRuleContext {
		public List<EasySymbol> listaRetorno;
		public Token ID;
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param_list);

		    ((Param_listContext)_localctx).listaRetorno =  new ArrayList<EasySymbol>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) {
				{
				setState(85);
				tipo();
				setState(86);
				((Param_listContext)_localctx).ID = match(ID);

				            String paramName = (((Param_listContext)_localctx).ID!=null?((Param_listContext)_localctx).ID.getText():null);
				            EasyVariable paramSymbol = new EasyVariable(paramName, _tipo, null); 
				            _localctx.listaRetorno.add(paramSymbol);
				        
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIR) {
					{
					{
					setState(88);
					match(VIR);
					setState(89);
					tipo();
					setState(90);
					((Param_listContext)_localctx).ID = match(ID);

					            paramName = (((Param_listContext)_localctx).ID!=null?((Param_listContext)_localctx).ID.getText():null);
					            paramSymbol = new EasyVariable(paramName, _tipo, null);
					            _localctx.listaRetorno.add(paramSymbol);
					        
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimentoContext extends ParserRuleContext {
		public Token nomeP;
		public Param_listContext params;
		public TerminalNode PROCEDIMENTO_KW() { return getToken(EasyLanguageParser.PROCEDIMENTO_KW, 0); }
		public TerminalNode TIPO_VOID() { return getToken(EasyLanguageParser.TIPO_VOID, 0); }
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public Bloco_funcaoContext bloco_funcao() {
			return getRuleContext(Bloco_funcaoContext.class,0);
		}
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(PROCEDIMENTO_KW);
			setState(101);
			match(TIPO_VOID);
			setState(102);
			((ProcedimentoContext)_localctx).nomeP = match(ID);
			 
			                   if (getSymbol((((ProcedimentoContext)_localctx).nomeP!=null?((ProcedimentoContext)_localctx).nomeP.getText():null)) != null) {
			                       throw new EasySemanticException("Symbol " + (((ProcedimentoContext)_localctx).nomeP!=null?((ProcedimentoContext)_localctx).nomeP.getText():null) + " already declared");
			                   }
			                   globalSymbolTable.add(new EasyVariable((((ProcedimentoContext)_localctx).nomeP!=null?((ProcedimentoContext)_localctx).nomeP.getText():null), EasyVariable.VOID, null));
			                   enterScope(); 
			               
			setState(104);
			match(AP);
			setState(105);
			((ProcedimentoContext)_localctx).params = param_list();
			setState(106);
			match(FP);

			                   if (((ProcedimentoContext)_localctx).params.listaRetorno != null) {
			                       for (EasySymbol p : ((ProcedimentoContext)_localctx).params.listaRetorno) {
			                           symbolTable.add(p);
			                       }
			                   }
			                   curThread = new ArrayList<AbstractCommand>();
			                   stack.push(curThread);
			               
			setState(108);
			match(ACH);
			setState(109);
			bloco_funcao();
			setState(110);
			match(FCH);

			                   ArrayList<AbstractCommand> corpo = stack.pop();
			                   CommandFuncao cmd = new CommandFuncao((((ProcedimentoContext)_localctx).nomeP!=null?((ProcedimentoContext)_localctx).nomeP.getText():null), EasyVariable.VOID, ((ProcedimentoContext)_localctx).params.listaRetorno, corpo);
			                   cmd.setGlobal(true); // <--- AGORA ESTÁ AQUI!
			                   program.addFuncao(cmd);
			                   exitScope();
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloco_funcaoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<Cmd_retornoContext> cmd_retorno() {
			return getRuleContexts(Cmd_retornoContext.class);
		}
		public Cmd_retornoContext cmd_retorno(int i) {
			return getRuleContext(Cmd_retornoContext.class,i);
		}
		public Bloco_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterBloco_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitBloco_funcao(this);
		}
	}

	public final Bloco_funcaoContext bloco_funcao() throws RecognitionException {
		Bloco_funcaoContext _localctx = new Bloco_funcaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439601520L) != 0)) {
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__4:
				case T__5:
				case T__7:
				case T__8:
				case TIPO_NUMERO:
				case TIPO_TEXTO:
				case TIPO_BOOLEANO:
				case TIPO_VOID:
				case ID:
					{
					setState(113);
					cmd();
					}
					break;
				case RETORNO_KW:
					{
					setState(114);
					cmd_retorno();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_retornoContext extends ParserRuleContext {
		public ExprContext e;
		public TerminalNode RETORNO_KW() { return getToken(EasyLanguageParser.RETORNO_KW, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cmd_retornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmd_retorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmd_retorno(this);
		}
	}

	public final Cmd_retornoContext cmd_retorno() throws RecognitionException {
		Cmd_retornoContext _localctx = new Cmd_retornoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(RETORNO_KW);
			setState(121);
			((Cmd_retornoContext)_localctx).e = expr();
			setState(122);
			match(SC);
			 
			                  CommandRetorno cmd = new CommandRetorno(((Cmd_retornoContext)_localctx).e.text); 
			                  stack.peek().add(cmd);
			              
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public List<Declaracao_arrayContext> declaracao_array() {
			return getRuleContexts(Declaracao_arrayContext.class);
		}
		public Declaracao_arrayContext declaracao_array(int i) {
			return getRuleContext(Declaracao_arrayContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) {
				{
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(125);
					declaravar();
					}
					break;
				case 2:
					{
					setState(126);
					declaracao_array();
					}
					break;
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			tipo();
			setState(133);
			var_decl();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(134);
				match(VIR);
				setState(135);
				var_decl();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public Token ID;
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((Var_declContext)_localctx).ID = match(ID);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR:
				{
				setState(144);
				match(ATTR);
				setState(145);
				((Var_declContext)_localctx).e = expr();

				            // Declaração com inicialização: numero x = 10;
				            _varName = (((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null);
				            if (getSymbol(_varName) != null && scopeStack.peek().exists(_varName)) {
				                throw new EasySemanticException("Symbol " + _varName + " already declared in this scope");
				            }
				            if (_tipo != ((Var_declContext)_localctx).e.type) {
				                throw new EasySemanticException("Type mismatch for variable " + _varName + ". Expected " + _tipo + " but got " + ((Var_declContext)_localctx).e.type);
				            }
				            EasyVariable novoSimbolo = new EasyVariable(_varName, _tipo, null);
				            symbolTable.add(novoSimbolo);
				            
				            // Adiciona CommandDeclaracaoLocal SOMENTE se não for o escopo global
				            if (scopeStack.size() > 1) { 
				                CommandDeclaracaoLocal cmdDecl = new CommandDeclaracaoLocal(novoSimbolo);
				                stack.peek().add(cmdDecl);
				            }
				            
				            CommandAtribuicao cmdAttr = new CommandAtribuicao(_varName, ((Var_declContext)_localctx).e.text);
				            stack.peek().add(cmdAttr);
				        
				}
				break;
			case SC:
			case VIR:
				{
				 // Declaração sem inicialização: numero x;
				            _varName = (((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null);
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
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPO_NUMERO() { return getToken(EasyLanguageParser.TIPO_NUMERO, 0); }
		public TerminalNode TIPO_TEXTO() { return getToken(EasyLanguageParser.TIPO_TEXTO, 0); }
		public TerminalNode TIPO_BOOLEANO() { return getToken(EasyLanguageParser.TIPO_BOOLEANO, 0); }
		public TerminalNode TIPO_VOID() { return getToken(EasyLanguageParser.TIPO_VOID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(TIPO_NUMERO);
				 _tipo = EasyVariable.NUMBER;  
				}
				break;
			case TIPO_TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(TIPO_TEXTO);
				 _tipo = EasyVariable.TEXT;  
				}
				break;
			case TIPO_BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(TIPO_BOOLEANO);
				 _tipo = EasyVariable.BOOLEANO;  
				}
				break;
			case TIPO_VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(TIPO_VOID);
				 _tipo = EasyVariable.VOID;  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__2);
			setState(162);
			match(ACH);

						enterScope();
						// A pilha de comandos principal já foi criada no 'prog'
					
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439077232L) != 0)) {
				{
				{
				setState(164);
				cmd();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(FCH);

						program.setComandos(stack.pop());
						exitScope();
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdLaçoContext cmdLaço() {
			return getRuleContext(CmdLaçoContext.class,0);
		}
		public Cmd_chamadaContext cmd_chamada() {
			return getRuleContext(Cmd_chamadaContext.class,0);
		}
		public DeclaravarContext declaravar() {
			return getRuleContext(DeclaravarContext.class,0);
		}
		public Declaracao_arrayContext declaracao_array() {
			return getRuleContext(Declaracao_arrayContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmd);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				cmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				cmdescrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				cmdattrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				cmdselecao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				cmdEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				cmdLaço();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				cmd_chamada();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				declaravar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				declaracao_array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_chamadaContext extends ParserRuleContext {
		public ExprContext e;
		public ExprContext e2;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public Cmd_chamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmd_chamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmd_chamada(this);
		}
	}

	public final Cmd_chamadaContext cmd_chamada() throws RecognitionException {
		Cmd_chamadaContext _localctx = new Cmd_chamadaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmd_chamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			 
			        _funcaoNome = _input.LT(-1).getText(); 
			        verificaID(_funcaoNome);
			      
			setState(186);
			match(AP);
			 _argumentosLista = new ArrayList<String>(); 
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 463861710848L) != 0)) {
				{
				setState(188);
				((Cmd_chamadaContext)_localctx).e = expr();

				              _argumentosLista.add(((Cmd_chamadaContext)_localctx).e.text);
				          
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIR) {
					{
					{
					setState(190);
					match(VIR);
					setState(191);
					((Cmd_chamadaContext)_localctx).e2 = expr();
					 _argumentosLista.add(((Cmd_chamadaContext)_localctx).e2.text); 
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201);
			match(FP);
			setState(202);
			match(SC);

			          CommandChamada cmd = new CommandChamada(_funcaoNome, _argumentosLista);
			          stack.peek().add(cmd);
			          _funcaoNome = null;
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdleituraContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__3);
			setState(206);
			match(AP);
			setState(207);
			((CmdleituraContext)_localctx).ID = match(ID);
			 verificaID((((CmdleituraContext)_localctx).ID!=null?((CmdleituraContext)_localctx).ID.getText():null)); _readID = (((CmdleituraContext)_localctx).ID!=null?((CmdleituraContext)_localctx).ID.getText():null); 
			setState(209);
			match(FP);
			setState(210);
			match(SC);

			              	EasyVariable var = (EasyVariable)getSymbol(_readID);
			              	CommandLeitura cmd = new CommandLeitura(_readID, var);
			              	stack.peek().add(cmd);
			              
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdescritaContext extends ParserRuleContext {
		public ExprContext e;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__4);
			setState(214);
			match(AP);
			setState(215);
			((CmdescritaContext)_localctx).e = expr();
			setState(216);
			match(FP);
			setState(217);
			match(SC);

			          CommandEscrita cmd = new CommandEscrita(((CmdescritaContext)_localctx).e.text);
			          stack.peek().add(cmd);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdattribContext extends ParserRuleContext {
		public Id_ou_arrayContext id_ou_array;
		public ExprContext e;
		public Id_ou_arrayContext id_ou_array() {
			return getRuleContext(Id_ou_arrayContext.class,0);
		}
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((CmdattribContext)_localctx).id_ou_array = id_ou_array();

			         _exprID = ((CmdattribContext)_localctx).id_ou_array.text;
			         String varName = _exprID;
			         int bracketPos = _exprID.indexOf('[');
			         if (bracketPos != -1) {
			            varName = _exprID.substring(0, bracketPos);
			         }
			         EasySymbol var = getSymbol(varName);
			         if (var == null) throw new EasySemanticException("Symbol " + varName + " not declared");
			         _lastExprType = var.getType(); // Guarda o tipo da variável de destino
			    
			setState(222);
			match(ATTR);
			setState(223);
			((CmdattribContext)_localctx).e = expr();
			setState(224);
			match(SC);

			        // Compara o tipo da variável com o tipo da expressão
			        if (_lastExprType != ((CmdattribContext)_localctx).e.type) {
			            throw new EasySemanticException("Type mismatch for attribution command: expected type " + _lastExprType + " but got type " + ((CmdattribContext)_localctx).e.type);
			        }
			        CommandAtribuicao cmd = new CommandAtribuicao(_exprID, ((CmdattribContext)_localctx).e.text);
			        stack.peek().add(cmd);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdselecaoContext extends ParserRuleContext {
		public ExprContext e;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(EasyLanguageParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(EasyLanguageParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(EasyLanguageParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(EasyLanguageParser.FCH, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__5);
			setState(228);
			match(AP);
			setState(229);
			((CmdselecaoContext)_localctx).e = expr();
			setState(230);
			match(FP);
			setState(231);
			match(ACH);

			                if (((CmdselecaoContext)_localctx).e.type != EasyVariable.BOOLEANO) {
			                    throw new EasySemanticException("Conditional expression in 'se' must be boolean");
			                }
			                _exprDecision = ((CmdselecaoContext)_localctx).e.text;
			                curThread = new ArrayList<AbstractCommand>(); 
			                stack.push(curThread); 
			             
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439077232L) != 0)) {
				{
				{
				setState(233);
				cmd();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(FCH);
			 listaTrue = stack.pop(); listaFalse = null; 
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(241);
				match(T__6);
				setState(242);
				match(ACH);
				 
				                    curThread = new ArrayList<AbstractCommand>(); 
				                    stack.push(curThread); 
				                 
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439077232L) != 0)) {
					{
					{
					setState(244);
					cmd();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(FCH);
				 listaFalse = stack.pop(); 
				}
			}

			       
			             CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
			             stack.peek().add(cmd);
			             _exprDecision = null; 
			         
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEnquantoContext extends ParserRuleContext {
		public ExprContext e;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FACA_KW() { return getToken(EasyLanguageParser.FACA_KW, 0); }
		public TerminalNode DP() { return getToken(EasyLanguageParser.DP, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__7);
			setState(257);
			match(AP);
			setState(258);
			((CmdEnquantoContext)_localctx).e = expr();
			setState(259);
			match(FP);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FACA_KW) {
				{
				setState(260);
				match(FACA_KW);
				setState(261);
				match(DP);
				}
			}

			setState(264);
			match(ACH);

			                    if (((CmdEnquantoContext)_localctx).e.type != EasyVariable.BOOLEANO) {
			                        throw new EasySemanticException("While condition must be a boolean expression");
			                    }
			                    _exprDecision = ((CmdEnquantoContext)_localctx).e.text;
			                    curThread = new ArrayList<AbstractCommand>();
			                    stack.push(curThread);
			                
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439077232L) != 0)) {
				{
				{
				setState(266);
				cmd();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(FCH);

			                    ArrayList<AbstractCommand> listaComandosDoWhile = stack.pop();
			                    CommandEnquanto cmd = new CommandEnquanto(_exprDecision, listaComandosDoWhile);
			                    stack.peek().add(cmd);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLaçoContext extends ParserRuleContext {
		public Token ID;
		public Token v_inicial_id;
		public Token v_inicial_num;
		public Token v_final_id;
		public Token v_final_num;
		public Token v_passo_id;
		public Token v_passo_num;
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public TerminalNode DP() { return getToken(EasyLanguageParser.DP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(EasyLanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(EasyLanguageParser.NUMBER, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdLaçoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLaço; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdLaço(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdLaço(this);
		}
	}

	public final CmdLaçoContext cmdLaço() throws RecognitionException {
		CmdLaçoContext _localctx = new CmdLaçoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdLaço);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__8);
			setState(276);
			((CmdLaçoContext)_localctx).ID = match(ID);
			 
			                String _varControle = (((CmdLaçoContext)_localctx).ID!=null?((CmdLaçoContext)_localctx).ID.getText():null);
			                enterScope(); // Entra no escopo do laço
			                symbolTable.add(new EasyVariable(_varControle, EasyVariable.NUMBER, null)); // Adiciona a variável de controle ao escopo
			            
			setState(278);
			match(T__9);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(279);
				((CmdLaçoContext)_localctx).v_inicial_id = match(ID);
				}
				break;
			case NUMBER:
				{
				setState(280);
				((CmdLaçoContext)_localctx).v_inicial_num = match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 String _valorInicial = (((CmdLaçoContext)_localctx).v_inicial_id!=null?((CmdLaçoContext)_localctx).v_inicial_id.getText():null) != null ? (((CmdLaçoContext)_localctx).v_inicial_id!=null?((CmdLaçoContext)_localctx).v_inicial_id.getText():null) : (((CmdLaçoContext)_localctx).v_inicial_num!=null?((CmdLaçoContext)_localctx).v_inicial_num.getText():null); 
			setState(284);
			match(T__10);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(285);
				((CmdLaçoContext)_localctx).v_final_id = match(ID);
				}
				break;
			case NUMBER:
				{
				setState(286);
				((CmdLaçoContext)_localctx).v_final_num = match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			  String _valorFinal = (((CmdLaçoContext)_localctx).v_final_id!=null?((CmdLaçoContext)_localctx).v_final_id.getText():null) != null ? (((CmdLaçoContext)_localctx).v_final_id!=null?((CmdLaçoContext)_localctx).v_final_id.getText():null) : (((CmdLaçoContext)_localctx).v_final_num!=null?((CmdLaçoContext)_localctx).v_final_num.getText():null); 
			setState(290);
			match(T__11);
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(291);
				((CmdLaçoContext)_localctx).v_passo_id = match(ID);
				}
				break;
			case NUMBER:
				{
				setState(292);
				((CmdLaçoContext)_localctx).v_passo_num = match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			String _passo = (((CmdLaçoContext)_localctx).v_passo_id!=null?((CmdLaçoContext)_localctx).v_passo_id.getText():null) != null ? (((CmdLaçoContext)_localctx).v_passo_id!=null?((CmdLaçoContext)_localctx).v_passo_id.getText():null) : (((CmdLaçoContext)_localctx).v_passo_num!=null?((CmdLaçoContext)_localctx).v_passo_num.getText():null); 
			setState(296);
			match(DP);
			setState(297);
			match(ACH);

			                curThread = new ArrayList<AbstractCommand>();
			                stack.push(curThread); 
			            
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439077232L) != 0)) {
				{
				{
				setState(299);
				cmd();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(FCH);

			                ArrayList<AbstractCommand> listaComandosDoPara = stack.pop();
			                CommandLaço cmd = new CommandLaço((((CmdLaçoContext)_localctx).ID!=null?((CmdLaçoContext)_localctx).ID.getText():null), _valorInicial, _valorFinal, _passo, listaComandosDoPara);
			                exitScope(); // Sai do escopo do laço
			                stack.peek().add(cmd);
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_arrayContext extends ParserRuleContext {
		public Token ID;
		public Token NUMBER;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public Declaracao_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterDeclaracao_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitDeclaracao_array(this);
		}
	}

	public final Declaracao_arrayContext declaracao_array() throws RecognitionException {
		Declaracao_arrayContext _localctx = new Declaracao_arrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracao_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			tipo();
			setState(309);
			((Declaracao_arrayContext)_localctx).ID = match(ID);
			 _varName = (((Declaracao_arrayContext)_localctx).ID!=null?((Declaracao_arrayContext)_localctx).ID.getText():null); 
			setState(311);
			match(AC);
			setState(312);
			((Declaracao_arrayContext)_localctx).NUMBER = match(NUMBER);

			          int tamanho = Integer.parseInt((((Declaracao_arrayContext)_localctx).NUMBER!=null?((Declaracao_arrayContext)_localctx).NUMBER.getText():null)); 
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
			      
			setState(314);
			match(FC);
			setState(315);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public int type;
		public String text;
		public Termo_logicoContext t1;
		public Token op;
		public Termo_logicoContext t2;
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<TerminalNode> OPBOOL() { return getTokens(EasyLanguageParser.OPBOOL); }
		public TerminalNode OPBOOL(int i) {
			return getToken(EasyLanguageParser.OPBOOL, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((ExprContext)_localctx).t1 = termo_logico();
			 ((ExprContext)_localctx).type =  ((ExprContext)_localctx).t1.type; ((ExprContext)_localctx).text =  ((ExprContext)_localctx).t1.text; 
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPBOOL) {
				{
				{
				setState(319);
				((ExprContext)_localctx).op = match(OPBOOL);
				setState(320);
				((ExprContext)_localctx).t2 = termo_logico();

				            if (_localctx.type != EasyVariable.BOOLEANO || ((ExprContext)_localctx).t2.type != EasyVariable.BOOLEANO) {
				                throw new EasySemanticException("Logical operators require boolean operands");
				            }
				            String operator = (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("e") ? "&&" : "||";
				            ((ExprContext)_localctx).text =  _localctx.text + " " + operator + " " + ((ExprContext)_localctx).t2.text;
				            ((ExprContext)_localctx).type =  EasyVariable.BOOLEANO;
				        
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_logicoContext extends ParserRuleContext {
		public int type;
		public String text;
		public Termo_relacionalContext t1;
		public Token op;
		public Termo_relacionalContext t2;
		public List<Termo_relacionalContext> termo_relacional() {
			return getRuleContexts(Termo_relacionalContext.class);
		}
		public Termo_relacionalContext termo_relacional(int i) {
			return getRuleContext(Termo_relacionalContext.class,i);
		}
		public List<TerminalNode> OPREL() { return getTokens(EasyLanguageParser.OPREL); }
		public TerminalNode OPREL(int i) {
			return getToken(EasyLanguageParser.OPREL, i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((Termo_logicoContext)_localctx).t1 = termo_relacional();
			 ((Termo_logicoContext)_localctx).type =  ((Termo_logicoContext)_localctx).t1.type; ((Termo_logicoContext)_localctx).text =  ((Termo_logicoContext)_localctx).t1.text; 
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPREL) {
				{
				{
				setState(330);
				((Termo_logicoContext)_localctx).op = match(OPREL);
				setState(331);
				((Termo_logicoContext)_localctx).t2 = termo_relacional();

				            if (_localctx.type != ((Termo_logicoContext)_localctx).t2.type) {
				                // Permite comparar numero com numero, texto com texto, etc.
				            }
				            ((Termo_logicoContext)_localctx).text =  _localctx.text + " " + (((Termo_logicoContext)_localctx).op!=null?((Termo_logicoContext)_localctx).op.getText():null) + " " + ((Termo_logicoContext)_localctx).t2.text;
				            ((Termo_logicoContext)_localctx).type =  EasyVariable.BOOLEANO;
				        
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_relacionalContext extends ParserRuleContext {
		public int type;
		public String text;
		public Termo_aritmeticoContext t1;
		public Token op;
		public Termo_aritmeticoContext t2;
		public List<Termo_aritmeticoContext> termo_aritmetico() {
			return getRuleContexts(Termo_aritmeticoContext.class);
		}
		public Termo_aritmeticoContext termo_aritmetico(int i) {
			return getRuleContext(Termo_aritmeticoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(EasyLanguageParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(EasyLanguageParser.OP, i);
		}
		public Termo_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTermo_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTermo_relacional(this);
		}
	}

	public final Termo_relacionalContext termo_relacional() throws RecognitionException {
		Termo_relacionalContext _localctx = new Termo_relacionalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termo_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((Termo_relacionalContext)_localctx).t1 = termo_aritmetico();
			 ((Termo_relacionalContext)_localctx).type =  ((Termo_relacionalContext)_localctx).t1.type; ((Termo_relacionalContext)_localctx).text =  ((Termo_relacionalContext)_localctx).t1.text; 
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(341);
				((Termo_relacionalContext)_localctx).op = match(OP);
				setState(342);
				((Termo_relacionalContext)_localctx).t2 = termo_aritmetico();

				            if (_localctx.type != EasyVariable.NUMBER || ((Termo_relacionalContext)_localctx).t2.type != EasyVariable.NUMBER) {
				                throw new EasySemanticException("Arithmetic operators require numeric operands");
				            }
				            ((Termo_relacionalContext)_localctx).text =  _localctx.text + " " + (((Termo_relacionalContext)_localctx).op!=null?((Termo_relacionalContext)_localctx).op.getText():null) + " " + ((Termo_relacionalContext)_localctx).t2.text;
				            ((Termo_relacionalContext)_localctx).type =  EasyVariable.NUMBER;
				        
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_aritmeticoContext extends ParserRuleContext {
		public int type;
		public String text;
		public Token ID;
		public Token NUMBER;
		public Token STRING_LITERAL;
		public Token BOOLEANO;
		public Termo_aritmeticoContext t;
		public ExprContext e;
		public Chamada_funcaoContext c;
		public Id_ou_arrayContext id_ou_array;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(EasyLanguageParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(EasyLanguageParser.BOOLEANO, 0); }
		public TerminalNode NAO_KW() { return getToken(EasyLanguageParser.NAO_KW, 0); }
		public Termo_aritmeticoContext termo_aritmetico() {
			return getRuleContext(Termo_aritmeticoContext.class,0);
		}
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public Id_ou_arrayContext id_ou_array() {
			return getRuleContext(Id_ou_arrayContext.class,0);
		}
		public Termo_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTermo_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTermo_aritmetico(this);
		}
	}

	public final Termo_aritmeticoContext termo_aritmetico() throws RecognitionException {
		Termo_aritmeticoContext _localctx = new Termo_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termo_aritmetico);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				((Termo_aritmeticoContext)_localctx).ID = match(ID);

				            verificaID((((Termo_aritmeticoContext)_localctx).ID!=null?((Termo_aritmeticoContext)_localctx).ID.getText():null));
				            EasySymbol s = getSymbol((((Termo_aritmeticoContext)_localctx).ID!=null?((Termo_aritmeticoContext)_localctx).ID.getText():null));
				            ((Termo_aritmeticoContext)_localctx).type =  s.getType();
				            ((Termo_aritmeticoContext)_localctx).text =  (((Termo_aritmeticoContext)_localctx).ID!=null?((Termo_aritmeticoContext)_localctx).ID.getText():null);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				((Termo_aritmeticoContext)_localctx).NUMBER = match(NUMBER);

				            ((Termo_aritmeticoContext)_localctx).type =  EasyVariable.NUMBER;
				            ((Termo_aritmeticoContext)_localctx).text =  (((Termo_aritmeticoContext)_localctx).NUMBER!=null?((Termo_aritmeticoContext)_localctx).NUMBER.getText():null);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				((Termo_aritmeticoContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);

				            ((Termo_aritmeticoContext)_localctx).type =  EasyVariable.TEXT;
				            ((Termo_aritmeticoContext)_localctx).text =  (((Termo_aritmeticoContext)_localctx).STRING_LITERAL!=null?((Termo_aritmeticoContext)_localctx).STRING_LITERAL.getText():null);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				((Termo_aritmeticoContext)_localctx).BOOLEANO = match(BOOLEANO);

				            ((Termo_aritmeticoContext)_localctx).type =  EasyVariable.BOOLEANO;
				            ((Termo_aritmeticoContext)_localctx).text =  (((Termo_aritmeticoContext)_localctx).BOOLEANO!=null?((Termo_aritmeticoContext)_localctx).BOOLEANO.getText():null).equals("verdadeiro") ? "true" : "false";
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(NAO_KW);
				setState(359);
				((Termo_aritmeticoContext)_localctx).t = termo_aritmetico();

				            if (((Termo_aritmeticoContext)_localctx).t.type != EasyVariable.BOOLEANO) {
				                throw new EasySemanticException("'nao' operator requires a boolean operand");
				            }
				            ((Termo_aritmeticoContext)_localctx).text =  "!(" + ((Termo_aritmeticoContext)_localctx).t.text + ")";
				            ((Termo_aritmeticoContext)_localctx).type =  EasyVariable.BOOLEANO;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(AP);
				setState(363);
				((Termo_aritmeticoContext)_localctx).e = expr();
				setState(364);
				match(FP);

				            ((Termo_aritmeticoContext)_localctx).type =  ((Termo_aritmeticoContext)_localctx).e.type;
				            ((Termo_aritmeticoContext)_localctx).text =  "(" + ((Termo_aritmeticoContext)_localctx).e.text + ")";
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				((Termo_aritmeticoContext)_localctx).c = chamada_funcao();

				            String funcName = ((Termo_aritmeticoContext)_localctx).c.text.substring(0, ((Termo_aritmeticoContext)_localctx).c.text.indexOf('('));
				            EasySymbol s = getSymbol(funcName);
				            if (s == null) throw new EasySemanticException("Function " + funcName + " not declared");
				            ((Termo_aritmeticoContext)_localctx).type =  s.getType();
				            ((Termo_aritmeticoContext)_localctx).text =  ((Termo_aritmeticoContext)_localctx).c.text;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(370);
				((Termo_aritmeticoContext)_localctx).id_ou_array = id_ou_array();

				            String idName = ((Termo_aritmeticoContext)_localctx).id_ou_array.text;
				            int bracketPos = idName.indexOf('[');
				            if (bracketPos != -1) {
				                idName = idName.substring(0, bracketPos);
				            }
				            EasySymbol s = getSymbol(idName);
				            if (s == null) throw new EasySemanticException("Symbol " + idName + " not declared");
				            ((Termo_aritmeticoContext)_localctx).type =  s.getType();
				            ((Termo_aritmeticoContext)_localctx).text =  ((Termo_aritmeticoContext)_localctx).id_ou_array.text;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_ou_arrayContext extends ParserRuleContext {
		public String text;
		public Token ID;
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Id_ou_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_ou_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterId_ou_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitId_ou_array(this);
		}
	}

	public final Id_ou_arrayContext id_ou_array() throws RecognitionException {
		Id_ou_arrayContext _localctx = new Id_ou_arrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_id_ou_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((Id_ou_arrayContext)_localctx).ID = match(ID);
			 ((Id_ou_arrayContext)_localctx).text =  (((Id_ou_arrayContext)_localctx).ID!=null?((Id_ou_arrayContext)_localctx).ID.getText():null); 
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AC) {
				{
				setState(377);
				match(AC);
				setState(378);
				((Id_ou_arrayContext)_localctx).e = expr();
				setState(379);
				match(FC);
				 _localctx.text += "[" + ((Id_ou_arrayContext)_localctx).e.text + "]"; 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			expr();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(385);
				match(VIR);
				setState(386);
				expr();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_funcaoContext extends ParserRuleContext {
		public String text;
		public Token ID;
		public ExprContext e;
		public ExprContext e2;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			((Chamada_funcaoContext)_localctx).ID = match(ID);
			 _funcaoNome = (((Chamada_funcaoContext)_localctx).ID!=null?((Chamada_funcaoContext)_localctx).ID.getText():null); verificaID(_funcaoNome); 
			setState(394);
			match(AP);
			 
			          _argumentosLista = new ArrayList<String>(); 
			      
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 463861710848L) != 0)) {
				{
				setState(396);
				((Chamada_funcaoContext)_localctx).e = expr();
				 _argumentosLista.add(((Chamada_funcaoContext)_localctx).e.text); 
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIR) {
					{
					{
					setState(398);
					match(VIR);
					setState(399);
					((Chamada_funcaoContext)_localctx).e2 = expr();
					 _argumentosLista.add(((Chamada_funcaoContext)_localctx).e2.text); 
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(409);
			match(FP);

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
			          ((Chamada_funcaoContext)_localctx).text =  sb.toString();
			          _funcaoNome = null; // Manter a limpeza da variável global é uma boa prática
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u019d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001C\b\u0001"+
		"\n\u0001\f\u0001F\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003^\b\u0003\n\u0003\f\u0003a\t\u0003\u0003\u0003c\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005w\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0080\b\u0007\n\u0007\f\u0007\u0083\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0089\b\b\n\b\f\b\u008c\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0096"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a0\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00a6\b\u000b\n\u000b\f\u000b\u00a9\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00b7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c3\b\r\n\r\f\r\u00c6\t\r"+
		"\u0003\r\u00c8\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00eb\b\u0011\n\u0011"+
		"\f\u0011\u00ee\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00f6\b\u0011\n\u0011\f\u0011\u00f9"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00fd\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0107\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u010c\b\u0012\n\u0012\f\u0012\u010f\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u011a\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0120\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0126\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u012d\b\u0013\n\u0013\f\u0013"+
		"\u0130\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0144\b\u0015\n\u0015\f\u0015\u0147\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u014f\b\u0016\n\u0016\f\u0016\u0152\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u015a\b\u0017"+
		"\n\u0017\f\u0017\u015d\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0176\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u017f"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0184\b\u001a"+
		"\n\u001a\f\u001a\u0187\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0193\b\u001b\n\u001b\f\u001b\u0196\t\u001b\u0003\u001b"+
		"\u0198\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0000"+
		"\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0246\u0000\u0000\u01af\u00008\u0001\u0000\u0000"+
		"\u0000\u0002D\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006"+
		"b\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000"+
		"\u0000\fx\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000"+
		"\u0010\u0084\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000\u0000\u0000"+
		"\u0014\u009f\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000"+
		"\u0018\u00b6\u0001\u0000\u0000\u0000\u001a\u00b8\u0001\u0000\u0000\u0000"+
		"\u001c\u00cd\u0001\u0000\u0000\u0000\u001e\u00d5\u0001\u0000\u0000\u0000"+
		" \u00dc\u0001\u0000\u0000\u0000\"\u00e3\u0001\u0000\u0000\u0000$\u0100"+
		"\u0001\u0000\u0000\u0000&\u0113\u0001\u0000\u0000\u0000(\u0134\u0001\u0000"+
		"\u0000\u0000*\u013d\u0001\u0000\u0000\u0000,\u0148\u0001\u0000\u0000\u0000"+
		".\u0153\u0001\u0000\u0000\u00000\u0175\u0001\u0000\u0000\u00002\u0177"+
		"\u0001\u0000\u0000\u00004\u0180\u0001\u0000\u0000\u00006\u0188\u0001\u0000"+
		"\u0000\u000089\u0005\u0001\u0000\u00009:\u0006\u0000\uffff\uffff\u0000"+
		":;\u0003\u000e\u0007\u0000;<\u0003\u0002\u0001\u0000<=\u0003\u0016\u000b"+
		"\u0000=>\u0005\u0002\u0000\u0000>?\u0006\u0000\uffff\uffff\u0000?\u0001"+
		"\u0001\u0000\u0000\u0000@C\u0003\u0004\u0002\u0000AC\u0003\b\u0004\u0000"+
		"B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0003\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0011\u0000\u0000"+
		"HI\u0003\u0014\n\u0000IJ\u0006\u0002\uffff\uffff\u0000JK\u0005%\u0000"+
		"\u0000KL\u0006\u0002\uffff\uffff\u0000LM\u0005\u0016\u0000\u0000MN\u0003"+
		"\u0006\u0003\u0000NO\u0005\u0019\u0000\u0000OP\u0006\u0002\uffff\uffff"+
		"\u0000PQ\u0005\u001e\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005\u001f\u0000"+
		"\u0000ST\u0006\u0002\uffff\uffff\u0000T\u0005\u0001\u0000\u0000\u0000"+
		"UV\u0003\u0014\n\u0000VW\u0005%\u0000\u0000W_\u0006\u0003\uffff\uffff"+
		"\u0000XY\u0005\u001d\u0000\u0000YZ\u0003\u0014\n\u0000Z[\u0005%\u0000"+
		"\u0000[\\\u0006\u0003\uffff\uffff\u0000\\^\u0001\u0000\u0000\u0000]X\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bU\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0007\u0001"+
		"\u0000\u0000\u0000de\u0005\u0012\u0000\u0000ef\u0005\u0010\u0000\u0000"+
		"fg\u0005%\u0000\u0000gh\u0006\u0004\uffff\uffff\u0000hi\u0005\u0016\u0000"+
		"\u0000ij\u0003\u0006\u0003\u0000jk\u0005\u0019\u0000\u0000kl\u0006\u0004"+
		"\uffff\uffff\u0000lm\u0005\u001e\u0000\u0000mn\u0003\n\u0005\u0000no\u0005"+
		"\u001f\u0000\u0000op\u0006\u0004\uffff\uffff\u0000p\t\u0001\u0000\u0000"+
		"\u0000qt\u0003\u0018\f\u0000rt\u0003\f\u0006\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v\u000b\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000xy\u0005\u0013\u0000\u0000yz\u0003*\u0015\u0000"+
		"z{\u0005\u001a\u0000\u0000{|\u0006\u0006\uffff\uffff\u0000|\r\u0001\u0000"+
		"\u0000\u0000}\u0080\u0003\u0010\b\u0000~\u0080\u0003(\u0014\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0003\u0014\n\u0000\u0085\u008a\u0003\u0012"+
		"\t\u0000\u0086\u0087\u0005\u001d\u0000\u0000\u0087\u0089\u0003\u0012\t"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\u001a\u0000\u0000\u008e\u0011\u0001\u0000\u0000"+
		"\u0000\u008f\u0095\u0005%\u0000\u0000\u0090\u0091\u0005\u001c\u0000\u0000"+
		"\u0091\u0092\u0003*\u0015\u0000\u0092\u0093\u0006\t\uffff\uffff\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0096\u0006\t\uffff\uffff\u0000"+
		"\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0013\u0001\u0000\u0000\u0000\u0097\u0098\u0005\r\u0000\u0000\u0098"+
		"\u00a0\u0006\n\uffff\uffff\u0000\u0099\u009a\u0005\u000e\u0000\u0000\u009a"+
		"\u00a0\u0006\n\uffff\uffff\u0000\u009b\u009c\u0005\u000f\u0000\u0000\u009c"+
		"\u00a0\u0006\n\uffff\uffff\u0000\u009d\u009e\u0005\u0010\u0000\u0000\u009e"+
		"\u00a0\u0006\n\uffff\uffff\u0000\u009f\u0097\u0001\u0000\u0000\u0000\u009f"+
		"\u0099\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0005\u001e\u0000\u0000\u00a3"+
		"\u00a7\u0006\u000b\uffff\uffff\u0000\u00a4\u00a6\u0003\u0018\f\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\u001f\u0000\u0000\u00ab\u00ac\u0006\u000b\uffff\uffff\u0000"+
		"\u00ac\u0017\u0001\u0000\u0000\u0000\u00ad\u00b7\u0003\u001c\u000e\u0000"+
		"\u00ae\u00b7\u0003\u001e\u000f\u0000\u00af\u00b7\u0003 \u0010\u0000\u00b0"+
		"\u00b7\u0003\"\u0011\u0000\u00b1\u00b7\u0003$\u0012\u0000\u00b2\u00b7"+
		"\u0003&\u0013\u0000\u00b3\u00b7\u0003\u001a\r\u0000\u00b4\u00b7\u0003"+
		"\u0010\b\u0000\u00b5\u00b7\u0003(\u0014\u0000\u00b6\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6\u00af\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u0019\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005%\u0000"+
		"\u0000\u00b9\u00ba\u0006\r\uffff\uffff\u0000\u00ba\u00bb\u0005\u0016\u0000"+
		"\u0000\u00bb\u00c7\u0006\r\uffff\uffff\u0000\u00bc\u00bd\u0003*\u0015"+
		"\u0000\u00bd\u00c4\u0006\r\uffff\uffff\u0000\u00be\u00bf\u0005\u001d\u0000"+
		"\u0000\u00bf\u00c0\u0003*\u0015\u0000\u00c0\u00c1\u0006\r\uffff\uffff"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\u0019\u0000\u0000\u00ca\u00cb\u0005\u001a\u0000"+
		"\u0000\u00cb\u00cc\u0006\r\uffff\uffff\u0000\u00cc\u001b\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005\u0004\u0000\u0000\u00ce\u00cf\u0005\u0016\u0000"+
		"\u0000\u00cf\u00d0\u0005%\u0000\u0000\u00d0\u00d1\u0006\u000e\uffff\uffff"+
		"\u0000\u00d1\u00d2\u0005\u0019\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000"+
		"\u0000\u00d3\u00d4\u0006\u000e\uffff\uffff\u0000\u00d4\u001d\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u00d7\u0005\u0016"+
		"\u0000\u0000\u00d7\u00d8\u0003*\u0015\u0000\u00d8\u00d9\u0005\u0019\u0000"+
		"\u0000\u00d9\u00da\u0005\u001a\u0000\u0000\u00da\u00db\u0006\u000f\uffff"+
		"\uffff\u0000\u00db\u001f\u0001\u0000\u0000\u0000\u00dc\u00dd\u00032\u0019"+
		"\u0000\u00dd\u00de\u0006\u0010\uffff\uffff\u0000\u00de\u00df\u0005\u001c"+
		"\u0000\u0000\u00df\u00e0\u0003*\u0015\u0000\u00e0\u00e1\u0005\u001a\u0000"+
		"\u0000\u00e1\u00e2\u0006\u0010\uffff\uffff\u0000\u00e2!\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0006\u0000\u0000\u00e4\u00e5\u0005\u0016\u0000"+
		"\u0000\u00e5\u00e6\u0003*\u0015\u0000\u00e6\u00e7\u0005\u0019\u0000\u0000"+
		"\u00e7\u00e8\u0005\u001e\u0000\u0000\u00e8\u00ec\u0006\u0011\uffff\uffff"+
		"\u0000\u00e9\u00eb\u0003\u0018\f\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u001f\u0000\u0000"+
		"\u00f0\u00fc\u0006\u0011\uffff\uffff\u0000\u00f1\u00f2\u0005\u0007\u0000"+
		"\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f7\u0006\u0011\uffff"+
		"\uffff\u0000\u00f4\u00f6\u0003\u0018\f\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u001f\u0000"+
		"\u0000\u00fb\u00fd\u0006\u0011\uffff\uffff\u0000\u00fc\u00f1\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0006\u0011\uffff\uffff\u0000\u00ff#\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0005\b\u0000\u0000\u0101\u0102\u0005\u0016\u0000"+
		"\u0000\u0102\u0103\u0003*\u0015\u0000\u0103\u0106\u0005\u0019\u0000\u0000"+
		"\u0104\u0105\u0005\u0015\u0000\u0000\u0105\u0107\u0005 \u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u001e\u0000\u0000\u0109"+
		"\u010d\u0006\u0012\uffff\uffff\u0000\u010a\u010c\u0003\u0018\f\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\u001f\u0000\u0000\u0111\u0112\u0006\u0012\uffff\uffff\u0000"+
		"\u0112%\u0001\u0000\u0000\u0000\u0113\u0114\u0005\t\u0000\u0000\u0114"+
		"\u0115\u0005%\u0000\u0000\u0115\u0116\u0006\u0013\uffff\uffff\u0000\u0116"+
		"\u0119\u0005\n\u0000\u0000\u0117\u011a\u0005%\u0000\u0000\u0118\u011a"+
		"\u0005&\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0006"+
		"\u0013\uffff\uffff\u0000\u011c\u011f\u0005\u000b\u0000\u0000\u011d\u0120"+
		"\u0005%\u0000\u0000\u011e\u0120\u0005&\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0006\u0013\uffff\uffff\u0000\u0122\u0125\u0005"+
		"\f\u0000\u0000\u0123\u0126\u0005%\u0000\u0000\u0124\u0126\u0005&\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0006\u0013\uffff"+
		"\uffff\u0000\u0128\u0129\u0005 \u0000\u0000\u0129\u012a\u0005\u001e\u0000"+
		"\u0000\u012a\u012e\u0006\u0013\uffff\uffff\u0000\u012b\u012d\u0003\u0018"+
		"\f\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\u001f\u0000\u0000\u0132\u0133\u0006\u0013\uffff"+
		"\uffff\u0000\u0133\'\u0001\u0000\u0000\u0000\u0134\u0135\u0003\u0014\n"+
		"\u0000\u0135\u0136\u0005%\u0000\u0000\u0136\u0137\u0006\u0014\uffff\uffff"+
		"\u0000\u0137\u0138\u0005\u0017\u0000\u0000\u0138\u0139\u0005&\u0000\u0000"+
		"\u0139\u013a\u0006\u0014\uffff\uffff\u0000\u013a\u013b\u0005\u0018\u0000"+
		"\u0000\u013b\u013c\u0005\u001a\u0000\u0000\u013c)\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0003,\u0016\u0000\u013e\u0145\u0006\u0015\uffff\uffff\u0000"+
		"\u013f\u0140\u0005!\u0000\u0000\u0140\u0141\u0003,\u0016\u0000\u0141\u0142"+
		"\u0006\u0015\uffff\uffff\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143"+
		"\u013f\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146"+
		"+\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0003.\u0017\u0000\u0149\u0150\u0006\u0016\uffff\uffff\u0000\u014a\u014b"+
		"\u0005$\u0000\u0000\u014b\u014c\u0003.\u0017\u0000\u014c\u014d\u0006\u0016"+
		"\uffff\uffff\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014a\u0001"+
		"\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151-\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u00030\u0018"+
		"\u0000\u0154\u015b\u0006\u0017\uffff\uffff\u0000\u0155\u0156\u0005\u001b"+
		"\u0000\u0000\u0156\u0157\u00030\u0018\u0000\u0157\u0158\u0006\u0017\uffff"+
		"\uffff\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c/\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005%\u0000\u0000"+
		"\u015f\u0176\u0006\u0018\uffff\uffff\u0000\u0160\u0161\u0005&\u0000\u0000"+
		"\u0161\u0176\u0006\u0018\uffff\uffff\u0000\u0162\u0163\u0005\"\u0000\u0000"+
		"\u0163\u0176\u0006\u0018\uffff\uffff\u0000\u0164\u0165\u0005#\u0000\u0000"+
		"\u0165\u0176\u0006\u0018\uffff\uffff\u0000\u0166\u0167\u0005\u0014\u0000"+
		"\u0000\u0167\u0168\u00030\u0018\u0000\u0168\u0169\u0006\u0018\uffff\uffff"+
		"\u0000\u0169\u0176\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u0016\u0000"+
		"\u0000\u016b\u016c\u0003*\u0015\u0000\u016c\u016d\u0005\u0019\u0000\u0000"+
		"\u016d\u016e\u0006\u0018\uffff\uffff\u0000\u016e\u0176\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u00036\u001b\u0000\u0170\u0171\u0006\u0018\uffff\uffff"+
		"\u0000\u0171\u0176\u0001\u0000\u0000\u0000\u0172\u0173\u00032\u0019\u0000"+
		"\u0173\u0174\u0006\u0018\uffff\uffff\u0000\u0174\u0176\u0001\u0000\u0000"+
		"\u0000\u0175\u015e\u0001\u0000\u0000\u0000\u0175\u0160\u0001\u0000\u0000"+
		"\u0000\u0175\u0162\u0001\u0000\u0000\u0000\u0175\u0164\u0001\u0000\u0000"+
		"\u0000\u0175\u0166\u0001\u0000\u0000\u0000\u0175\u016a\u0001\u0000\u0000"+
		"\u0000\u0175\u016f\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000"+
		"\u0000\u01761\u0001\u0000\u0000\u0000\u0177\u0178\u0005%\u0000\u0000\u0178"+
		"\u017e\u0006\u0019\uffff\uffff\u0000\u0179\u017a\u0005\u0017\u0000\u0000"+
		"\u017a\u017b\u0003*\u0015\u0000\u017b\u017c\u0005\u0018\u0000\u0000\u017c"+
		"\u017d\u0006\u0019\uffff\uffff\u0000\u017d\u017f\u0001\u0000\u0000\u0000"+
		"\u017e\u0179\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f3\u0001\u0000\u0000\u0000\u0180\u0185\u0003*\u0015\u0000\u0181\u0182"+
		"\u0005\u001d\u0000\u0000\u0182\u0184\u0003*\u0015\u0000\u0183\u0181\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u01865\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0005%\u0000"+
		"\u0000\u0189\u018a\u0006\u001b\uffff\uffff\u0000\u018a\u018b\u0005\u0016"+
		"\u0000\u0000\u018b\u0197\u0006\u001b\uffff\uffff\u0000\u018c\u018d\u0003"+
		"*\u0015\u0000\u018d\u0194\u0006\u001b\uffff\uffff\u0000\u018e\u018f\u0005"+
		"\u001d\u0000\u0000\u018f\u0190\u0003*\u0015\u0000\u0190\u0191\u0006\u001b"+
		"\uffff\uffff\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u018e\u0001"+
		"\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0198\u0001"+
		"\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u018c\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0005\u0019\u0000\u0000\u019a\u019b\u0006"+
		"\u001b\uffff\uffff\u0000\u019b7\u0001\u0000\u0000\u0000 BD_bsu\u007f\u0081"+
		"\u008a\u0095\u009f\u00a7\u00b6\u00c4\u00c7\u00ec\u00f7\u00fc\u0106\u010d"+
		"\u0119\u011f\u0125\u012e\u0145\u0150\u015b\u0175\u017e\u0185\u0194\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}