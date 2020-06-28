package Lesson_8;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
        for (Object item: list) {
            System.out.println(item);
        }
    }
}
