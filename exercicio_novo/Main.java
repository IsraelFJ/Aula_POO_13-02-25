package exercicio_novo;

import java.util.Scanner;

import exercicio_novo.models.Veiculo;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        Veiculo veiculo = new Veiculo("666qwert", "red", 5, 40, 200, 18);
        
        System.out.println("Placa:" + veiculo.getPlaca());    
        System.out.println("Cor" +veiculo.getCor());    
        System.out.println("Número de passageiros: " +veiculo.getNumeroDePassageiros());    
        System.out.println("Capacidade do tanque: " +veiculo.getCapacidadeDoTanque());    
        System.out.println("Velocidade máxima: " +veiculo.getVelocidadeMaxima());    
        System.out.println("Consumo médio: "+veiculo.getConsumoMedio());    
            
            




        
    }
}
