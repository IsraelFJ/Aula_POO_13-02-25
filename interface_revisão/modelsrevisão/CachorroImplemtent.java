package interface_revisão.modelsrevisão;

public class CachorroImplemtent implements AnimalRevisao {

    @Override
    public String Acao() {
        
        return "Cahorro Ação - Pegando graveto.";
    }

    @Override
    public String ComeRevisao() {
       
        return "Cachorro comendo - Ração ";
    }

    @Override
    public String EmitirSomRevisao() {
        
        return "Cachorro - Latindo";
    }

}
