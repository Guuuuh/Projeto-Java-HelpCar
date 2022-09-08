package model;

public class Bairro {

    private int codBairro;
    private Cidade cidade;
    private String nome;

    public Bairro() {

    }

    public Bairro(int codBairro, Cidade cidade, String nome) {
        this.codBairro = codBairro;
        this.cidade = cidade;
        this.nome = nome;
    }

    public int getCodBairro() {
        return codBairro;
    }

    public void setCodBairro(int codBairro) {
        this.codBairro = codBairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Bairro{" + "codBairro=" + codBairro + ", cidade=" + cidade + ", nome=" + nome + '}';
    }

}
