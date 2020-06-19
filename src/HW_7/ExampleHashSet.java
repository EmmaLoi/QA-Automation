package HW_7;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<Integer> exampleSet = new HashSet<>();

        for (int i = 2; i < 15; i = i + 3) {
            exampleSet.add(i);
        }

        for (Integer item : exampleSet) {
            System.out.println(item);
        }

        System.out.println("");

        //Удаление по индексу невозможно так как HashSet неупорядоченная коллекция
        exampleSet.remove(2);

        for (Integer item : exampleSet) {
            System.out.println(item);
        }
    }
}
