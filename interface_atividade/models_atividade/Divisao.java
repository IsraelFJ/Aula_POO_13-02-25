package interface_atividade.models_atividade;

public class Divisao implements OperacaoMatematica {

    @Override
    public double Calcular(double a, double b) {
        a = 60;
        b = 2;
        return a / b;
    }

}
