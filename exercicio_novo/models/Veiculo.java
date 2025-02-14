package exercicio_novo.models;

public class Veiculo {

        private String placa;
        private String cor;
        private int numeroDePassageiros;
        private double capacidadeDoTanque;
        private double velocidadeMaxima;
        private double consumoMedio;
        
        public Veiculo(String placa, String cor, int numeroDePassageiros, double capacidadeDoTanque,
                double velocidadeMaxima, double consumoMedio) {
            this.placa = placa;
            this.cor = cor;
            this.numeroDePassageiros = numeroDePassageiros;
            this.capacidadeDoTanque = capacidadeDoTanque;
            this.velocidadeMaxima = velocidadeMaxima;
            this.consumoMedio = consumoMedio;
        }
       
        
        public String getPlaca() {
            return placa;
        }
        public void setPlaca(String placa) {
            this.placa = placa;
        }
        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }
        public int getNumeroDePassageiros() {
            return numeroDePassageiros;
        }
        public void setNumeroDePassageiros(int numeroDePassageiros) {
            this.numeroDePassageiros = numeroDePassageiros;
        }
        public double getCapacidadeDoTanque() {
            return capacidadeDoTanque;
        }
        public void setCapacidadeDoTanque(double capacidadeDoTanque) {
            this.capacidadeDoTanque = capacidadeDoTanque;
        }
        public double getVelocidadeMaxima() {
            return velocidadeMaxima;
        }
        public void setVelocidadeMaxima(double velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
        }
        public double getConsumoMedio() {
            return consumoMedio;
        }
        public void setConsumoMedio(double consumoMedio) {
            this.consumoMedio = consumoMedio;
        }
        
        

}
