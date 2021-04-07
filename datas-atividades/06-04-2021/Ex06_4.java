package Turma20;

import java.util.Scanner;

public class Ex06_4 {
	
	public static void main(String [] args) {
		
		int[][] tab = new int [3][3];
		int num=0, maior=0;
		
		Scanner entrada= new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("\nInforme um numero");
				num= entrada.nextInt();
				{
					if(num>10)
					{
						num= maior++;
					}
				}
			}
			System.out.println("\nTemos "+maior+ "\nnumeros maioress que 10!!");
		}
		
	}

}
