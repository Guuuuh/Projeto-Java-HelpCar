package model;

public class Servico {
    private int codServico;
    private int codEmpresa;
    private int codTipoServico;
    private double valor;

    public Servico() {
    }

    public Servico(int codServico, int codEmpresa, int codTipoServico, double valor) {
        this.codServico = codServico;
        this.codEmpresa = codEmpresa;
        this.codTipoServico = codTipoServico;
        this.valor = valor;
    }

    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    public int getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public int getCodTipoServico() {
        return codTipoServico;
    }

    public void setCodTipoServico(int codTipoServico) {
        this.codTipoServico = codTipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" + "codServico=" + codServico + ", codEmpresa=" + codEmpresa + ", codTipoServico=" + codTipoServico + ", valor=" + valor + '}';
    }
    
}
