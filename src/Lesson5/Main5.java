package Lesson5;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Employee Database");

        Employee employee = new Employee();
        employee.setName("Olga");
        employee.setPosition("Manager");
        employee.setTelephone("3333333");
        System.out.println(employee.getName());

        System.out.println("To string: " + employee.toString());
    }

}
