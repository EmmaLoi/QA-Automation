package HW_3;
import java.util.Scanner;

public class Calculator {
    static int firstNumber;
    static int secondNumber;
    static Scanner myObj;
    static String menuItem;

        public static void main(String[] args) {
            while (true) {
                System.out.println("Choose menu item: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("0. Exit");

                myObj = new Scanner(System.in);
                menuItem = myObj.nextLine();

                if (menuItem.isEmpty() ) {
                    System.out.println("Your field is empty");
                }

                if (menuItem.contains("0") || menuItem.contains("exit")) {
                    break;
                }

                switch (menuItem) {
                    case "1":
                        userOutput();
                        System.out.println("Result of addition: " + add());
                        break;
                    case "2":
                        userOutput();
                        System.out.println("Result of subtraction: " + sub());
                        break;
                    case "3":
                        userOutput();
                        System.out.println("Result of multiplication: " + multi());
                        break;
                    case "4":
                        userOutput();
                        System.out.println("Result of division: " + div());
                        break;
                    default:
                        System.out.println("Item not found");
                }
            }
        }

    private static void userOutput() {
        System.out.println("Menu item is: " + menuItem);
        System.out.println("Enter first number: ");
        firstNumber = myObj.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = myObj.nextInt();
    }

    private static int add() {
        return firstNumber + secondNumber;
    }

    private static int sub() {
        return firstNumber - secondNumber;
    }

    private static int multi() {
        return firstNumber * secondNumber;
    }

    private static double div() {
        return (double) firstNumber / (double) secondNumber;
    }
}

