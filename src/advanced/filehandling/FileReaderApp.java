package advanced.filehandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {
    public static void main(String[] args) {
        String MAIL_FILE_PATH = "src\\advanced\\filehandling\\mail.txt";
        char[] firstHundredCharacter = new char[100];
        try(FileReader mailReader = new FileReader(MAIL_FILE_PATH)) {
            mailReader.read(firstHundredCharacter);
            System.out.println(firstHundredCharacter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
