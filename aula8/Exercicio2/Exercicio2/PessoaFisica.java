public class PessoaFisica extends Cliente{
    private String estadoCivil;
    private String cpf;
    private String dataDeNascimento;
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    
    @Override
    public String toString() {
        return "\nCodigo do cliente: " + this.codigoDoCliente +
               "\nNome: " + this.nome +
               "\nPeofissão: " + this.profissao +
               "\nEstado Civil: " + this.getEstadoCivil() +
               "\nCPF: " + this.getCPF() +
               "\nData de Nascimento: " + this.getDataDeNascimento();
    }
}