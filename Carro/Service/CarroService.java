package Carro.Service;

import java.util.ArrayList;
import java.util.List;

import Carro.Model.Carro;
import src.Model.Cliente;

public class CarroService {
    static List<Carro> listaCarros = new ArrayList<>();
   Carro carro = new Carro.Builder().build();
    public CarroService(){
        
    }
    public void cadastrarCarro(int carroId,String modelo,String cor, String marca, double valor){
        int novoID = 2;
         
        for ( Carro carro : listaCarros) {
                if(carro.getCarroId() == novoID){
                    System.out.println("Carro já cadastrado");
                    return;
                }
               
        }
        Carro carro = new Carro.Builder().carroId(carroId).modelo(modelo).cor(cor).marca(marca).valor(valor).build();
        listaCarros.add(carro);
        
        System.out.println(carro.toString());
        System.out.println("Carro cadastrado com sucesso!!");
    }
    public List<Carro> todosCarros(){
        if(listaCarros.isEmpty()){
            System.out.println("Nenhum carro cadastrado!!");
            
        }
        return listaCarros;
    }
    public void quantidadeCarros(){
         if(listaCarros.isEmpty()){
            System.out.println("Nenhum carro cadastrado!!");
        }
        int quantidade = listaCarros.size();
        System.out.println("Quantiade de Carros disponiveis:"+quantidade);
    }
    public Carro excluirCarro(int id){
         if(listaCarros.isEmpty()){
            System.out.println("Nenhum  carro cadastrado!!");
            
        }
       else{
        boolean excluido =  listaCarros.removeIf(carros-> id == carros.getCarroId());
            if(excluido){
                System.out.println("Carro removido com sucesso!!");
            }
            else{
                System.out.println("Carro não encontrado!!");
            }
       }
       return null;
    }
    public Carro buscarCarro(int id){
        for (Carro carro : listaCarros) {
                if(id == carro.getCarroId()){
                    return carro;
                }
           else{
            System.out.println("Carro não encontrado!!");
           }     
        }
        return null;
    }
}
