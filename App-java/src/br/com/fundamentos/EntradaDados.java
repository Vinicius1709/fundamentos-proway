package br.com.fundamentos;

import java.util.Scanner;

public class EntradaDados {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome =  entrada.nextLine();
		
		System.out.println("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Sexo (1 para 'M' ou outro numero para 'F'): ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura * altura);
		
		//____________A____________             ||  ____________B_____________
		
		if ((sexo == 'F' && imc < 19.1)         || (sexo == 'M' && imc < 20.7)) {
			System.out.println("Abaixo do peso");
		} else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc < 26.4)) {
			System.out.println("Peso ideal");
		} else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc < 27.8)) {
			System.out.println("Um pouco acima do peso");
		} else {
			System.out.println("Obesidade");
		}
		
		entrada.close();
	}

}
