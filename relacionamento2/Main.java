package relacionamento2;

import relacionamento2.models.ClientePet;
import relacionamento2.models.PetCliente;


public class Main {
    public static void main(String[] args) {

      ClientePet clientePet = new ClientePet("Astolfo", "35", 
      new PetCliente("Bulbasauro", "4", "Kangal"));

      System.out.println(clientePet.toString());
        
    }
}
