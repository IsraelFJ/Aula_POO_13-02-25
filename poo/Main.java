import java.util.Scanner;

import models.Pessoa;

// Autor Israel Falcão Jesus 

public class Main {

    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            int idade;
            String nome;
            String email;
            
            // estanciando o objeto e passando paramentros vazios afim de utilizar variaveis globais para pasage de informação
            Pessoa pessoa = new Pessoa("", "", 0);
            
            // utilizando variaveis locais para solicitar aos usuarios o valor para variavel
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Informe seu E-mail: ");
            email = scanner.nextLine();
            System.out.println("Informe sua idade: ");
            idade = scanner.nextInt();
            
            //utilizando variais locais para passar o paramentro para a estrutura do objeto
            pessoa.setIdade(idade);
            pessoa.setEmail(email);
            pessoa.setNome(nome);
            
            // get entrega o parametro que recebel do set atraves da variavel global 
            System.out.println("Cadastrado pessoa: "+ pessoa.getNome());
            System.out.println("-----------------------------------");
            System.out.println("seu email de cadastro é E-mail: "+ pessoa.getEmail());
            System.out.println("-----------------------------------");
            System.out.println("A sua idade é: "+ pessoa.getIdade());
            System.out.println("-----------------------------------");
            


    }
}