public class Cachorro extends Pet implements Animal {

    private String nome;
    private int quantidadeDePatas;
    
    public Cachorro() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }    

    @Override 
    public int getQuantidadeDePatas() {
        return this.quantidadeDePatas;
    }
    
    @Override
    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }    
    
    @Override
    public String comunicar() {
        return "au auu";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nData de nascimento: " + this.dataNascimento
             + "\nQuantidade de patas: " + this.quantidadeDePatas        
             + "\nComunicação: " + this.comunicar();
    }
    
}