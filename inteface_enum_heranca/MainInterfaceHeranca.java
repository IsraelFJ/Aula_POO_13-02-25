package inteface_enum_heranca;

import inteface_enum_heranca.models_interface_enum_heranca.DiretorHeranca;
import inteface_enum_heranca.models_interface_enum_heranca.MotoboyHeranca;
import inteface_enum_heranca.models_interface_enum_heranca.SetorEnum;
import inteface_enum_heranca.models_interface_enum_heranca.SexoEnum;

public class MainInterfaceHeranca {
    public static void main(String[] args) {
        
        MotoboyHeranca motoboyHeranca = new MotoboyHeranca("João", "01/01/1990", 1500.00, 
        SexoEnum.MASCULINO, SetorEnum.OPERACIONAL, "123456789");
        System.out.println(motoboyHeranca.toString());
        System.out.println("====================================");
        
        
        DiretorHeranca diretorHeranca = new DiretorHeranca("Maria", "01/01/1980", 5000.00,
        SexoEnum.FEMININO, SetorEnum.TI, 0.2);
        System.out.println(diretorHeranca.toString());
        System.out.println("Salario final: "+diretorHeranca.getFInalSalario());
        System.out.println("====================================");
        System.out.println(diretorHeranca.dataContratacao()+motoboyHeranca.getNomeSuperFuncionario());
        System.out.println();

      


    }
}
