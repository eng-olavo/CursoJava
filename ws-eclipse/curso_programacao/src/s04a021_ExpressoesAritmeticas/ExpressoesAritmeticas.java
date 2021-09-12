package s04a021_ExpressoesAritmeticas;

public class ExpressoesAritmeticas {

	public static void main(String[] args) {
		
		System.out.println("Seção 04/Aula 021 - s04a021\n");
		System.out.println("Expressões Aritméticas");
		System.out.println("----\n\n");
		
		System.out.println("1. Expressões Aritméticas\n");
		System.out.println("1.1. Operadores Aritméticos\n");
		System.out.println("\t+ -> Adição");
		System.out.println("\t- -> Subtração");
		System.out.println("\t* -> Multiplicação");
		System.out.println("\t/ -> Divisão");
		System.out.println("\t% -> Módulo ou Resto da Divisão\n\n");
		
		System.out.println("1.2. Precedência entre Operadores Aritméticos\n");
		System.out.println("* Primeiro: a multiplicação *, divisão / e resto %\n");
		System.out.println("** Depois (segundo): a adição + e a subtração -\n");
		System.out.println("*** Os parenteses () são utilizados para priorizar uma precedência\n\n");
		
		System.out.println("1.2.1. EXEMPLOS\n");
		
		System.out.print("2 * 6 / 3 = ");
		System.out.println(2 * 6 / 3);
		
		System.out.print("3 + 2 * 4 = ");
		System.out.println(3 + 2 * 4);
		
		System.out.print("(3 + 2) * 4 = ");
		System.out.println((3 + 2) * 4);
		
		System.out.print("60/(3+2)*4 = ");
		System.out.println(60/(3+2)*4);
		
		System.out.print("60/((3+2)*4) = ");
		System.out.println(60/((3+2)*4));
		
		System.out.println("\n\n1.2.2. EXEMPLOS com o operador % Resto ou módulo\n");
		
		System.out.print("14 % 3 = ");
		System.out.println(14 % 3);
		
		System.out.print("19 % 5 = ");
		System.out.println(19 % 5);
		

	}

}
