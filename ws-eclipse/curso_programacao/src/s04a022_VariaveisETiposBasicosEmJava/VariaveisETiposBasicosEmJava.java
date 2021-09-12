package s04a022_VariaveisETiposBasicosEmJava;

public class VariaveisETiposBasicosEmJava {

	public static void main(String[] args) {
		
		System.out.println("Seção 04/Aula 022 - s04a022\n");
		System.out.println("Variáveis e tipos básicos em Java");
		System.out.println("----\n\n");
		
		System.out.println("1. Sintaxe\n");
		System.out.println("<tipo> <nome> = <valor inicial>;\n");
		System.out.println("Exemplos:\n");
		
		System.out.println("int idade = 25");
		int idade = 25; 
		System.out.println(idade);
		
		System.out.println("double altura = 1.68");
		double altura = 25; 
		System.out.println(altura);
		
		System.out.println("char sexo = F");
		char sexo = 25; 
		System.out.println(sexo);
		
		System.out.println("\n\n2. Tipos primitivos em Java\n");
		System.out.println("\tTipos numéricos inteiros:");
		System.out.println("\t\tTipo: byte ");
		System.out.println("\t\tTipo: short ");
		System.out.println("\t\tTipo: int ");
		System.out.println("\t\tTipo: long ");
		System.out.println("\t\tTipo: float ");
		System.out.println("\t\tTipo: double ");
		System.out.println("\t\tTipo: char ");
		System.out.println("\t\tTipo: boolean ");
		System.out.println("\t\tTipo: String ");
		
		System.out.println("\n\n3. Regras para os nomes das variáveis\n");
		System.out.println("O nome da variável: \n");
		System.out.println("\t * Não pode começar com número, deve começar com uma letra ou _ ");
		System.out.println("\t ** Não pode ter espaços em branco separando palavras ou partes do nemo da variável");
		System.out.println("\t *** Não usar acentos, ç ou ~");
		System.out.println("\t **** Seguir o padrão Camel Case, com a primeira letra minúscula.");
	
		System.out.println("\n\nExemplos:\n");
		System.out.println("int _5minutos");
		System.out.println("int salario");
		System.out.println("int salarioDoFuncionario");
	}

}
