package br.com.generation.exercicio;

import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
			num1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
			num2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
			num3 = leia.nextInt();
			
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número digitado foi: " + num1);
		}
		
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número digitado foi: " + num2);
		}
		
		else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior número digitado foi: " + num3);
		}
		
		leia.close();

	}

}
