package models_produto;

public class Memoria extends Produto {

    
    public Memoria(String marca, String modelo, Double frequencia, double capacidadeStorage) {
        super(marca, modelo, capacidadeStorage); 
        this.setFrequencia(frequencia); 
    }

    @Override
    public String toString() {
        return "Memoria []" + super.toStringArmazenamentoFrequancia() ;
    }

}
