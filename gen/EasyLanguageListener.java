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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EasyLanguageParser}.
 */
public interface EasyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EasyLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EasyLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#rotinas}.
	 * @param ctx the parse tree
	 */
	void enterRotinas(EasyLanguageParser.RotinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#rotinas}.
	 * @param ctx the parse tree
	 */
	void exitRotinas(EasyLanguageParser.RotinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(EasyLanguageParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(EasyLanguageParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(EasyLanguageParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(EasyLanguageParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento(EasyLanguageParser.ProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento(EasyLanguageParser.ProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#bloco_funcao}.
	 * @param ctx the parse tree
	 */
	void enterBloco_funcao(EasyLanguageParser.Bloco_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#bloco_funcao}.
	 * @param ctx the parse tree
	 */
	void exitBloco_funcao(EasyLanguageParser.Bloco_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmd_retorno}.
	 * @param ctx the parse tree
	 */
	void enterCmd_retorno(EasyLanguageParser.Cmd_retornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmd_retorno}.
	 * @param ctx the parse tree
	 */
	void exitCmd_retorno(EasyLanguageParser.Cmd_retornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(EasyLanguageParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(EasyLanguageParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(EasyLanguageParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(EasyLanguageParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(EasyLanguageParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(EasyLanguageParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(EasyLanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(EasyLanguageParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(EasyLanguageParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(EasyLanguageParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(EasyLanguageParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(EasyLanguageParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmd_chamada}.
	 * @param ctx the parse tree
	 */
	void enterCmd_chamada(EasyLanguageParser.Cmd_chamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmd_chamada}.
	 * @param ctx the parse tree
	 */
	void exitCmd_chamada(EasyLanguageParser.Cmd_chamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(EasyLanguageParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(EasyLanguageParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(EasyLanguageParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(EasyLanguageParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(EasyLanguageParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(EasyLanguageParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(EasyLanguageParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(EasyLanguageParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(EasyLanguageParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(EasyLanguageParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdLaço}.
	 * @param ctx the parse tree
	 */
	void enterCmdLaço(EasyLanguageParser.CmdLaçoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdLaço}.
	 * @param ctx the parse tree
	 */
	void exitCmdLaço(EasyLanguageParser.CmdLaçoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#declaracao_array}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_array(EasyLanguageParser.Declaracao_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#declaracao_array}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_array(EasyLanguageParser.Declaracao_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EasyLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EasyLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(EasyLanguageParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(EasyLanguageParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#termo_relacional}.
	 * @param ctx the parse tree
	 */
	void enterTermo_relacional(EasyLanguageParser.Termo_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#termo_relacional}.
	 * @param ctx the parse tree
	 */
	void exitTermo_relacional(EasyLanguageParser.Termo_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_aritmetico(EasyLanguageParser.Termo_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_aritmetico(EasyLanguageParser.Termo_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#id_ou_array}.
	 * @param ctx the parse tree
	 */
	void enterId_ou_array(EasyLanguageParser.Id_ou_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#id_ou_array}.
	 * @param ctx the parse tree
	 */
	void exitId_ou_array(EasyLanguageParser.Id_ou_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(EasyLanguageParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(EasyLanguageParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(EasyLanguageParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(EasyLanguageParser.Chamada_funcaoContext ctx);
}