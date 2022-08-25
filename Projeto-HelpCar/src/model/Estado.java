package model;

public class Estado {

    private int codEstado;
    private String nome;
    private String uf;
    private String pais;
    
    public Estado(){
    }

    public Estado(int codEstado, String nome, String uf, String pais) {
        this.codEstado = codEstado;
        this.nome = nome;
        this.uf = uf;
        this.pais = pais;
        
    }

    public int getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(int codEstado) {
        this.codEstado = codEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" + "codEstado=" + codEstado + ", nome=" + nome + ", uf=" + uf + ", pais=" + pais + '}';
    }
    
}
