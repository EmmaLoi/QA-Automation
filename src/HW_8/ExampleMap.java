package HW_8;

import Lesson_8.Student;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<String, NewStudent> myMap = new HashMap<>();

        int counter = 0;

        myMap.put("id_" + Integer.toString(++counter), new NewStudent("Petro", "ZK385569"));
        myMap.put("id_" + Integer.toString(++counter), new NewStudent("Oksana", "OM124578"));
        myMap.put("id_" + Integer.toString(++counter), new NewStudent("Mary", "KL447852"));
        myMap.put("id_" + Integer.toString(++counter), new NewStudent("Ivan", "RT254879"));
        myMap.put("id_" + Integer.toString(++counter), new NewStudent("Olga", "ZY452687"));
        myMap.put("id_" + Integer.toString(++counter), new NewStudent("Natalka", "OH568471"));

        System.out.println(myMap);

        System.out.println(myMap.get("id_2"));
    }
}
