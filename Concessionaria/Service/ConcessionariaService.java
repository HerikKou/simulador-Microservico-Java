package Concessionaria.Service;

import java.util.ArrayList;
import java.util.List;

import Carro.Model.Carro;
import Carro.Service.CarroService;
import Concessionaria.Model.Concessionaria;
import src.Model.Cliente;
import src.Service.Service;

public class ConcessionariaService {
 
        static List<Concessionaria> concessionarias = new ArrayList<>();
        static List<Cliente> listadeClientes = new ArrayList<>();
        static List<Carro> listaCarros = new ArrayList<>();
     
    
 
        public ConcessionariaService(){}
        public void cadastrar(int concessionariaId,String nomeConcessionaria, Cliente cliente, Carro carro){
            if (cliente.getSaldo() < carro.getValor()) {
                    System.out.println("Saldo insuficiente!");
                    return;
            }
                 
            
            Concessionaria concessionaria = new Concessionaria.Builder().concessionariaId(concessionariaId).nomeConcessionaria(nomeConcessionaria).cliente(cliente).carro(carro).build();
            concessionarias.add(concessionaria);
            System.out.println(concessionaria.toString());
            }
    } 

