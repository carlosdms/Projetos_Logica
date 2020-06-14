public class Pet {

    protected String dataNascimento;
    
    public Pet() {
    }
    
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
        return "\nData de nascimento: " + this.dataNascimento;
    }
    
}