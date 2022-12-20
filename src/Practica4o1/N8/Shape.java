package Practica4o1.N8;

public abstract class Shape {
    String colour;
    boolean filled;
    Shape(){

    }
    Shape(String colour, boolean filled){

    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
