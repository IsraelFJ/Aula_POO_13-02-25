package atividade_interface_heranca.models_atividade_heranca_interface;

public class Diretor extends Funcionario implements Contratacao {

        protected double premio;

    

        @Override
        public String admitir() {
            // TODO Auto-generated method stub
            return "Diretor Admitido";
        }
    
        @Override
        public String demitir() {
            // TODO Auto-generated method stub
            return "Diretor Demitido";
        }

        @Override
        public double getsalariofinal() {
            // TODO Auto-generated method stub
            return 200;
        }

    public Diretor(String nome, String dataNescimento, String salarioBase, SexoSetor mASCULLINO, SexoSetor fEMININO,
            SetorSexo fINANCEIRO, SetorSexo oPERACOES, SetorSexo rECURSOS_HUMANOS, double premio) {
        super(nome, dataNescimento, salarioBase, mASCULLINO, fEMININO, fINANCEIRO, oPERACOES, rECURSOS_HUMANOS);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor [nome=" + nome + ", DataNescimento=" + DataNescimento + ", premio=" + premio + ", SalarioBase="
                + SalarioBase + ", MASCULLINO=" + MASCULLINO + ", FEMININO=" + FEMININO + ", FINANCEIRO=" + FINANCEIRO
                + ", OPERACOES=" + OPERACOES + ", RECURSOS_HUMANOS=" + RECURSOS_HUMANOS + "]";
    }

        
    
}
