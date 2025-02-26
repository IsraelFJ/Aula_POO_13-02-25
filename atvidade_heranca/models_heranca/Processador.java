public class Processador extends Computador{

    private String marca;
    private String modelo;
    private String frequencia;

    public Processador(){}

    public Processador(String fabricante, String anoFabricacao, String marca, String modelo, String frequencia) {
        super(fabricante, anoFabricacao);
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

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador [fabricante=" + fabricante + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao="
                + anoFabricacao + ", frequencia=" + frequencia + "]";
    }

    

}
