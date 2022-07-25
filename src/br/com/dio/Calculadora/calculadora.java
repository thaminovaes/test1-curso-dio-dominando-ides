package br.com.dio.Calculadora;

import java.util.Scanner;

public class calculadora {


	
	public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				double a,b;
				
				System.out.println("Digite o primeiro valor:");
				a = scan.nextInt();
				System.out.println("Digite o primeiro valor:");
				b = scan.nextInt ();
				
				double soma = soma(a,b);
				double subtracao = subtracao(a,b);
				double multiplicacao = multiplicacao (a,b);
				double divisao = divisao(a,b);
				
				System.out.println("soma "+ soma);
				System.out.println("subtracao " + subtracao);
				System.out.println("multiplicacao " + multiplicacao);
				System.out.println("divisao " + divisao);
			}

	}

		public static float soma(double a,double b) {
			return (float) (a + b);
		}
		public static float subtracao(double a,double b) {
			return (float) (a - b);
		}
		public static float divisao(double a,double b) {
			return (float) (a / b);
		}
		public static float multiplicacao(double a,double b) {
			return (float) (a * b);
		}
}
