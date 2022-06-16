package aula24;

import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {

		String product1 = "Computer", product2 = "Office desk";
		int cod = 5290, age = 30;
		char gender = 'F';
		double price1 = 2100.0, price2 = 650.50, measure = 53.234567;

		System.out.printf(
				" Products: %n %s, which price is R$ %.2f %n %s, " + "which price is $ %.2f %n Record: " + age
						+ " years old, " + "code %d and gender: " + gender + "%n Measue with "
						+ "decimal pleaces: %.8f %n Rouded " + "(three decimal pleces): %.3f %n",
				product1, price1, product2, price2, cod, measure, measure);

		Locale.setDefault(Locale.US);
		System.out.printf(" US decimal point: %.3f %n", measure);

	}

}
