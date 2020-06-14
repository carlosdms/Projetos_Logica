public class Gato implements Animal {

    private String nome;
    private int quantidadeDePatas;
    
    public Gato() {
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
        return "miauuu";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nQuantidade de patas: " + this.quantidadeDePatas
             + "\nComunicação: " + this.comunicar();
    }
    
}