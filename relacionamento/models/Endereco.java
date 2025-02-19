package relacionamento.models;

public class Endereco{

    private String logradouro;
    private int numeroResidencia;
    private String cidade;

    public Endereco(){}
    
    public Endereco  (String logradouro, int numeroResidencia, String cidade) {
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

    public int getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
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
