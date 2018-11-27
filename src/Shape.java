public abstract class Shape {

    protected String color;
    protected boolean fielled;

    public Shape(){
        this.color = " ";
        this.fielled = false;
    }
    public Shape(String color, boolean fielled)
    {
        this.color = color;
        this.fielled = fielled;
    }

    public String getColor()
    {
        return color;
    }

    public boolean isFielled() {
        return fielled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFielled(boolean fielled) {
        this.fielled = fielled;
    }

    @Override
    public String toString()
    {
        return "Shape: color "+this.color+", fielled "+this.fielled+" ";
    }
    abstract double getArea();
    abstract double getPerimeter();
}
