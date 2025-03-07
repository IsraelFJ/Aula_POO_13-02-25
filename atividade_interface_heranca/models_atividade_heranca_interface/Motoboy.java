package atividade_interface_heranca.models_atividade_heranca_interface;

public class Motoboy extends Funcionario implements Contratacao{

    protected String carteiraDeHabilitacao;

  

    @Override
    public String admitir() {
        // TODO Auto-generated method stub
        return "Funcionario Admitido.";
    }

    @Override
    public String demitir() {
        // TODO Auto-generated method stub
        return "Funcionario Demitido";
    }



    @Override
    public double getsalariofinal() {
        // TODO Auto-generated method stub
        return 0;
    }



    public Motoboy(String nome, String dataNescimento, String salarioBase, SexoSetor mASCULLINO, SexoSetor fEMININO,
            SetorSexo fINANCEIRO, SetorSexo oPERACOES, SetorSexo rECURSOS_HUMANOS, String carteiraDeHabilitacao) {
        super(nome, dataNescimento, salarioBase, mASCULLINO, fEMININO, fINANCEIRO, oPERACOES, rECURSOS_HUMANOS);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

      

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy [nome=" + nome + ", DataNescimento=" + DataNescimento + ", carteiraDeHabilitacao="
                + carteiraDeHabilitacao + ", SalarioBase=" + SalarioBase + ", MASCULLINO=" + MASCULLINO + ", FEMININO="
                + FEMININO + ", OPERACOES=" + OPERACOES + "]";
    }

   

}
