package s04a024_SaidaDeDadosEmJava;

import java.util.Locale;

public class SaidaDeDadosEmJava {

	public static void main(String[] args) {
		
		System.out.println("Seção 04/Aula 024 - s04a024\n");
		System.out.println("Saída de dados em Java");
		System.out.println("----\n\n");
		
		System.out.println("1. Comandos print, println e printf\n");
		System.out.println("O comando PRINT não tem quebra de linha no final...\n");
		System.out.println("O comando PRINTLN inclui a quebra de linha no final...\n");

		
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		
		System.out.println("");
		
		System.out.print("Olá Mundo!");
		System.out.println("Bom dia!");
		
		System.out.println("");
		
		int y = 32; 
		System.out.println(y);
		
		System.out.println("");
		
		double x = 10.35784; 
		
		
		System.out.println(x);
		System.out.printf("%.2f\n",x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n",x);
		System.out.printf("%.4f%n",x);
		System.out.printf("%.1f%n",x);
		
		
		System.out.println("2. Concatenação de vários elementos de escrita\n");
		System.out.println("uso do operador + para a concatenação\n");
		System.out.println("Regra Geral: elemento1 + elementos2 + ... + elementoN");
		System.out.println("Exemplos: \n");
		System.out.println("RESULTADO = " + x + " metros.\n\n");
		
		
		System.out.println("Marcadores no comando printf\n");
		System.out.printf("RESULTADO = %.2f" + " metros.\n", x);
		System.out.printf("RESULTADO = " + "%.2f" + " metros.\n\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		
		Locale.setDefault(new Locale("pt","BR"));
		//Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha R$ %.2f Reais.%n",nome, idade, salario);
		
				
		System.out.println("\nResumo dos marcadores\n");
		
		System.out.println(" %s -> Strings");
		System.out.println(" %d -> Int");
		System.out.println(" %f -> double");
		System.out.println(" \\n ou %n -> quebra de linha");
		System.out.println(" \\t ou %t -> tabulação");
	}

}
