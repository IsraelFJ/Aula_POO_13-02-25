import models.ContaBancaria;
import models.EndenrecoFuncionario;
import models.Funcionario;

public class Main{
    public static void main(String[] args) {

      Funcionario funcionario = new Funcionario("1234", "Roberto",
      new EndenrecoFuncionario("Rua G", "123", "Salvador", "Bahia")
      , "123456", "mail@mail",new ContaBancaria("Bradesco", "403", "654321",
       "Fisica", "35.000", "50.000"), "");

       System.out.println(funcionario.toString());

    }
}