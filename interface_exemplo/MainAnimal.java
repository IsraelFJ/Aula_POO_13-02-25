package interface_exemplo;

import interface_exemplo.models_animal.Cachorro;
import interface_exemplo.models_animal.Galo;
import interface_exemplo.models_animal.Gato;
import interface_exemplo.models_animal.Pato;

public class MainAnimal {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();

        System.out.println(cachorro.EmitirSom());
        System.out.println(cachorro.Comer());
        System.out.println(gato.EmitirSom());
        System.out.println(gato.Comer());
        System.out.println(galo.EmitirSom());
        System.out.println(galo.Comer());
        System.out.println(pato.EmitirSom());
        System.out.println(pato.Comer());

    }

}
