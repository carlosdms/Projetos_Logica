public class Calculator implements CalculatorInterface {
    
    public double number1;
    public double number2;
    
    public double getNumber1() {
        return this.number1;
    }
    
    public double getNumber2() {
        return this.number2;
    }
    
    public void setNumber1(double number) {
        this.number1 = number;
    }
    
    public void setNumber2(double number) {
        this.number2 = number;
    }
    
    @Override
    public double sum() {
        return this.number1 + this.number2;
    }
    
    @Override
    public double subtract() {
        return this.number1 - this.number2;
    }
    
    @Override
    public double multiply() {
        return this.number1 * this.number2;
    }
    
    @Override
    public double divide() {
        return this.number1 / this.number2;
    }
    
    
    @Override 
    public String toString() {
        return "\nN1: " + this.number1 +
               "\nN2: " + this.number2 +
               "\nSum: " + this.sum() +
               "\nSubtract: " + this.subtract() +
               "\nMultiply: " + this.multiply() +
               "\nDivide: " + this.divide();
    }
}