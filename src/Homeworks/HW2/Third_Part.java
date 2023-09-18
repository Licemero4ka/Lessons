package Homeworks.HW2;

public class Third_Part {
    public static void main(String[] args) {

        String str = "Hello world!";

        char firstChar = str.charAt(0);
        System.out.println(firstChar);
        char LastChar = str.charAt(str.length() - 1);
        System.out.println(LastChar);

        char[] Chars = new char[5];
        Chars[0] = 'w';
        Chars[1] = 'o';
        Chars[2] = 'r';
        Chars[3] = 'l';
        Chars[4] = 'd';

            System.out.println(Chars);

        for (int i = 0; i < Chars.length; i++) {
            if (i == 3){
                System.out.println(Chars[i]);
            }
        }
        int a = 5;
        int b = 3;
        a++;
        --b;
        System.out.println(a);
        System.out.println(b);

        int x = 5;
        int y = 5;
        int preIncrementResult = ++x;
        int postIncrementResult = y++;
        System.out.println( preIncrementResult);
        System.out.println(postIncrementResult);

    }
}
