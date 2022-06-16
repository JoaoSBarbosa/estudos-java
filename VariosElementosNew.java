package aula24;

import java.util.Scanner;

public class VariosElementosNew {

	public static void main(String[] args) {

		/*
		 * %f= ponto flutuante %d= inteiro %s= textos %n= quebra de linhas
		 */

		String nome;
		int idade;
		double renda;
		Scanner leia = new Scanner(System.in);

		System.out.println(" Olá, para comerçarmos, por favor, digite o seu nome:");
		nome = leia.next();
		System.out.printf(
				" Seja bem vindo," + nome + " ! %n Agora, por favor, digite sua idade e sua renda na sequencia:");
		idade = leia.nextInt();
		renda = leia.nextDouble();
		System.out.printf(" %s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
	}
}
