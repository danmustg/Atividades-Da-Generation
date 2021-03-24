package Turma20;

import java.util.Scanner; // Cerve Para Scannear oque o usuario digitar e o comando imprimir 
  public class IdadeEmAnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias,anos,meses;
		
		Scanner ler= new Scanner(System.in);
		  
		System.out.println("Quantos dias de vida você tem? ");
		 dias= ler.nextInt();
		
		anos=dias/365;
        meses=(dias%365)/30; //para saber oque resta a porcentagem e depois dividir
	    dias=(dias%365)%30; // para saber oque resta do resto com porcentagem e depois porcentagem de novo
		
	    System.out.println("\nVocê tem: "+anos+" anos "+meses+" mes(s) "+dias+" dia(s) ");
	}

}
