package models_produto;

public abstract class Produto {

   

    protected String marca;
    protected String modelo;
    protected double capacidadeStorage;
    protected Double frequencia;

    public Produto(){}

    public Produto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Produto(String marca, String modelo, double capacidadeStorage) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeStorage = capacidadeStorage;
    }

    public Produto(String marca, Double frequencia, String modelo ) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeStorage() {
        return capacidadeStorage;
    }

    public void setCapacidadeStorage(double capacidadeStorage) {
        this.capacidadeStorage = capacidadeStorage;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    
    public String toStringArmazenamentoFrequancia() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", capacidadeStorage=" + capacidadeStorage
                + ", frequencia=" + frequencia + "]";
    }

    
    public String toStringFrequencia() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + "]";
    }

  
    public String toStringArmazenamento() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", capacidadeStorage=" + capacidadeStorage + "]";
    }

    

            


}
