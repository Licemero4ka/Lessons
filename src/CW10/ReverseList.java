package CW10;
import java.util.ArrayList;
import java.util.List;

public class ReverseList<T> {
    public List<T> printReverseList(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args){
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        ReverseList<Integer> reverseList = new ReverseList<>();
        List<Integer> reversed = reverseList.printReverseList(intList);

        System.out.println("Original List: " + intList);
        System.out.println("Reversed List: " + reversed);


        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        ReverseList<String> reverseList1 = new ReverseList<>();
        List<String> reversed1 = reverseList1.printReverseList(stringList);
        System.out.println("Original List: " + stringList);
        System.out.println("Reversed List: " + reversed1);
    }

}

