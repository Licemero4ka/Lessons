package Classworks.CW3;

public class Lesson4_Classwork {
    public static void main(String[] args) {
        int z = 4;
        if (z % 2 == 0) {
            System.out.println(1);
        } else
            System.out.println(0);

        int a = 7;
        int b = 4;
        int c = 8;

        if (a > b) {
            if (a > c) {
                System.out.println("a is the biggest");
            } else {
                System.out.println("c is the biggest");
            }
        } else if (b > c) {
            System.out.println("b is the biggest");
        } else {
            System.out.println("c is te biggest");
        }
    }
}

