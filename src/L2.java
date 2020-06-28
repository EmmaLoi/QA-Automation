public class L2 {
    public static void main(String[] args) {
        // комментарий
        /* Тоже комментарий */
        int firstValue = 10;
        int secondValue = 5;
//    System.out.println(firstValue + secondValue);
//
//    System.out.println(10 + 5);
        System.out.println(Math.PI + 2);

        // Типы переменных
        int a = 1;
        int c = 2;
        char b = 'a'; // 'r', 't'
        boolean state = false; // true

        System.out.println(a == c);

        if (a == c) // условие
        {
            // выполнить, если условие true
            System.out.println("a == c - true");
        } else {
            // выполнить, если условие false
            System.out.println("a не равен c");
        }

        boolean x = true;
        boolean y = false;

        System.out.println("&& = " + (x && y));
        System.out.println("|| = " + (x || y));


        String name = "Artur\n";
        // System.out.print(name);
        // Scanner scan = new Scanner();


    }
}
