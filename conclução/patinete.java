package TrabalhoDeConslusaoDeModulo2;

	public class patinete extends Locacao {// a classe patinete usa itens polimorficos da classe loca��o
		//declara��o de atributos

		private String Modelo;//Eletrico ou normal
		private String tamanho;//Infantil ou adulto
		// construtores
		
		public patinete()// construtor vazio � o padr�o
		{
			
		}
		
		public patinete (String Modelo, String tamanho, double valor, int x)
		{
			super(valor,x);// valores adquiridos da superclasse
			this.Modelo = Modelo;
			this.tamanho = tamanho;

		}

		public String getModelo() {
			return Modelo;
		}

		public void setModelo(String modelo) {
			Modelo = modelo;
		}

		public String getTamanho() {
			return tamanho;
		}

		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}
		
		
	}


