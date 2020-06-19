package HW_7;

import java.util.LinkedList;
import java.util.List;

public class ExampleLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < 11; i = i + 2) {
            list.add(i);
        }

        for (Integer item: list) {
            System.out.println(item);
        }

        list.remove(2);

        System.out.println("\n" + "Linked List after delete element 3(index 2):");

        for (Integer item: list) {
            System.out.println(item);
        }
    }
}
