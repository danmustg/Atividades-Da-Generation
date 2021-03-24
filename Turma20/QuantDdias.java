package Turma20;

 import java.util.Scanner;
public class QuantDdias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int idade, meses, dias, soma, mult;
		
		  Scanner ler= new Scanner (System.in); // Sempre colocar o Scanner para ele poder atv o LER oque o usuario digita
		  
		System.out.println("Qual sua idade? ");
		idade= ler.nextInt();
		
		System.out.println("Quantos meses você tem?? ");
		meses= ler.nextInt();
		
		System.out.println("Quantos dias você tem??");
		dias= ler.nextInt();
		
		
		 mult= idade *365 + meses * 30 + dias;
	     soma= idade + meses + dias; 
	     
	   System.out.println("Você tem: "+ mult+" dias de vida.");
		
		
	}

}
