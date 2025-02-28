package interface_exemplo.models_animal;

public class Pato implements Animal{

    @Override
    public String EmitirSom() {
        
        return "QuaQua !!";
    }

    @Override
    public String Comer() {
        
         return "Comendo Sementes";   

    } 

}
