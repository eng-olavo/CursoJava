package s04a026_EntradaDeDados1;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String x;		
		x = sc.next();
		System.out.println("Você digitou : " + x);
		
		int y; 
		y = sc.nextInt();
		System.out.println("Você digitou : " + y);
		*/
		
		/*
		Locale.setDefault(Locale.US); // recebe o ponto flutuante com .
		Scanner sc = new Scanner(System.in);
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou : " + z);
		System.out.printf("Você digitou : %.1f%n", z);		
		*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		char c; 
		c = sc.next().charAt(0);
		System.out.println("Você digitou : " + c);
		*/
		
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String q; 
		int w; 
		double e;
		
		q = sc.next();
		w = sc.nextInt();
		e = sc.nextDouble();
		
		System.out.println("Dados digitados...");
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		*/
		
		// Para ler um texto até a quebra de linha <ENTER>
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3; 
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados...");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

}
