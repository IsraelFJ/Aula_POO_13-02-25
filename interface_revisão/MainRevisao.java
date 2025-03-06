package interface_revisão;

import interface_revisão.modelsrevisão.CachorroImplemtent;
import interface_revisão.modelsrevisão.GaloRevisao;
import interface_revisão.modelsrevisão.GatoRevisao;
import interface_revisão.modelsrevisão.PatoRevisao;

public class MainRevisao {
        public static void main(String[] args) {
            
                CachorroImplemtent cachorroImplemtent1 = new CachorroImplemtent();
                GatoRevisao gatoRevisao = new GatoRevisao();
                PatoRevisao patoRevisao = new PatoRevisao();
                GaloRevisao galoRevisao = new GaloRevisao();

                System.out.println(cachorroImplemtent1.EmitirSomRevisao());
                System.out.println(cachorroImplemtent1.ComeRevisao());
                System.out.println(cachorroImplemtent1.Acao());
                System.out.println(gatoRevisao.EmitirSomRevisao());
                System.out.println(gatoRevisao.Acao());
                System.out.println(gatoRevisao.Acao());
                System.out.println(patoRevisao.EmitirSomRevisao());
                System.out.println(patoRevisao.ComeRevisao());
                System.out.println(patoRevisao.Acao());
                System.out.println(galoRevisao.EmitirSomRevisao());
                System.out.println(galoRevisao.ComeRevisao());
                System.out.println(galoRevisao.Acao());
        
        
        
        
        
        
        
        
        
        
        
        
        
        }




}
