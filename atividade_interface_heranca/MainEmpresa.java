package atividade_interface_heranca;

import atividade_interface_heranca.models_atividade_heranca_interface.Motoboy;

public class MainEmpresa {
    public static void main(String[] args) {
        
            Motoboy motoboy1 = new Motoboy("José Santana", "30/05/1994", "R$ 2000.00", 
            null, null, null, null,
             null, "N: 2144028 | Categoria-A");
             

            System.out.println(motoboy1.toString());


    }

}
