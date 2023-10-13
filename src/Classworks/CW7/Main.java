package Classworks.CW7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какую собаку хотите? ");
        String answer1 = scanner.nextLine();
        Doberman dog = new Doberman();
        System.out.print("А как делает собака? ");
        String answer2 = scanner.nextLine();
        dog.makevoice();
        scanner.close();
    }
}
