package models;

public class Pet {

    private String nomePet;
    private String raca;
    private String porte;
    private String alimentacao;
    private int idadePet;

    public Pet (String nomePet, String raca, String porte, String alimentacao, int idadePet){
        this.nomePet = nomePet;
        this.raca = raca;
        this.porte = porte;
        this.alimentacao = alimentacao;
        this.idadePet = idadePet;
    }
    
    public String getNomePet() {
        return nomePet;
    }
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public String getAlimentacao() {
        return alimentacao;
    }
    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
    public int getIdadePet() {
        return idadePet;
    }
    public void setIdadePet(int idadePet) {
        this.idadePet = idadePet;
    }
    

}
