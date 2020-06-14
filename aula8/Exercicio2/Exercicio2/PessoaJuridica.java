public class PessoaJuridica extends Cliente{
    private String razaoSocial;
    private String cnpj;
    private int inscricaoEstadual;
    private double capitalInicial;
    
    public PessoaJuridica() {
        super();
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public String getCNPJ() {
        return this.cnpj;
    }
    
    public int getInscricaoEstadual() {
        return this.inscricaoEstadual;
    } 
    
    public double getCapitalInicial() {
        return this. capitalInicial;
    } 
        
    @Override
    public String toString() {
        return "\nCodigo do cliente: " + this.codigoDoCliente +
               "\nNome: " + this.nome +
               "\nPeofissão: " + this.profissao +
               "\nRazãoSocial: " + this.razaoSocial +
               "\nCNPJ: " + this.cnpj +
               "\nInscrição Estadual: " + this.inscricaoEstadual +
               "\nCapital Inicial: " + this.capitalInicial;
    }
}