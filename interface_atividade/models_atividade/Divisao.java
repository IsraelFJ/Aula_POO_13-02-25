package interface_atividade.models_atividade;

public class Divisao implements OperacaoMatematica {

    @Override
    public double Calcular(double a, double b) {
        a = 2;
        b = 12;
        return a / b;
    }

}
