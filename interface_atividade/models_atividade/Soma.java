package interface_atividade.models_atividade;

public class Soma implements OperacaoMatematica{

    @Override
    public double Calcular(double a, double b) {
        a = 10;
        b = 30;
        return a + b;
    }

}
