


public class MainHeranca {

    public static void main(String[] args) {

        Memoria memoria = new Memoria("KingStone", "2024", "Hyper X ", "G91166", 
        "3.0Htz");       
        Processador processador  = new Processador("Intel", "2024", "Intel i9", "12400F",
         "2660 MHz a 5300 MHz");

            System.out.println(memoria.toString());
            System.out.println(processador.toString());



    }

}