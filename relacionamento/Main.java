import relacionamento.models.Cliente;
import relacionamento.models.Endereco;

public class Main{
    public static void main(String[] args) {

       Endereco enderecoPrime = new Endereco("Rua F", 300, "Salvador") 
       Cliente clientePrime = new Cliente("Cleitinho", "40", enderecoPrime);

       System.out.println(clientePrime.toString());


    }
}