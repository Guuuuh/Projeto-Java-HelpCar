
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
}
