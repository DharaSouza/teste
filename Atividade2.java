package primeiro_projeto;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//Variavel
		double horatrab, valorhora, salbruto, salliquido,inss;
		
		//Instaciar Classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//entrada de dados
		System.out.println("informa quantas horas você trabalha por dia");
		horatrab = ler.nextDouble();
		System.out.println("informa quantos você ganha por hora");
		valorhora = ler.nextDouble();
		
		//Processamento
		salbruto = horatrab + valorhora;
				inss = salbruto * 0.12;
				salliquido = salbruto - inss;
				
		//Saída
		System.out.println("O valor do sálario bruto é:" + salbruto);
		System.out.println("O valor do sálario Liquido é:" + salliquido);
				
		// TODO Auto-generated method stub

	}

}
