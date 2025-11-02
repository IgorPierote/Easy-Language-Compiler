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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EasyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EasyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(EasyLanguageParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#rotinas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotinas(EasyLanguageParser.RotinasContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(EasyLanguageParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(EasyLanguageParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#procedimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimento(EasyLanguageParser.ProcedimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#bloco_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_funcao(EasyLanguageParser.Bloco_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmd_retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_retorno(EasyLanguageParser.Cmd_retornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(EasyLanguageParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#declaravar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaravar(EasyLanguageParser.DeclaravarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#decl_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local(EasyLanguageParser.Decl_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(EasyLanguageParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(EasyLanguageParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(EasyLanguageParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmd_chamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_chamada(EasyLanguageParser.Cmd_chamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmdleitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdleitura(EasyLanguageParser.CmdleituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmdescrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdescrita(EasyLanguageParser.CmdescritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmdattrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdattrib(EasyLanguageParser.CmdattribContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmdselecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdselecao(EasyLanguageParser.CmdselecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(EasyLanguageParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#cmdLaço}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLaço(EasyLanguageParser.CmdLaçoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#declaracao_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_array(EasyLanguageParser.Declaracao_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EasyLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(EasyLanguageParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#termo_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_relacional(EasyLanguageParser.Termo_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_aritmetico(EasyLanguageParser.Termo_aritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#id_ou_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_ou_array(EasyLanguageParser.Id_ou_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(EasyLanguageParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLanguageParser#chamada_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_funcao(EasyLanguageParser.Chamada_funcaoContext ctx);
}