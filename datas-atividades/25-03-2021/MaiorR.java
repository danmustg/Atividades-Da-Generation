package Turma20;
//MAIOR NUMERO
import java.util.Scanner;
public class MaiorR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner imput= new Scanner(System.in);
		int n1,n2,n3,soma,max,min,nu3=0;
		
		System.out.print("Digite Um Numero: ");
		n1= imput.nextInt();
		
		System.out.print("Digite Segundo Numero: ");
		n2= imput.nextInt();
		
		System.out.print("Digite Terceiro Numero: ");
		n3= imput.nextInt();
		
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("O maior valor é "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("O maior valor é "+n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("O maior valor é :"+n3);
		}
	}
 
}
