package s04a025_Casting;

public class Casting {

	public static void main(String[] args) {
		
		System.out.println("Seção 04/Aula 025 - s04a025\n");
		System.out.println("Processamento de dados e Casting");
		System.out.println("----\n\n");
		
		System.out.println("1. Comando de atribuição de valor para uma variável\n");
		
		int x = 5; 
		int y = 2 * x;
		double z = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		//Área do Trapézio
		
		System.out.println("\n\nCalculando a área do Trapézio....\n");
		
		double b, B, h, area;
				
		b = 6.0; 
		B = 8.0; 
		h = 5.0; 
		
		//float b, B, h, area;
		
		//b = 6f; 
		//B = 8f; 
		//h = 5f; 
		
		area = (b + B)/h;
		System.out.println(area);
		
		System.out.println("\n----\n");
		
		int r = 5; 
		int s = 2; 
		double resultado;
		
		//resultado = r / s;			// o resultado é um int
		resultado = (double) r / s;		// o resultado é um double
		
		System.out.println(resultado);
		
		System.out.println("\n----\n");		
		
		double j; 
		int k; 
		
		j = 5.0; 
		k = (int) j;
		
		System.out.println(k);
		
		
		
		
		
		
	}

}
