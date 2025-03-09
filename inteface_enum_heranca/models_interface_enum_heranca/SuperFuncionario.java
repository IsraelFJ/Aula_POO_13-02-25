package inteface_enum_heranca.models_interface_enum_heranca;

public abstract class SuperFuncionario {

    protected String nomeSuperFuncionario;
    protected String dataNascimentoSuperFuncionario;
    protected double salarioBaseSuperFuncionario;
    protected SexoEnum sexoEnum;
    protected SetorEnum setorEnum;

    public SuperFuncionario(String nomeSuperFuncionario, String dataNascimentoSuperFuncionario, double salarioBaseSuperFuncionario, SexoEnum sexoEnum, SetorEnum setorEnum) {
        this.nomeSuperFuncionario = nomeSuperFuncionario;
        this.dataNascimentoSuperFuncionario = dataNascimentoSuperFuncionario;
        this.salarioBaseSuperFuncionario = salarioBaseSuperFuncionario;
        this.sexoEnum = sexoEnum;
        this.setorEnum = setorEnum;
    }

    public String getNomeSuperFuncionario() {
        return nomeSuperFuncionario;
    }

    public void setNomeSuperFuncionario(String nomeSuperFuncionario) {
        this.nomeSuperFuncionario = nomeSuperFuncionario;
    }

    public String getDataNascimentoSuperFuncionario() {
        return dataNascimentoSuperFuncionario;
    }

    public void setDataNascimentoSuperFuncionario(String dataNascimentoSuperFuncionario) {
        this.dataNascimentoSuperFuncionario = dataNascimentoSuperFuncionario;
    }

    public double getSalarioBaseSuperFuncionario() {
        return salarioBaseSuperFuncionario;
    }

    public void setSalarioBaseSuperFuncionario(double salarioBaseSuperFuncionario) {
        this.salarioBaseSuperFuncionario = salarioBaseSuperFuncionario;
    }

    public SexoEnum getSexoEnum() {
        return sexoEnum;
    }

    public void setSexoEnum(SexoEnum sexoEnum) {
        this.sexoEnum = sexoEnum;
    }

    public SetorEnum getSetorEnum() {
        return setorEnum;
    }

    public void setSetorEnum(SetorEnum setorEnum) {
        this.setorEnum = setorEnum;
    }

    @Override
    public String toString() {
        return "SuperFuncionario{" +
                "nomeSuperFuncionario='" + nomeSuperFuncionario + '\'' +
                ", dataNascimentoSuperFuncionario='" + dataNascimentoSuperFuncionario + '\'' +
                ", salarioBaseSuperFuncionario=" + salarioBaseSuperFuncionario +
                ", sexoEnum=" + sexoEnum +
                ", setorEnum=" + setorEnum +
                '}';
    }

    public abstract double getFInalSalario();
    

}
