import models.ContaBancaria;
import models.EndenrecoFuncionario;
import models.Funcionario;
import models.Sexo;

public class Main{
    public static void main(String[] args) {

      Funcionario funcionario = new Funcionario("1234", "Roberto",
      new EndenrecoFuncionario("Rua G", "123", "Salvador", "Bahia")
      , "123456", "mail@mail",new ContaBancaria("Bradesco", "403", "654321",
       "Fisica", "35.000",
        "50.000"), Sexo.MASCULINO);

       System.out.println(funcionario.toString());

    }
}