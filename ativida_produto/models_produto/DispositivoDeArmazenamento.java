package models_produto;

public class DispositivoDeArmazenamento extends Produto{
    private String tipoDeConxao;

    public DispositivoDeArmazenamento(String tipoDeConxao) {
        this.tipoDeConxao = tipoDeConxao;
    }

    public DispositivoDeArmazenamento(String marca, String modelo, String tipoDeConxao) {
        super(marca, modelo);
        this.tipoDeConxao = tipoDeConxao;
    }

    public DispositivoDeArmazenamento(String marca, String modelo, double capacidadeStorage, String tipoDeConxao) {
        super(marca, modelo, capacidadeStorage);
        this.tipoDeConxao = tipoDeConxao;
    }

    public String getTipoDeConxao() {
        return tipoDeConxao;
    }

    public void setTipoDeConxao(String tipoDeConxao) {
        this.tipoDeConxao = tipoDeConxao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento [marca=" + marca + ", tipoDeConxao=" + tipoDeConxao + ", modelo=" + modelo
                + ", capacidadeStorage=" + capacidadeStorage + "]";
    }

    

}
