package models;

public class Funcionario {
    private String codigoFuncionario;
    private String nomeFuncionario;
    private EndenrecoFuncionario EndenrecoFuncionario;
    private String telefone;
    private String email;
    private ContaBancaria ContaBancaria;
    private Sexo Sexo;

    public Funcionario(){}

    public Funcionario(String codigoFuncionario, String nomeFuncionario,
            models.EndenrecoFuncionario endenrecoFuncionario, String telefone, String email,
            models.ContaBancaria contaBancaria, Sexo sexo) {
        this.codigoFuncionario = codigoFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        EndenrecoFuncionario = endenrecoFuncionario;
        this.telefone = telefone;
        this.email = email;
        ContaBancaria = contaBancaria;
        Sexo = sexo;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public EndenrecoFuncionario getEndenrecoFuncionario() {
        return EndenrecoFuncionario;
    }

    public void setEndenrecoFuncionario(EndenrecoFuncionario endenrecoFuncionario) {
        EndenrecoFuncionario = endenrecoFuncionario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancaria() {
        return ContaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        ContaBancaria = contaBancaria;
    }

    public ContaBancaria getSexo() {
        return Sexo;
    }

    public void setSexo(Sexo sexo) {
        Sexo = sexo;
    }
    

    @Override
    public String toString() {
        return "Funcionario [codigoFuncionario=" + codigoFuncionario + ", nomeFuncionario=" + nomeFuncionario
                + ", EndenrecoFuncionario=" + EndenrecoFuncionario + ", telefone=" + telefone + ", email=" + email
                + ", ContaBancaria=" + ContaBancaria + "Sexo= "+ sexo+"]";
    }

    
    

}
