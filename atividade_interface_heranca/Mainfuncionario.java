import java.lang.reflect.Array;

import models_interface_heranca.Funcionario;

public class Mainfuncionario {
        public static void main(String[] args) {
        //         int quantidadeFuncionarios = 0;
        //     Array[] funcionarios = new Array[quantidadeFuncionarios];
                
        //         for (int i = 0; i < quantidadeFuncionarios; i++) {
        //             funcionarios[i] = new Funcionario();
        //         }
               
                Funcionario motoboy = new Motoboy("José Santana", "15/08/1992", 2000.00, 
                Sexo.MASCULINO, Setor.OPERACOES, "N - 056653023 A");
                Funcionario diretor = new Diretor("Raimundo Nonato", "30/06/1985", 3000.00, 
                Sexo.MASCULINO, Setor.FINANCEIRO);
                Funcionario diretor2 = new Diretor("Maria da Silva", "30/06/1985", 3000.00,
                Sexo.FEMININO, Setor.RECURUSOS_HUMANOS);
                

                System.out.println(diretor2.toString());
                System.out.println("Salario liquido: " + diretor2.getsalariofinal());
                System.out.println("====================");
                System.out.println(motoboy.toString());
                System.out.println("====================");
                System.out.println(diretor.toString());
                System.out.println("Salario liquido: " + diretor.getsalariofinal());

        }
}
