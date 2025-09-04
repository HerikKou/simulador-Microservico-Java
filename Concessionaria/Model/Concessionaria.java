package Concessionaria.Model;

import Carro.Model.Carro;
import src.Model.Cliente;

public class Concessionaria {
    private int concessionariaId;
    private String nomeConcessionaria;
    private Cliente cliente;
    private Carro carro;
    public double taxa(){
        return carro.getValor() * 0.25;
    }
    public Concessionaria(Builder build){
        this.concessionariaId = build.concessionariaId;
        this.nomeConcessionaria = build.nomeConcessionaria;
        this.cliente = build.cliente;
        this.carro = build.carro;
    }
    public static class Builder {
       private int concessionariaId;
    private String nomeConcessionaria;
    private Cliente cliente;
    private Carro carro;
        public Builder concessionariaId(int concessionariaId){this.concessionariaId = concessionariaId; return this;}
        public Builder nomeConcessionaria(String nome){this.nomeConcessionaria = nome; return this;}
        public Builder cliente(Cliente cliente){this.cliente = cliente; return this;}
        public Builder carro(Carro carro){this.carro = carro; return this;}
        public Concessionaria build(){return new Concessionaria(this);}
    } 
    public int getConcessionariaId() {
        return concessionariaId;
    }
    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }
    public Carro getCarro() {
        return carro;
    }
    public Cliente getCliente() {
        return cliente;
    }
     @Override
     public String toString() {
         return"ID da Concessionaria:"+concessionariaId +"|" +"\s" +"Nome da Concessionaria:"+nomeConcessionaria +"|"+"\s"+"Cliente:"+cliente +"|" +"\s" +"Carro:"+carro +"|";
     }   
}


