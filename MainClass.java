import java.util.Scanner;
public class MainClass {
	private static Scanner _scanner = new Scanner(System.in);

	public static Boolean  ehPar;;
	public static Void  saudar;;
	public static double  versao;;
	public static String  autor;;

	public static boolean ehPar(double n) {
		return n % 2 == 0;
	}

	public static void saudar(String nome) {
		System.out.println("Ola, ");
		System.out.println(nome);
		System.out.println("! Bem-vindo(a) a EasyLanguage.");
	}

	public static void main(String args[]) {
		versao = 1.0;
		autor = "Piero";
		System.out.println("--- INICIO DA DEMONSTRACAO FINAL ---");
		System.out.println("Compilador EasyLanguage v.");
		System.out.println(versao);
		System.out.println("Autor: ");
		System.out.println(autor);
		System.out.println("");
		System.out.println("--- 1. Teste de Estruturas de Controle ---");
		System.out.println("Laco 'para' de 0 a 4 passo 2:");
		for (double i = 0; i <= 4; i = i + 2) {
	System.out.println("  i = ");
	System.out.println(i);
}

		System.out.println("Laco 'enquanto' com 'nao' e 'e':");
		double contador;
		contador = 3;
		boolean continuar;
		continuar = true;
		while (contador > 0 && !((continuar == false))) {
	System.out.println("  Contador = ");
	System.out.println(contador);
	contador = contador - 1;
}

		System.out.println("");
		System.out.println("--- 2. Teste de Sistema de Tipos e Operacoes ---");
		boolean a;
		a = true;
		boolean b;
		b = false;
		System.out.println("a=verdadeiro, b=falso. (a e b) = ");
		System.out.println(a && b);
		System.out.println("(a ou b) = ");
		System.out.println(a || b);
		System.out.println("Teste de Vetor:");
		double [] meuVetor = new double[3];
		meuVetor[0] = 100;
		meuVetor[2] = 300;
		System.out.println("  Valor na posicao 2 do vetor: ");
		System.out.println(meuVetor[2]);
		System.out.println("");
		System.out.println("--- 3. Teste de Chamada de Funcoes e Procedimentos ---");
		saudar("Avaliador");
		System.out.println("A funcao 'ehPar(4)' retorna: ");
		System.out.println(ehPar(4));
		System.out.println("A funcao 'ehPar(5)' retorna: ");
		System.out.println(ehPar(5));
		System.out.println("");
		System.out.println("--- 6. Teste de Otimizacao ---");
		double otimizado;
		otimizado = (10 + 5) * 2;
		System.out.println("A expressao (10 + 5) * 2 foi otimizada para: ");
		System.out.println(otimizado);
		System.out.println("");
		System.out.println("--- FIM DA DEMONSTRACAO ---");
	}
}
