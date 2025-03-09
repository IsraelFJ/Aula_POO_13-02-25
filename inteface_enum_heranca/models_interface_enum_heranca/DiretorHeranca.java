package inteface_enum_heranca.models_interface_enum_heranca;

public class DiretorHeranca extends SuperFuncionario implements ContratacaoInterface {

 private Double PREMIO = 0.2;

public DiretorHeranca(String nomeSuperFuncionario, String dataNascimentoSuperFuncionario,
        double salarioBaseSuperFuncionario, SexoEnum sexoEnum, SetorEnum setorEnum, Double pREMIO) {
    super(nomeSuperFuncionario, dataNascimentoSuperFuncionario, salarioBaseSuperFuncionario, sexoEnum, setorEnum);
    PREMIO = pREMIO;
}

@Override
public double getFInalSalario() {
    double bonus = 0;
    bonus = super.salarioBaseSuperFuncionario;
    bonus += super.salarioBaseSuperFuncionario * this.PREMIO;
    return bonus;
}

@Override
public String dataContratacao() {
   
    return "Funcionrio contratado em 01/01/2021";
}

@Override
public String dataDemissao() {
    
    return "Funcionrio demito em 01/01/2023";
}

public Double getPREMIO() {
    return PREMIO;
}

public void setPREMIO(Double pREMIO) {
    PREMIO = pREMIO;
}

@Override
public String toString() {
    return "DiretorHeranca [nomeSuperFuncionario=" + nomeSuperFuncionario + ", PREMIO=" + PREMIO
            + ", dataNascimentoSuperFuncionario=" + dataNascimentoSuperFuncionario + ", salarioBaseSuperFuncionario="
            + salarioBaseSuperFuncionario + ", sexoEnum=" + sexoEnum + ", setorEnum=" + setorEnum + "]";
}

    
        

 
 
 
 
 
   
 




}
