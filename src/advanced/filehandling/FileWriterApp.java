package advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {
        String CESAR_FILE_PATH = "src/advanced/filehandling/book.txt";
        try (FileWriter bookWriter = new FileWriter(CESAR_FILE_PATH)){
            bookWriter.write("Even you, Brutus?");
            bookWriter.append("\nYes");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
