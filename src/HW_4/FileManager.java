package HW_4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileManager {
    static Scanner myObj;
    static Scanner fileScan;
    static String menuItem;
    static String directory = "D:\\Courses\\Java\\CourseHillel\\src\\HW_4\\";

    public static void main(String[] args) {

        while (true) {
            System.out.println("Choose menu item: ");
            System.out.println("1. Create Empty File");
            System.out.println("2. Delete File");
            System.out.println("3. List of Files");
            System.out.println("4. Rename File");
            System.out.println("5. Current Directory");
            System.out.println("0. Exit");

            myObj = new Scanner(System.in);
            menuItem = myObj.nextLine();

            if (menuItem.isEmpty()) {
                System.out.println("Your field is empty");
            }

            if (menuItem.contains("0") || menuItem.contains("exit")) {
                break;
            }

            switch (menuItem) {
                case "1":
                    userOutput();
                    System.out.println("Enter file name: ");
                    String fileName = getFileName();
                    createEmptyFile(new File(directory + fileName));
                    System.out.println("File was created - " + directory + fileName);
                    break;
                case "2":
                    userOutput();
                    System.out.println("Enter File Name: ");
                    boolean isDeleted = deleteFile(new File(directory + getFileName()));
                    System.out.println((true == isDeleted) ? "Your file was deleted" : "Your file was not deleted");
                    break;
                case "3":
                    userOutput();
                    listOfFiles();
                    break;
                case "4":
                    userOutput();
                    RenameFile();
                    break;
                case "5":
                    userOutput();
                    currentLocation();
                default:
                    System.out.println("Item not found");
            }
        }

    }

    private static String getFileName() {
        fileScan = new Scanner(System.in);
        return fileScan.nextLine();
    }

    private static void userOutput() {

        System.out.println("Menu item is: " + menuItem);
    }

    public static void createEmptyFile(File file) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteFile(File file) {
        return file.delete();
    }

    public static void listOfFiles() {
        File file = new File(directory);
        String[] fileNames = file.list();
        System.out.println("List of files:");
        for (String all : fileNames) {
            System.out.println(all);
        }
    }

    public static void RenameFile() {
        System.out.println("Enter file name to rename: ");
        File file2 = new File(directory + getFileName());
        System.out.println("Enter new file name: ");
        String fileName4 = fileScan.nextLine();
        boolean success = file2.renameTo(new File(directory + fileName4));
        System.out.println((true == success) ? "Your file was renamed" : "Your file was not renamed");
    }

    public static void currentLocation() {
        System.out.println("Enter a file name to find out the path: ");
        File file3 = new File(directory + getFileName());
        Path yourpath = file3.toPath();
        System.out.println("Your current directiory is - " + yourpath);
    }
}

