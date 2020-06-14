public class Funcionario extends Pessoa {
    protected int numeroDeRegistro;
    protected double salarioFixo;
    
    protected void setNumeroDeRegistro(int numero) {
        this.numeroDeRegistro = numero;
    }
    
    protected int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
     
    protected double calcularFGTS() {
        return this.salarioFixo * 0.08;
    }
}