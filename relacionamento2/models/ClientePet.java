package relacionamento2.models;

public class ClientePet {

    private String nomeCLiente;
    private String idadeCliente;
    private PetCliente petCliente ;

    public ClientePet(){}

    public ClientePet(String nomeCLiente, String idadeCliente, PetCliente petCliente) {
        this.nomeCLiente = nomeCLiente;
        this.idadeCliente = idadeCliente;
        this.petCliente = petCliente;
    }

    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
    }

    public String getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(String idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public PetCliente getPetCliente() {
        return petCliente;
    }

    public void setPetCliente(PetCliente petCliente) {
        this.petCliente = petCliente;
    }

    @Override
    public String toString() {
        return "ClientePet [nomeCLiente=" + nomeCLiente + ", idadeCliente=" + idadeCliente + ", petCliente="
                + petCliente + "]";
    }

    
}
