package interface_exemplo.models_animal;

public class Gato implements Animal{

    @Override
    public String EmitirSom() {
        return "MiauMiau";
    }

    @Override
    public String Comer() {
       
        return "Comendo Peixe";
    }

   

}
