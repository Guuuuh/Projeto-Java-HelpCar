package model;

public class Endereco {
	private int codEndereco;
	private Bairro Bairro;
	private String rua;
	private String cep;
	
	public Endereco () {
		
	}
	
	public Endereco (int codEndereco, Bairro codBairro ,String rua, String cep) {
		this.codEndereco = codEndereco;
		this.Bairro = codBairro;
		this.rua = rua;
		this.cep = cep;
	}
	
	//getters
	public int getCodEndereco() {
		return codEndereco;
	}
	
	public Bairro getBairro() {
		return Bairro;
	}
	
	public String getRua() {
		return rua;
	}
	
	public String getCep() {
		return cep;
	}
	
	
	//setters
	public void setBairro(Bairro bairro) {
		Bairro = bairro;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	//toString
	@Override
    public String toString() {
        return "Endereco {" + "codEndereco = " + codEndereco + " Bairro = " + Bairro + " rua = " + rua + " cep = " + cep + '}';
    }
	
	
}