package advanced.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScannerApp {
    public static void main(String[] args) {
        String MAIL_FILE_PATH = "src\\advanced\\filehandling\\mail.txt";
        try (Scanner scanner = new Scanner(new File(MAIL_FILE_PATH))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
