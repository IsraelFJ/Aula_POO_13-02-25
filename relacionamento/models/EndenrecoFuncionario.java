package models;

public class EndenrecoFuncionario {

    private String logradouro;
    private String numeroCasa;
    private String cidade;
    private String estado;

    public EndenrecoFuncionario(){}

    public EndenrecoFuncionario(String logradouro, String numeroCasa, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EndenrecoFuncionario [logradouro=" + logradouro + ", numeroCasa=" + numeroCasa + ", cidade=" + cidade
                + ", estado=" + estado + "]";
    }

    

}
