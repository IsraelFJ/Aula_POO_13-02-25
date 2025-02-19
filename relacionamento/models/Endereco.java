package relacionamento.models;

public class Endereco{

    private String logradouro;
    private String numeroResidencia;
    private String cidade;

    public Endereco(){}
    
    public Endereco  (String logradouro, String numeroResidencia, String cidade) {
        this.logradouro = logradouro;
        this.numeroResidencia = numeroResidencia;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco [logradouro=" + logradouro + ", numeroResidencia=" + numeroResidencia + ", cidade=" + cidade
                + "]";
    }
   
    
}
