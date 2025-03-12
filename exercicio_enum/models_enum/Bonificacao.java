package exercicio_enum.models_enum;

public enum Bonificacao {

    DIRETOR(1.1), GERENTE(1.5), DBA(1.2), TESTADOR(1.3);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
