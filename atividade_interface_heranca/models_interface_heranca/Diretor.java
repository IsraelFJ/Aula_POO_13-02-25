public class Diretor extends Funcionario implements Contratacao {

    private final double PREMIO = 0.2;

    @Override
    public double getsalariofinal() {
        double resultado = 0;
        resultado = super.salarioBase;
        resultado += super.salarioBase * this.PREMIO;
        return resultado;
    }

    @Override
    public String Admitir() {
        
        return "Status - Funcionario Admitido";
    }

    @Override
    public String Demitir() {
        
        return "Status - Funcionario Demitido";
    }

    public Diretor(String nome, String dataNascimento, double salarioBase, Sexo sexo, Setor setor) {
        super(nome, dataNascimento, salarioBase, sexo, setor);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor [nome=" + nome + ", PREMIO=" + PREMIO + ", dataNascimento=" + dataNascimento + ", salarioBase="
                + salarioBase + ", sexo=" + sexo + ", setor=" + setor + "]";
    }

    
        

}
