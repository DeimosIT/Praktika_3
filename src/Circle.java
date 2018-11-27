import java.math.*;


public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.fielled = false;
        this.color = "blue";
        this.radius = 1;
    }
    public Circle(double radius){
        this.fielled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean check){
        this.fielled = check;
        this.color = "color";
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Shape: circle, radius: "+this.radius+", color: "+this.color+"";
    }
}
