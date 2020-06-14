public class Main {
    public static void main(String args[]) {
        System.out.println("\f");
        Calculator calculator = new Calculator();
        calculator.setNumber1(1.1);
        calculator.setNumber2(1.1);
        
        calculator.sum();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
        
        System.out.println(calculator);
    }
}