package Classworks.CW12;

import java.io.File;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\egorp\\IdeaProjects\\Lessons\\src\\Classworks\\CW12\\forExample.txt");
        file.createNewFile();

        File parentPackage = file.getParentFile();
        File[] listOfFiles = parentPackage.listFiles();

        for (File file1 : listOfFiles) {
            if (file1.isFile()) {
                System.out.println(file1.getName());
            }
        }
    }
}
