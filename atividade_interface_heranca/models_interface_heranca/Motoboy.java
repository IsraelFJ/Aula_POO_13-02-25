public class Motoboy extends Funcionario {

    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, double salarioBase, Sexo sexo, Setor setor,
            String carteiraDeHabilitacao) {
        super(nome, dataNascimento, salarioBase, sexo, setor);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getsalariofinal() {
       
        return 0;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy [nome=" + nome + ", carteiraDeHabilitacao=" + carteiraDeHabilitacao + ", dataNascimento="
                + dataNascimento + ", salarioBase=" + salarioBase + ", sexo=" + sexo + ", setor=" + setor + "]";
    }

    
    


}
