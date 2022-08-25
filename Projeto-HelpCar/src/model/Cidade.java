package model;

public class Cidade {
    
    private int codCidade;
    private Estado estado;
    private String nome;
    
        public Cidade(){
    }

    public Cidade(int codCidade, Estado estado, String nome) {
        this.codCidade = codCidade;
        this.estado = estado;
        this.nome = nome;
    }

    public int getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codCidade=" + codCidade + ", estado=" + estado + ", nome=" + nome + '}';
    }
    
}
