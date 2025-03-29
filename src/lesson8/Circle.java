package lesson8;

public class Circle extends Figure{
    private double radius;


    @Override
    public double calculateSquare() {
        return Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * radius;
    }

    public Circle (double radius){
        super("Circle");
        this.radius = radius;
    }
}
