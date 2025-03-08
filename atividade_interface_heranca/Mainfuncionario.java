    public class Mainfuncionario {
        public static void main(String[] args) {
            
                Funcionario motoboy = new Motoboy("José Santana", "15/08/1992", 2000.00, 
               Sexo.MASCULINO, Setor.OPERACOES, "N - 056653023 A");
                Funcionario diretor = new Diretor("Raimundo Nonato", "30/06/1985", 3000.00, 
                Sexo.MASCULINO, Setor.FINANCEIRO);

                System.out.println(motoboy.toString());
                System.out.println("====================");
                System.out.println(diretor.toString());
                System.out.println("Salario liquido: " + diretor.getsalariofinal());

        }
}
