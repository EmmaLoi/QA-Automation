package HW_4;

public class ExampleString {

    public static void main(String[] args) {

        String workWithString = "Since a String is an immutable sequence of characters, we can ask what character is in " +
                "what position, or find the position of a character. Indexing of a String starts at 0, like we're used " +
                "to with arrays.";

        // Finding Characters and Substrings:

        System.out.println(workWithString.charAt(8));

        System.out.println(workWithString.indexOf('a'));
        System.out.println(workWithString.indexOf('n', 12));
        System.out.println(workWithString.indexOf("Indexing"));
        System.out.println(workWithString.indexOf("String", 30));

        System.out.println(workWithString.lastIndexOf('a'));
        System.out.println(workWithString.lastIndexOf(' ', 45));
        System.out.println(workWithString.lastIndexOf("starts"));
        System.out.println(workWithString.lastIndexOf("character", 180));

        // Determine String Length:

        if (workWithString.length() > 200) {
            System.out.println("This string more than 200 characters. Length = " + workWithString.length());
        } else {
            System.out.println("This string less then 200 characters");
        }

        if (workWithString.isEmpty() == true) {
            System.out.println("This string is empty");
        } else {
            System.out.println("This string isn't empty. Length = " + workWithString.length());
        }

        // Extracting Substrings

        System.out.println(workWithString.substring(8, 14));
        System.out.println(workWithString.substring(139));
        System.out.println(workWithString.substring(workWithString.length()-7));
    }
}