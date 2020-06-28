package HW_4;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static void main(String[] args) {

        File file = new File("D:\\Courses\\Java\\CourseHillel\\src\\HW_4\\FileManager.java");

        System.out.println(fileExist("D:\\Courses\\Java\\CourseHillel\\src\\HW_4\\FileManager.java"));
        createEmptyFile(file);
    }

        public static void listOfFilesAndDirectories () {

        }

        public static void createEmptyFile (File file) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void currentLocation () {

        }

        public static boolean fileExist(String filePath){
            File file = new File(filePath);
            return file.exists();
        }
}
//1:53:30
