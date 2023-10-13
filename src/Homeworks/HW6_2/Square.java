package Homeworks.HW6_2;

public class Square extends Figure {
    private double sideLength;

    public Square(double sidelenth) {
        this.sideLength = sidelenth;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}

