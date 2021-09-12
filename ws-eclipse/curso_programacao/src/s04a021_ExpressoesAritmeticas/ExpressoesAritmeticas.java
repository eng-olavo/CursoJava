package s04a021_ExpressoesAritmeticas;

public class ExpressoesAritmeticas {

	public static void main(String[] args) {
		
		System.out.println("Se��o 04/Aula 021 - s04a021\n");
		System.out.println("Express�es Aritm�ticas");
		System.out.println("----\n\n");
		
		System.out.println("1. Express�es Aritm�ticas\n");
		System.out.println("1.1. Operadores Aritm�ticos\n");
		System.out.println("\t+ -> Adi��o");
		System.out.println("\t- -> Subtra��o");
		System.out.println("\t* -> Multiplica��o");
		System.out.println("\t/ -> Divis�o");
		System.out.println("\t% -> M�dulo ou Resto da Divis�o\n\n");
		
		System.out.println("1.2. Preced�ncia entre Operadores Aritm�ticos\n");
		System.out.println("* Primeiro: a multiplica��o *, divis�o / e resto %\n");
		System.out.println("** Depois (segundo): a adi��o + e a subtra��o -\n");
		System.out.println("*** Os parenteses () s�o utilizados para priorizar uma preced�ncia\n\n");
		
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
		
		System.out.println("\n\n1.2.2. EXEMPLOS com o operador % Resto ou m�dulo\n");
		
		System.out.print("14 % 3 = ");
		System.out.println(14 % 3);
		
		System.out.print("19 % 5 = ");
		System.out.println(19 % 5);
		

	}

}
