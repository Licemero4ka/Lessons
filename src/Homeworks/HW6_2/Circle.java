package Homeworks.HW6_2;

public class Circle extends Figure{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * radius * radius;
    }
}
