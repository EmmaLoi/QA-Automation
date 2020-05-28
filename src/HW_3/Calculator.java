package HW_3;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            while (true) {
                System.out.println("Choose menu item: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("0. Exit");

                Scanner myObj = new Scanner(System.in);  // Create a object that can read user input
                String menuItem = myObj.nextLine();  // Read user input

                if (menuItem.isEmpty() ) {
                    System.out.println("Your field is empty");
                }

                if (menuItem.contains("0") || menuItem.contains("exit")) {
                    break;
                }

                switch (menuItem) {
                    case "1":
                        System.out.println("Menu item is: " + menuItem);
                        System.out.println("Enter first number: ");
                        int firstNumber = myObj.nextInt();
                        System.out.println("Enter second number: ");
                        int secondNumber = myObj.nextInt();
                        System.out.println("Result of addition: " + add(firstNumber, secondNumber));
                        break;
                    case "2":
                        System.out.println("Menu item is: " + menuItem);
                        System.out.println("Enter first number: ");
                        int firstNumber2 = myObj.nextInt();
                        System.out.println("Enter second number: ");
                        int secondNumber2 = myObj.nextInt();
                        System.out.println("Result of subtraction: " + sub(firstNumber2, secondNumber2));
                        break;
                    case "3":
                        System.out.println("Menu item is: " + menuItem);
                        System.out.println("Enter first number: ");
                        int firstNumber3 = myObj.nextInt();
                        System.out.println("Enter second number: ");
                        int secondNumber3 = myObj.nextInt();
                        System.out.println("Result of multiplication: " + multi(firstNumber3, secondNumber3));
                        break;
                    case "4":
                        System.out.println("Menu item is: " + menuItem);
                        System.out.println("Enter first number: ");
                        int firstNumber4 = myObj.nextInt();
                        System.out.println("Enter second number: ");
                        int secondNumber4 = myObj.nextInt();
                        System.out.println("Result of division: " + div(firstNumber4, secondNumber4));
                        break;
                    default:
                        System.out.println("Item not found");
                }
            }
        }

        private static int add(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
         private static int sub(int firstNumber2, int secondNumber2) {
            return firstNumber2 - secondNumber2;
        }
        private static int multi(int firstNumber3, int secondNumber3) {
            return firstNumber3 * secondNumber3;
        }
        private static double div(double firstNumber4, double secondNumber4){
            return firstNumber4 / secondNumber4;
        }
    }

