package relacionamento2.models;

public class PetCliente {

    private String nomePet;
    private String IdadePet;
    private String RacaPet;

    public PetCliente(){}

    public PetCliente(String nomePet, String idadePet, String racaPet) {
        this.nomePet = nomePet;
        IdadePet = idadePet;
        RacaPet = racaPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getIdadePet() {
        return IdadePet;
    }

    public void setIdadePet(String idadePet) {
        IdadePet = idadePet;
    }

    public String getRacaPet() {
        return RacaPet;
    }

    public void setRacaPet(String racaPet) {
        RacaPet = racaPet;
    }

    @Override
    public String toString() {
        return "PetCliente [nomePet=" + nomePet + ", IdadePet=" + IdadePet + ", RacaPet=" + RacaPet + "]";
    }

    

}
