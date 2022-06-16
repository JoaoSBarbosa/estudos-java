package aula24;

import java.util.Locale;

public class main {

	public static void main(String[] args) {
		
		double x= 10.35784;
		
		Locale.setDefault(Locale.US);
		
		System.out.println(x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.1f%n", x);
		
		


	}

}
