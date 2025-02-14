import java.util.Scanner;

import models.Livro;
import models.Pessoa;
import models.Pet;

// Autor Israel Falcão Jesus 

public class Main {

    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            int idade;
            int numeroDePaginas;
            double preco;
            String nome;
            String email;
            String titulo;
            String autor;
            String nomePet;
            String raca;
            String porte;
            String alimentacao;
            int idadePet;

        // estanciando o objeto e passando paramentros vazios afim de utilizar variaveis globais para pasage de informação
        Pessoa pessoa = new Pessoa("", "", 0);
        Livro livro = new Livro("","",0,0);// utilizando variaveis locais para solicitar aos usuarios o valor para variavel
        Pet pet = new Pet("", "","","",0);

            System.out.println("Bem vindo! a nossa biblioteca ");
            System.out.println("=================================");
            System.out.println("Faça seu cadastro.");
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Informe seu E-mail: ");
            email = scanner.nextLine();
            System.out.println("Informe sua idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual livro gostaria de alugar?");
            titulo = scanner.nextLine();
            System.out.println("qual autor?");
            autor = scanner.nextLine();
            System.out.println("Quantoas paginas tem  livro?");
            numeroDePaginas = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual valor do livro ?");
            preco = scanner.nextDouble();
            scanner.nextLine();
            //exercicio pet
            System.out.println("Informe o nome do seu pet ");
            nomePet = scanner.nextLine();
            System.out.println("Informe quanl a raça ");
            raca = scanner.nextLine();
            System.out.println("Informe qual o porte do seu pet ");
            porte = scanner.nextLine();
            System.out.println("Qual a alimentação ?");
            alimentacao = scanner.nextLine();
            System.out.println("Qual a idade do seu pet ?");
            idadePet = scanner.nextInt();
            scanner.nextLine();
           
            //utilizando variais locais para passar o paramentro para a estrutura do objeto
            pessoa.setIdade(idade);
            pessoa.setEmail(email);
            pessoa.setNome(nome);
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setNumeroDePaginas(numeroDePaginas);
            livro.setPreco(preco);
            pet.setNomePet(nomePet);
            pet.setRaca(raca);
            pet.setPorte(porte);
            pet.setAlimentacao(alimentacao);
            pet.setIdadePet(idadePet);

            // get entrega o parametro que recebeu do set atraves da variavel global 
            System.out.println("Cadastrado pessoa: "+ pessoa.getNome());
            System.out.println("-----------------------------------");
            System.out.println("seu email de cadastro é E-mail: "+ pessoa.getEmail());
            System.out.println("-----------------------------------");
            System.out.println("A sua idade é: "+ pessoa.getIdade());
            System.out.println("-----------------------------------");
            System.out.println("Você alugou o livro "+ livro.getTitulo() + ", do autor " +livro.getAutor()+
            " com numero de "+ livro.getNumeroDePaginas()+ " páginas, e o valor do livro é de R$: " +livro.getPreco());
            System.out.println("-----------------------------------------------------------------------------------"); 
            System.out.println("Seu pet " +pet.getNomePet()+ ", da raça "+pet.getRaca()+ ", com porte "+ pet.getPorte()+ ", vai se alimetar de "+ pet.getAlimentacao()+
            ", com a idade "+ pet.getIdadePet()+ " anos, está registrado no nosso petshop.");
            System.out.println("---------------------------------------------------------------------------------\n");


    }
}