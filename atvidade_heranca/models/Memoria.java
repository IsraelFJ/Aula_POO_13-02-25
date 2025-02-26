public class Memoria extends Computador{

    private String marca;
    private String modelo;
    private String capacidadeDeArmazenamento;

    public Memoria(){}

    public Memoria(String fabricante, String anoFabricacao, String marca, String modelo,
            String capacidadeDeArmazenamento) {
        super(fabricante, anoFabricacao);
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
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

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", fabricante=" + fabricante + ", modelo=" + modelo + ", anoFabricacao="
                + anoFabricacao + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
    }

    
    

}
