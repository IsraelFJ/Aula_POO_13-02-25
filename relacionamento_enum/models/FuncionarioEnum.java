public class FuncionarioEnum {

    private String id;
    private String funcionarioNome;
    private String salario;
    private EnumSexo enumSexo;
    private String idade;
    private Setor setor;

    public FuncionarioEnum(){}

    public FuncionarioEnum(String id, String funcionarioNome, String salario, EnumSexo enumSexo, String idade,
            Setor setor) {
        this.id = id;
        this.funcionarioNome = funcionarioNome;
        this.salario = salario;
        this.enumSexo = enumSexo;
        this.idade = idade;
        this.setor = setor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public EnumSexo getEnumSexo() {
        return enumSexo;
    }

    public void setEnumSexo(EnumSexo enumSexo) {
        this.enumSexo = enumSexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "FuncionarioEnum [id=" + id + ", funcionarioNome=" + funcionarioNome + ", salario=" + salario
                + ", enumSexo=" + enumSexo + ", idade=" + idade + ", setor=" + setor + "]";
    }

    
    


}
