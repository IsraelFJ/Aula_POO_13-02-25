package exercicio_02.models;

public class CadastroPessoa {

    private String nomePessoa;
    private int idadePessoa;
    private int cpf;
    private String endereco;
    private int telefone;
    
    public CadastroPessoa(String nomePessoa, int idadePessoa, int cpf, String endereco, int telefone) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public int getIdadePessoa() {
        return idadePessoa;
    }
    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    

}
