package aula24;

import java.util.Scanner;
import java.util.Locale;

public class concatenarVariosElementos {

	public static void main(String[] args) {
		
		double x;
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Digite o valor do metro:");
		x= leia.nextDouble();
		
		System.out.println("Você digitou: ");
		System.out.println();
		System.out.println(x);
		System.out.println("\nFORMATAÇÕES");
		System.out.println("-----------------------");
		
		System.out.println();
		System.out.printf("%.4f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.2f%n ", x);
		System.out.printf("%.1f%n", x);
		
		System.out.println();
		System.out.printf("Resultado = %.2f Metros %n ", x);
		
		leia.close();
		
		
	}

}
