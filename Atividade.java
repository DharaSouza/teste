package primeiro_projeto;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		// Variaveis
		String nome,idade;
		
		// Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados 
		System.out.println("Digite seu nome:");
		nome = ler.next();
		
		System.out.println("Digite sua idade:");
		idade = ler.next();
			
		//processamento
		System.out.println("Digite seu nome:" + nome + idade);
		
		// TODO Auto-generated method stub
	}

}
 