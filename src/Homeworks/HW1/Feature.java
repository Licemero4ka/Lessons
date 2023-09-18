package Homeworks.HW1;

import java.sql.SQLOutput;

public class Feature {
    public static void main(String[] args) {
        //First part
        String name = "Egor";
        int height = 186;
        float weight = 80.5f;

        System.out.println("name=" + name + ", height=" + height + ", weight=" + weight);
        //Second part
        int a = 1;
        int b = 2;
        int buff = a;
        a = b;
        b = buff;

        System.out.println("a = " + a + ", b = " + b);
        //Third part
        int c = 5;
        int d = 3;

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("c = " + c + ", d = " + d);

    }

}

