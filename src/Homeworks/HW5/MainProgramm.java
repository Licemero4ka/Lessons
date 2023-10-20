package Homeworks.HW5;
public class MainProgramm {
    public static void main(String[] args) {
        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;

        System.out.println("a1.x: " + a1.getX());
        System.out.println("a2.x: " + a2.getX());

        a1.setX(5);


        System.out.println("New a1.x: " + a1.getX());
        System.out.println("New a2.x: " + a2.getX());
    }
}
