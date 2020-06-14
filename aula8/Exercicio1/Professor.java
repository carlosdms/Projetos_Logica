public class Professor extends Funcionario {
    public double horasTrabalhadas;
    public double valorHora;
    
    public Professor() {
        super();
    }   
    
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }   
    
    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }
       
    public double calcularSalarioBruto() {
        return this.valorHora * this.horasTrabalhadas;
    }
    
    @Override
    public double calcularFGTS() {
        return this.calcularSalarioBruto() * 0.08;
    }
    
    @Override
    public String toString() {
        return "\nNome do Professor: " + this.nome + " " + this.sobrenome +
               "\nEmail do Professor: " + this.email + 
               "\nData de Nascimento: " + this.dataDeNascimento +
               "\nNúmero de registro: " + this.numeroDeRegistro +
               "\nHorasTrabalhadas: " + this.horasTrabalhadas +
               "\nValor da hora trabalhada: " + this.valorHora +
               "\nSalario Bruto: " + this.calcularSalarioBruto() +
               "\nCalculo do FGTS: " + this.calcularFGTS();
    }
    
}