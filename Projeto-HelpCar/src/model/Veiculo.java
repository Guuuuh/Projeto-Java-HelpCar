
package model;


public class Veiculo {
    private int codVeiculo;
    private int codCliente;
    private String marca;
    private String modelo;
    private String ano; 
    private String placa;
    
    public Veiculo(){
        
    }
    
    public Veiculo(int codVeiculo, int codCliente, String marca, String modelo, String ano, String placa){
        this.codVeiculo = codVeiculo;
        this.codCliente = codCliente;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano; 
        this.placa = placa;
    }

    public int getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(int codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "codVeiculo=" + codVeiculo + ", codCliente=" + codCliente + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + '}';
    }
    
}
