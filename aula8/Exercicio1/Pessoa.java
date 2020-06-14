public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String email;
    protected String dataDeNascimento;    
    
    protected Pessoa() {
    }
    
    protected void setNome(String nome) {
        this.nome = nome;
    } 
    
    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }    
    
    protected void setEmail(String email) {
        this.email = email;
    }    
    
    protected void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    protected String getNome() {
        return this.nome;
    }
    
    protected String getSobrenome() {
        return this.sobrenome;
    }
    
    protected String getEmail() {
        return this.email;
    }
    
    protected String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
}