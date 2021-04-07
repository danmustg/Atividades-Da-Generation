package Turma20;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente cli = new Cliente("Matheus Mota ","*","Matheuszão@gmail.com","4002-8922");
		 // Troca de mensagens (chamada ao metodo imprimirInfo()
		cli.DadosInfo();
		
		System.out.println("\n****Imformações Atualizadas****");


		cli.setNome("Matheuzinho Mota");
		cli.setGenero("Masculino");
		cli.setEmail("matheuzinhofodão@gmail.com");
		cli.setPhone("0880-777-7000");
		
		cli.DadosInfo();
		
		
	}

}
