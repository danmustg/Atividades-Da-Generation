package TrabalhoDeConslusaoDeModulo2;


public class Bicicletas extends Locacao {// a classe bicicletas usa elementos polimorficos da classe loca��o
	//declara��o de atributos

	private String Modelo; // montain bike, street, corrida 
	private String Tamanho;// infantil, adolescente, adulto
	


	// contrutores
	
	public Bicicletas () {// construtor vazio e o defaut
		
	}
	
	public Bicicletas (String Modelo, String Tamanho,double valor,int x) {

		super(valor,x);// valores adquiridos da superclasse
		this.Modelo = Modelo;// dentro da lista modelo quero um modelo especifico
		this.Tamanho = Tamanho;
	
					
	}
	
	// m�todos
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}
		
	
}