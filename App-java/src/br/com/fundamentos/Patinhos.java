package br.com.fundamentos;

public class Patinhos {
	
	public static void main(String[] args) {
		
		int patos = 5;
		
		while (patos > 0) {
			
			System.out.println(patos + " patinhos foram passear"
					+ "\nAl�m das montanhas para brincar"
					+ "\nA mam�e gritou: \"Qu�, qu�, qu�, qu�\""
					+ "\nMas s� " + (patos - 1) + " patinhos voltaram de l�");
			patos--;
		}
	}
}
