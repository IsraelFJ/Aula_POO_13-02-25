import relacionamento.models.Cliente;
import relacionamento.models.Endereco;

public class Main{
    public static void main(String[] args) {

      Cliente clienteUm = new Cliente("Juaum", "120", 
      new Endereco("rua b ","120","Salvador") );

      System.out.println(clienteUm.toString());

    }
}