package Turma20;

public class Cliente {
   
	private String nome;
	private String genero;
	private String email;
	private String phone;
	int total_comprado=0;
	
	
    public Cliente (String nome,String genero,String email,String phone)
{
	   this.nome= nome;
	   this.genero= genero;
	   this.email= email;
	   this.phone= phone;
	
}
    public void  ComprarProduto()
 {
	  this.total_comprado++;
 }
    public void DevolvendoProduto()
   {
	   if(total_comprado>0)
	   {
		   this.total_comprado--;
	   }
   }
   
   public void DadosInfo()
   {
	   System.out.println("\n****Informações do Cliente****\n"+"\nNome: "+nome+"\nGenero: "+genero+"\nE-mail: "+email+"\nTelefone: "+phone);
   }
    public String getNome() {
	  return nome;
}
    public void setNome(String nome) {
	  this.nome = nome;
}
    public String getGenero() {
	  return genero;
}
    public void setGenero(String genero) {
	  this.genero = genero;
}
    public String getEmail() {
	  return email;
}
    public void setEmail(String email) {
	  this.email = email;
}
    public String getPhone() {
	  return phone;
}
    public void setPhone(String phone) {
	  this.phone = phone;
}
    public int getTotal_comprado() {
	  return total_comprado;
}
    public void setTotal_comprado(int total_comprado) {
	  this.total_comprado = total_comprado;
}
}
