package atividade_interface_heranca.models_atividade_heranca_interface;

public abstract class Funcionario {

    protected String nome;
    protected String DataNescimento;
    protected String SalarioBase;
    protected SexoSetor MASCULLINO;
    protected SexoSetor FEMININO;
    protected SetorSexo FINANCEIRO;
    protected SetorSexo OPERACOES;
    protected SetorSexo RECURSOS_HUMANOS;
    
    public Funcionario(String nome, String dataNescimento, String salarioBase, SexoSetor mASCULLINO, SexoSetor fEMININO,
            SetorSexo fINANCEIRO, SetorSexo oPERACOES, SetorSexo rECURSOS_HUMANOS) {
        this.nome = nome;
        DataNescimento = dataNescimento;
        SalarioBase = salarioBase;
        MASCULLINO = mASCULLINO;
        FEMININO = fEMININO;
        FINANCEIRO = fINANCEIRO;
        OPERACOES = oPERACOES;
        RECURSOS_HUMANOS = rECURSOS_HUMANOS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNescimento() {
        return DataNescimento;
    }

    public void setDataNescimento(String dataNescimento) {
        DataNescimento = dataNescimento;
    }

    public String getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(String salarioBase) {
        SalarioBase = salarioBase;
    }

    public SexoSetor getMASCULLINO() {
        return MASCULLINO;
    }

    public void setMASCULLINO(SexoSetor mASCULLINO) {
        MASCULLINO = mASCULLINO;
    }

    public SexoSetor getFEMININO() {
        return FEMININO;
    }

    public void setFEMININO(SexoSetor fEMININO) {
        FEMININO = fEMININO;
    }

    public SetorSexo getFINANCEIRO() {
        return FINANCEIRO;
    }

    public void setFINANCEIRO(SetorSexo fINANCEIRO) {
        FINANCEIRO = fINANCEIRO;
    }

    public SetorSexo getOPERACOES() {
        return OPERACOES;
    }

    public void setOPERACOES(SetorSexo oPERACOES) {
        OPERACOES = oPERACOES;
    }

    public SetorSexo getRECURSOS_HUMANOS() {
        return RECURSOS_HUMANOS;
    }

    public void setRECURSOS_HUMANOS(SetorSexo rECURSOS_HUMANOS) {
        RECURSOS_HUMANOS = rECURSOS_HUMANOS;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", DataNescimento=" + DataNescimento + ", SalarioBase=" + SalarioBase
                + ", MASCULLINO=" + MASCULLINO + ", FEMININO=" + FEMININO + ", FINANCEIRO=" + FINANCEIRO
                + ", OPERACOES=" + OPERACOES + ", RECURSOS_HUMANOS=" + RECURSOS_HUMANOS + "]";
    }

   
    






}

   