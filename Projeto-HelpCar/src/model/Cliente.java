
package model;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private int codCliente;
    private String nome;
    private String cpf;
    private String contatoCliente;
    private List<Endereco> enderecoCliente = new ArrayList<>();
    private List<Veiculo> codVeiculo = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int codCliente, String nome, String cpf, String contatoCliente) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.contatoCliente = contatoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContatoCliente() {
        return contatoCliente;
    }

    public void setContatoCliente(String contatoCliente) {
        this.contatoCliente = contatoCliente;
    }

    public List<Endereco> getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(List<Endereco> enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public List<Veiculo> getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(List<Veiculo> codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nome=" + nome + ", cpf=" + cpf + ", contatoCliente=" + contatoCliente + ", enderecoCliente=" + enderecoCliente + ", codVeiculo=" + codVeiculo + '}';
    }
    
    
    
    
    
}
