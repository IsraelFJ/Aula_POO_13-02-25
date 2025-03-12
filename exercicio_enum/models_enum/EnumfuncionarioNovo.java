package exercicio_enum.models_enum;

public abstract class EnumfuncionarioNovo {
        protected String nomeEnum;
        protected String cpfEnum;
        protected String dataNascimentoEnum;
        protected String salarioEnum;
        protected SetorEnum setorEnum;
        protected SexoEnum sexoEnum;
        protected Bonificacao bonificacao;
        protected boolean status;

        public EnumfuncionarioNovo(String nomeEnum, String cpfEnum, String dataNascimentoEnum, String salarioEnum, SetorEnum setorEnum, SexoEnum sexoEnum, Bonificacao bonificacao, boolean status) {
            this.nomeEnum = nomeEnum;
            this.cpfEnum = cpfEnum;
            this.dataNascimentoEnum = dataNascimentoEnum;
            this.salarioEnum = salarioEnum;
            this.setorEnum = setorEnum;
            this.sexoEnum = sexoEnum;
            this.bonificacao = bonificacao;
            this.status = status;
        }

        public String getNomeEnum() {
            return nomeEnum;
        }

        public void setNomeEnum(String nomeEnum) {
            this.nomeEnum = nomeEnum;
        }

        public String getCpfEnum() {
            return cpfEnum;
        }

        public void setCpfEnum(String cpfEnum) {
            this.cpfEnum = cpfEnum;
        }

        public String getDataNascimentoEnum() {
            return dataNascimentoEnum;
        }

        public void setDataNascimentoEnum(String dataNascimentoEnum) {
            this.dataNascimentoEnum = dataNascimentoEnum;
        }

        public String getSalarioEnum() {
            return salarioEnum;
        }

        public void setSalarioEnum(String salarioEnum) {
            this.salarioEnum = salarioEnum;
        }

        public SetorEnum getSetorEnum() {
            return setorEnum;
        }

        public void setSetorEnum(SetorEnum setorEnum) {
            this.setorEnum = setorEnum;
        }

        public SexoEnum getSexoEnum() {
            return sexoEnum;
        }

        public void setSexoEnum(SexoEnum sexoEnum) {
            this.sexoEnum = sexoEnum;
        }

        public Bonificacao getBonificacao() {
            return bonificacao;
        }

        public void setBonificacao(Bonificacao bonificacao) {
            this.bonificacao = bonificacao;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "EnumfuncionarioNovo{" +
                    "nomeEnum='" + nomeEnum + '\'' +
                    ", cpfEnum='" + cpfEnum + '\'' +
                    ", dataNascimentoEnum='" + dataNascimentoEnum + '\'' +
                    ", salarioEnum='" + salarioEnum + '\'' +
                    ", setorEnum=" + setorEnum +
                    ", sexoEnum=" + sexoEnum +
                    ", bonificacao=" + bonificacao +
                    ", statua=" + statua +
                    '}';
        }
        public abstract void getSalarioFinalEnum();






}
