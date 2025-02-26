
/*estudar SOLID*/

public class Main {

    public static void main(String[] args) {
            
      Cliente cliente1 = new Cliente("Marta", "30", "20/02/2025", "PIX");
      Funcionario funcionario1 = new Funcionario("José", "32", "3214hh", "Programador", 4000);

      System.out.println(cliente1.toString());
      System.out.println(funcionario1.toString());

    }

}