public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    
    public Aluno() {
        super();
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota1(double nota) {
        this.nota1 = nota;
    }
    
    public void setNota2(double nota) {
        this.nota2 = nota;
    }
        
    public double calcularMediaAritimetica() {
        return (this.nota1 + this.nota2)/2;
    }
    
    @Override
    public String toString() {
        return "\nNome do aluno: " + this.nome +
               "\nSobrenome: " + this.sobrenome +
               "\nEmail: " + this.email + 
               "\nData de Nascimneto: " + this.dataDeNascimento +
               "\nNota1: " + this.nota1 +
               "\nNota2: " + this.nota2 +
               "\nMédia final: "+ calcularMediaAritimetica();               
    }
    
}