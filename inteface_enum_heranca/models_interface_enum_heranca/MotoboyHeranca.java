package inteface_enum_heranca.models_interface_enum_heranca;

public class MotoboyHeranca extends SuperFuncionario{
    private String CarteiraHabilitacaoMotoboy;

    public MotoboyHeranca(String nomeSuperFuncionario, String dataNascimentoSuperFuncionario, double salarioBaseSuperFuncionario, SexoEnum sexoEnum, SetorEnum setorEnum, String carteiraHabilitacaoMotoboy) {
        super(nomeSuperFuncionario, dataNascimentoSuperFuncionario, salarioBaseSuperFuncionario, sexoEnum, setorEnum);
        CarteiraHabilitacaoMotoboy = carteiraHabilitacaoMotoboy;
    }

    public String getCarteiraHabilitacaoMotoboy() {
        return CarteiraHabilitacaoMotoboy;
    }

    public void setCarteiraHabilitacaoMotoboy(String carteiraHabilitacaoMotoboy) {
        CarteiraHabilitacaoMotoboy = carteiraHabilitacaoMotoboy;
    }

    @Override
    public String toString() {
        return "MotoboyHeranca{" +
                "CarteiraHabilitacaoMotoboy='" + CarteiraHabilitacaoMotoboy + '\'' +
                ", nomeSuperFuncionario='" + getNomeSuperFuncionario() + '\'' +
                ", dataNascimentoSuperFuncionario='" + getDataNascimentoSuperFuncionario() + '\'' +
                ", salarioBaseSuperFuncionario=" + getSalarioBaseSuperFuncionario() +
                ", sexoEnum=" + getSexoEnum() +
                ", setorEnum=" + getSetorEnum() +
                '}';
    }

    @Override
    public double getFInalSalario() {
        
        return 0;
    }

}
