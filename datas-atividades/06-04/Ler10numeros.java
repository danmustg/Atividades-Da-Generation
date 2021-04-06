package Turma20;

import java.util.Scanner;

public class Ler10numeros {

	public static void main(String[] args) 
	{
		int idade,cont21=0,cont50=0;
  Scanner entrada = new Scanner(System.in);

  System.out.println("Entre com a idade: ");
  idade = entrada.nextInt();
  
   while (idade!=-99)
   {
	   if (idade<21)
	   {
		   cont21++;
	   }
	   if (idade>50) 
	   {
		   cont50++;
	   }
	   
	   System.out.println("Entre com a idade: ");
	   idade = entrada.nextInt();
	      
   }
   System.out.println("Temos:"+cont21+ "\npessoas com menos de 21 anos.");
   System.out.println("Temos:"+cont50+ "\npessoas com mais de 50 anos.");

}
}
