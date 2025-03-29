package lesson8;

public class Triangle extends Figure {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    public Triangle(double base, double height, double sideA, double sideB) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double calculateSquare() {
        return  (base * height)/2;
    }
    @Override
    public double calculatePerimeter() {
        return base + sideA + sideB;
    }


    }

