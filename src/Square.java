public class Square extends Rectangle {

    protected double side;

    public Square() {
        this.side = 0;
        this.color = " ";
        this.fielled = false;
    }
    public Square(double side){
        this.side = side;
        this.fielled = false;
        this.color = " ";
    }
    public Square(double side, boolean check, String color){
        this.side = side;
        this.fielled = check;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side){
        this.side = side;
    }
    @Override
    public void setLenght(double side){
        this.side = side;
    }
    @Override
    public String toString(){
        return "Shape: square, width: "+this.side+", lenght: "+this.side+", color: "+this.color+"";
    }
}
