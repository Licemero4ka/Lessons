package Homeworks.HW3;

public class Second_Part {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 5;
        }
        System.out.println("Changed Numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        float[] floatArray = {1.5f, 2.0f, 3.7f, 4.2f, 5.9f};
        System.out.println("Float array");
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println(floatArray[i] + " ");
        }
        byte Byte = 127;
        int Int = 12345;
        long Long = 9223372036854775807l;
        int[] intArray = new int[3];
        intArray[0] = Byte;
        intArray[1] = Int;
        intArray[2] = (int) Long;

        System.out.println("int array");

        for (int i = 0; i < intArray.length; i++) {

            System.out.println(intArray[i] + " ");

        }

    }
}
