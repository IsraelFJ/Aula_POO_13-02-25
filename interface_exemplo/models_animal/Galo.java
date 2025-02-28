package interface_exemplo.models_animal;

public class Galo implements Animal {

    @Override
    public String EmitirSom() {
        
       return "COcoriCOOOO";
    }

    @Override
    public String Comer() {
        
        return "Comendo Milho";
    }

   

}
