package br.com.generation.exercicio;

import java.util.Scanner;

public class quarto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double num,num2;
		
		System.out.println("Digite um número: ");
			num = leia.nextFloat();
		
		if (num % 2 == 0) {
			
			num2 = Math.sqrt(num);
			System.out.println("O número digitado é par e foi: " + num + " e sua raiz quadrada é " + num2);
			
		}
		
		else {
			num2 = Math.pow(num, 2);
			System.out.println("O número digitado é impar e foi: " + num + " e elevado ao quadrado é " + num2);
		}
		
		leia.close();
		

	}

}
