package br.com.fundamentos;

public class ProgressaoAritimeticaWhile {
	
	public static void main(String[] args) {
		
		int inicial = 1, razao = 3, an = inicial, valor_max = 10;
		
		System.out.printf("Elementos da PA, de valores incial %d e razão %d\n", inicial, razao, 
				valor_max);
		
		while(an <= valor_max) {
			System.out.println(an);
			an += razao;
		}
	}
}
