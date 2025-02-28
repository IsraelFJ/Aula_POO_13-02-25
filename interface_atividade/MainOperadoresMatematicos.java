package interface_atividade;

import interface_atividade.models_atividade.Divisao;
import interface_atividade.models_atividade.Multiplicacao;
import interface_atividade.models_atividade.Soma;
import interface_atividade.models_atividade.Subtracao;

public class MainOperadoresMatematicos {

    public static void main(String[] args) {
        
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.Calcular(0, 0));
        System.out.println(subtracao.Calcular(0, 0));
        System.out.println(multiplicacao.Calcular(0, 0));
        System.out.println(divisao.Calcular(0, 0));
    }
}
