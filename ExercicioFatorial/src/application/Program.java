package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int fatorial = 1;
		
		System.out.print("Entre com o numero: ");
		int entrada = sc.nextInt();
		System.out.println("");
						
		for (int i = 1; i <= entrada; i++) {
			fatorial *= i;			
			System.out.println( i + "!= " + fatorial);	
		}
		if(entrada == 0) {
			System.out.println( 0 + "!= " + 1);	
		}

	}

}
