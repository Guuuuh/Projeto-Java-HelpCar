package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private int codEmpresa;
	private String nomeFantasia;
	private String cnpj;
	private String contatoEmpresa;
	private List<Endereco> enderecosEmpresas = new ArrayList<>();

	public Empresa() {
	}

	public Empresa(int codEmpresa, String nomeFantasia, String cnpj, String contatoEmpresa) {
		this.codEmpresa = codEmpresa;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.contatoEmpresa = contatoEmpresa;
	}

	// getters
	public int getCodEmpresa() {
		return codEmpresa;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public String getCnpj () {
		return cnpj;
	}
	
	public String getContatoEmpresa () {
		return contatoEmpresa;
	}
	
	public List<Endereco> getEnderecosEmpresas (){
		return enderecosEmpresas;
	}
	
	//setters
	public void setNomeFantasia (String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public void setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void setContatoEmpresa (String contatoEmpresa) {
		this.contatoEmpresa = contatoEmpresa;
	}
	
	//addEndereco
	public void addEndereco (Endereco Endereco) {
		this.enderecosEmpresas.add(Endereco);
	}
	
	//removeEndereco
	public void removeEndereco (Endereco Endereco) {
		this.enderecosEmpresas.remove(Endereco);
	}
	
	//toString
	@Override
	public String toString() {
        return "Empresa ={" + "codEmpresa = " + codEmpresa + " nomeFantasia = " + nomeFantasia + " cnpj = " + cnpj + " contatoEmpresa = " + contatoEmpresa;
    }

}