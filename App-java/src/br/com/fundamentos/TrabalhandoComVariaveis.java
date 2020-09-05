package br.com.fundamentos;

public class TrabalhandoComVariaveis {
	/*
	 * https://medium.com/@mauriciogeneroso/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5
	 */
	
	public static void main(String[] args) {
		int quantidade; //Declarando variavel inteiro
		quantidade = 10; //atribuindo o valor 10
		
		System.out.println(quantidade);
		
		quantidade = 15;
		
		System.out.println(quantidade);
		
		double numeroQuebrado = 1.3;
		System.out.println("Numero decimal -> " + numeroQuebrado);
		
		float numeroQuebradoPontoFloat = 1.5f;
		System.out.println("Numero decimal com float -> " + numeroQuebradoPontoFloat);
		
		long populacaoUberlandia = 250000l;
		System.out.println(populacaoUberlandia);
		
		long populacaoMundial = 7000000000L;
		System.out.println(populacaoMundial);
		
		boolean alunoMatriculado = true;
		boolean clienteMatriculado = false;
		
		//com char fica entre 'apostrofo' 'apostrofe'
		char turmaAluno1 = 'A';
		char tipoCliente = '2';
		char simbolo = '@';
		
		//quando usamos String o valor fica entre "aspas"
		String nomePessoa = "Vinícius";
		
		
		
	}

}


