package br.com.generation.exercicio;

import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		float num1, num2, num3;
				
		System.out.println("Digite o primeiro número: ");
			num1 = leia.nextFloat();
		System.out.println("Digite o segundo número: ");
			num2 = leia.nextFloat();
		System.out.println("Digite o terceiro número: ");
			num3 = leia.nextFloat();
			
		if (num1 <= num2 && num2 <= num3) {
			System.out.println("Ordem crescente: " + num1 + " " + num2 + " " +num3);
		}
		else if (num2 <= num1 && num1 <= num3) {
			System.out.println("Ordem crescente: " + num2 + " " + num1 + " " + num3);
		}
		else if (num1 <= num3 && num3 <= num2) {
			System.out.println("Ordem crescente: " + num1 + " " +num3 + " " +num2);
		}
		else if (num2 <= num3 && num3 <= num1) {
			System.out.println("Ordem crescente: " + num2 + " " +num3 + " " +num1);
		}
		else if (num3 <= num2 && num2 <= num1) {
			System.out.println("Ordem crescente: " + num3 + " " +num2 + " " +num1);
		}
		else {
			System.out.println("Ordem crescente: " + num3 + " " +num1 + " " + num2);
		}
			
			leia.close();
	}

}
