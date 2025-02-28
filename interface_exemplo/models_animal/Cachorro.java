package interface_exemplo.models_animal;

public class Cachorro implements Animal{

    @Override
    public String EmitirSom() {
        
        return "AuAuAu!!!";
    }

    @Override
    public String Comer() {
       
        return "Comendo Ração";
    }

 

    

}
