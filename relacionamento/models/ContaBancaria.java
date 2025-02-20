package models;

public class ContaBancaria {

    private String banco;
    private String agencia;
    private String numeroDaConta;
    private String tipoDeConta;
    private String saldoAtual;
    private String limiteDisponivel;

    public ContaBancaria(){}

    public ContaBancaria(String banco, String agencia, String numeroDaConta, String tipoDeConta, String saldoAtual,
            String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDeConta = tipoDeConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", numeroDaConta=" + numeroDaConta
                + ", tipoDeConta=" + tipoDeConta + ", saldoAtual=" + saldoAtual + ", limiteDisponivel="
                + limiteDisponivel + "]";
    }

    
    
}
