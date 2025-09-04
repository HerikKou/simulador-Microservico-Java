
import Carro.Model.Carro;
import Carro.Service.CarroService;
import Concessionaria.Service.ConcessionariaService;
import src.Model.Cliente;
import src.Service.Service;

public class Main {
    public static void main(String[] args) {
      Service cl = new Service(); 
      CarroService cs = new CarroService();
      ConcessionariaService concessionaria = new ConcessionariaService();
      cl.cadastrar(1, "Maria", "Maria@gmail.com", 2);;
      cs.cadastrarCarro(1, "HB20s", "Prata", "Hyundai", 80000.00);
      Cliente cliente = cl.buscarCliente(1);
      Carro carro = cs.buscarCarro(1);
      
      concessionaria.cadastrar(1, "Loja X",cliente,carro );
      System.out.println(concessionaria.toString());

      
    }
}
