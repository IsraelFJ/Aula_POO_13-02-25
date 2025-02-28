package interface_atividade.models_atividade;

public class Subtracao implements OperacaoMatematica{

    @Override
    public double Calcular(double a, double b) {
        a = 25;
        b = 10;
        return a - b;
    }



}
