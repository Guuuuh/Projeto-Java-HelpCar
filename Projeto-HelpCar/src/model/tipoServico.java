package model;

public class TipoServico {
    private int codTipoServico;
    private int codEmpresa;
    private String descricao;

    public TipoServico() {
    }

    public TipoServico(int codTipoServico, int codEmpresa, String descricao) {
        this.codTipoServico = codTipoServico;
        this.codEmpresa = codEmpresa;
        this.descricao = descricao;
    }

    public int getCodTipoServico() {
        return codTipoServico;
    }

    public void setCodTipoServico(int codTipoServico) {
        this.codTipoServico = codTipoServico;
    }

    public int getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "tipoServico{" + "codTipoServico=" + codTipoServico + ", codEmpresa=" + codEmpresa + ", descricao=" + descricao + '}';
    }
    
}
