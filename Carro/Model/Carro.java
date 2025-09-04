package Carro.Model;

import src.Model.Cliente;

public class Carro {
    private int carroId;
    private String modelo;
    private String cor;
   private String marca;
    // private Cliente cliente;
    private double valor;


    public Carro(Builder build){
        this.carroId = build.carroId;
        this.modelo = build.modelo;
        this.cor = build.cor;
        this.marca = build.marca;
        // this.cliente = build.cliente;
        this.valor = build.valor;
    }
    public Builder build(){
        return new Builder();
    }

    public static class Builder {
    private int carroId;
    private String modelo;
    private String cor;
    private String marca;
    // private Cliente cliente;
    private double valor;

    public Builder carroId(int carroId){this.carroId = carroId; return this;}
    public Builder modelo(String modelo){this.modelo = modelo; return this;}
    public Builder cor(String cor){this.cor = cor; return this;}
    public Builder marca(String marca){this.marca = marca; return this;}
    // public Builder cliente(Cliente cliente){this.cliente = cliente; return this;}
    public Builder valor(double valor){this.valor = valor; return this;}
    public Carro build(){return new Carro(this);}
        
    }
    @Override
    public String toString() {
        return"CarroID:"+carroId +"|" +"\s" +"Modelo:"+modelo +"|" +"\s" +"Cor:"+cor +"|" +"\s" +"Marca:" +marca +"|" +"\s"   +"|" +"\s" +"Valor:"+valor +"|" +"\n"; 
    }

    public int getCarroId() {
        return carroId;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    // public Cliente getCliente() {
    //     return cliente;
    // }
    public double getValor() {
        return valor;
    }
}
