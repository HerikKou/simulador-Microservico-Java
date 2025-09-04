package src.Service;

import src.Model.*;

import java.util.ArrayList;
import java.util.List;

public class Service {
    static List<Cliente> listadeClientes = new ArrayList<>();
    static Cliente cliente = new Cliente.Builder().build();

    public Service() {

    }

    public void cadastrar(int id, String nome,String email,double saldo) {
        Cliente cliente = new Cliente.Builder().clienteId(id).nome(nome).email(email).saldo(saldo).build();
       listadeClientes.add(cliente);

        System.out.println(cliente.toString());
    }

    public Cliente buscarCliente(int id) {
        if (listadeClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado no sistema");
        }
        for (Cliente cliente : listadeClientes) {
            if (id == cliente.getclienteId()) {
                return cliente;
            }

        }

        System.out.println("Cliente não encontrado");
        return null;

    }

    public List<Cliente> todosClientes() {
        return listadeClientes;
    }

    public Cliente deletarCliente(int id) {
        if (listadeClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado no sistema");
        } else {
            listadeClientes.removeIf(cliente -> id == cliente.getclienteId());
            System.out.println("Cliente deletado com sucesso!!");
            return cliente;
        }
        return null;
    }

}
