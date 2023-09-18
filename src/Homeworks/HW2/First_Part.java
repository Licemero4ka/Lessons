package Homeworks.HW2;

public class First_Part {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        String text1 = "Мама мила раму";

        String[] words1 = text1.split(" ");

        for (String word : words1) {
            System.out.print("\n" + word);
        }

        String text2 = "Я хочу перенесення рядків.";
        String replacedText = text2.replace(" ", "\n");
        System.out.print("\n" + replacedText);
    }
}
