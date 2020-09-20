package br.com.fundamentos;

public class TestaWhile {
	
	public static void main(String[] args) {
		
		int incremento = 0;
		
		System.out.println("Crescente");
		
		while (incremento <= 2) {
			System.out.println("Contador -> " + incremento);
			//incremento = incremento + 1
			//incremento += 1
			incremento++;
		}
		
		//System.out.println("Valor final do contador " + contador);
		
		System.out.println(" ");
		System.out.println("Decrescente");
		
		int decremento = 2;
		
		while(decremento >= 0) {
			System.out.println("Contador -> " + decremento);
			decremento--;
		}
	}

}
