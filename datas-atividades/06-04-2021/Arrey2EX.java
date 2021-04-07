package Turma20;

import java.util.Scanner;

public class Arrey2EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numeros=new int [6];
		int somapar=0,contimpar=0;
		
		Scanner entrada= new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Entre com um numero: ");
			numeros[i]= entrada.nextInt();
			
			
			
			if(numeros[i]%2==0)
			{
				somapar= somapar+numeros[i];
			}
			else
			{
				contimpar++;
			}
		
			System.out.println("\nSoma dos numeros pares "+somapar);
			System.out.println("\nQuantidade de numeros impares "+contimpar);
		}
		   
	}
	
}
