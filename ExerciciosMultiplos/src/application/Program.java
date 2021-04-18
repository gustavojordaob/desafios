package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero: ");
		int entrada = sc.nextInt();
		
		somaMultiplos(entrada);
	}

	private static void somaMultiplos(Integer val) {
		int x = 3;
		int z = 5;
		int somax = 0;
		int somaz = 0;
		int res;

		for (int i = 1; i < val; i++) {
			if (i % x == 0) {
				somax += i;
			}
		}
		for (int i = 1; i < val; i++) {
			if (i % z == 0) {
				somaz += i;
			}
		}
		res = somax + somaz;

		System.out.println("A soma dos multiplos de 3 e 5 abaixo de " + val + ", é: " + res);
		
	}

}
