package aula24;

import java.util.Locale;
import java.util.Scanner;


public class formatacao {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		double x;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor do metro:");
		x = leia.nextDouble();
		
		System.out.println();
		
		System.out.println("Você digitou: ");
		
		System.out.println (x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.1f%n", x);
		
		System.out.println();

		
		System.out.println("Resultado: " + x + " metros");
		
		leia.close();

	}

}
