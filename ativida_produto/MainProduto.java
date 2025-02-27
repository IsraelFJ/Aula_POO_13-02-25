import models_produto.DispositivoDeArmazenamento;
import models_produto.Memoria;
import models_produto.PlacaMae;
import models_produto.Processador;

public class MainProduto {

    public static void main(String[] args) {

            PlacaMae placamae1 = new PlacaMae("X99-8D4 ZSUS", "ZSUS X99-8D4"
            , "LAG2011-3 V3/V4");

            DispositivoDeArmazenamento dispositivoDeArmazenamento1 = new DispositivoDeArmazenamento("KingSonte",
             " SA400S37", 460, "Sata");

            Memoria memoria = new Memoria("KingStone", "HyperX", 3200.0
            ,500.0);

            Processador processador = new Processador("Xeon", "E5 2680V4"
            , 3.0);

            System.out.println(placamae1.toString());
            System.out.println(dispositivoDeArmazenamento1.toString());
            System.out.println(memoria.toString());
            System.out.println(processador.toString());
    }

}
