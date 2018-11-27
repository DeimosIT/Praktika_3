import java.math.*;


public class Rectangle extends Shape{
    protected double width;
    protected double lenght;
    public Rectangle(){
        this.fielled = false;
        this.lenght = 0;
        this.color = " ";
        this.width = 0;
    }
    public Rectangle(double width, double lenght){
        this.fielled = false;
        this.color = " ";
        this.width = width;
        this.lenght = lenght;

    }
    public Rectangle(double width, double lenght, boolean check, String color){
        this.fielled = check;
        this.color = color;
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width*lenght;
    }

    @Override
    double getPerimeter() {
        return (width+lenght)*2;
    }
    @Override
    public String toString(){
        return "Shape: rectangle, width: "+this.width+", lenght: "+this.lenght+", color: "+this.color+"";
    }
}