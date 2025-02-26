


public abstract class  Computador {
        protected String fabricante;
        protected String anoFabricacao;

        public Computador(){}

        public Computador(String fabricante, String anoFabricacao) {
                this.fabricante = fabricante;
                this.anoFabricacao = anoFabricacao;
        }

        public String getFabricante() {
                return fabricante;
        }

        public void setFabricante(String fabricante) {
                this.fabricante = fabricante;
        }

        public String getAnoFabricacao() {
                return anoFabricacao;
        }

        public void setAnoFabricacao(String anoFabricacao) {
                this.anoFabricacao = anoFabricacao;
        }

        @Override
        public String toString() {
                return "Computador [fabricante=" + fabricante + ", anoFabricacao=" + anoFabricacao + "]";
        }

        
}
