package Homeworks.HW7_1;

public class Circle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(25);


        System.out.println( + circle1.getPerimeter() + " sm");
        System.out.println(circle2.getPerimeter() + " sm");
    }

}
