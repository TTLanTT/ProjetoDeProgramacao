public class PessoaFisica {
    public String cpf;

    public PessoaFisica(String cpf){
        if (validaCpf(cpf)){
            this.cpf = cpf;
        } else{
            throw new IllegalArgumentException("CPF invalido");
        }
    }
    public String getCpf(){
        return cpf;
    }
    private boolean validaCpf(String cpf){
        cpf = cpf.replaceAll("[^0-9]", "");
        
        if (cpf.length() == 11){
            return true;
        } else{
            return false;
        }
    }
}

