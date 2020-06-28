package Lesson_8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Practice2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {

            Student student = new Student("Student_" + i, ThreadLocalRandom.current().nextInt());
            students.add(student);
        }
        for (Student item : students) {
            System.out.println(item);
        }
    }
}
