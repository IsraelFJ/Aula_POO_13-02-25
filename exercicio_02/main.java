package exercicio_02;

import exercicio_02.models.CadastroPessoa;

public class main {
    public static void main(String[] args) {
        
        CadastroPessoa cadastroPessoa = new CadastroPessoa(null, 0, 0, null, 0);
        
        cadastroPessoa.setNomePessoa("Cleiton");
        cadastroPessoa.setIdadePessoa(40);
        cadastroPessoa.setCpf(12345);
        cadastroPessoa.setEndereco("Rua do Cleiton numero 2025 ");
        cadastroPessoa.setTelefone(3245633);
        
        System.out.println("======================================");
        System.out.println("Nome: "+cadastroPessoa.getNomePessoa());
        System.out.println("======================================");
        System.out.println("Idade: "+cadastroPessoa.getIdadePessoa());
        System.out.println("======================================");
        System.out.println("CPF: "+cadastroPessoa.getCpf());
        System.out.println("======================================");
        System.out.println("Endereço: "+cadastroPessoa.getEndereco());
        System.out.println("======================================");
        System.out.println("Telefone: "+cadastroPessoa.getTelefone());
        System.out.println("======================================\n");
    
    }
}
