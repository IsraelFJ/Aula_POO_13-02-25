package interface_atividade.models_atividade;

public class Multiplicacao implements OperacaoMatematica {

    @Override
    public double Calcular(double a, double b) {
        a = 5;
        b = 5;
        return a * b;
    }

}
