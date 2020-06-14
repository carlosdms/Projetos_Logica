public class Retangle {
    private double height;
    private double width;
    
    public void setHeight(double number) {
        this.height = number;
    }
    
    public void setWidth(double number) {
        this.width = number;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getWidth() {
        return this.width;
    }    
    
    public double calculateArea() {
        return this.width * this.height;
    }
    
    public double calculatePerimeter() {
        return (this.width + this.height)*2;
    }
    
    @Override
    public String toString() {
        return "\nAltura: "+ this.height
              +"\nLargura: "+ this.width
              +"\nArea: "+ this.calculateArea()
              +"\nPerímetro: "+ this.calculatePerimeter();
    }
    
}