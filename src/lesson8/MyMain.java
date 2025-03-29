package lesson8;

public  class MyMain {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[5];
        shapes[0] = new Triangle(5, 6, 8, 5);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(5, 6);
        shapes[3] = new Circle(10);
        shapes[4] = new Triangle(10, 11, 4, 12);

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
