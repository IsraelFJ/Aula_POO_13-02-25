package models_produto;

public class Processador extends Produto {

    public Processador(String marca, String modelo, Double frequencia) {
        //TODO Auto-generated constructor stub
        super(marca, modelo, frequencia);
        this.setFrequencia(frequencia);
    }
    
    @Override
    public String toString() {
        return "Processador []" + super.toStringFrequencia() ;
    }

}
