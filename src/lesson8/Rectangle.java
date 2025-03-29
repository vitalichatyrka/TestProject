package lesson8;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    @Override
    public double calculateSquare() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    public Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
