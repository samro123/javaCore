package advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {
    public static void main(String[] args) {
        String CESAR_FILE_PATH = "src/advanced/filehandling/book.txt";
        try (PrintWriter bookWriter  = new PrintWriter(new FileWriter(CESAR_FILE_PATH, true))){
            bookWriter.println("Even you, Brutus?");
            //bookWriter.println(25.4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
