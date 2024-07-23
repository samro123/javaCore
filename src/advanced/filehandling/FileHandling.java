package advanced.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String FILE_HANDLING_DIRECTORY = "src\\advanced\\filehandling\\";
        File famousQuotesFile = new File(FILE_HANDLING_DIRECTORY + "famousQuotes.txt");
        try {
            if(famousQuotesFile.createNewFile()){
                System.out.println("The file is created.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File famousPersonQuotesFile = new File(FILE_HANDLING_DIRECTORY+"famousPersonQuotes.txt");
        if(famousQuotesFile.renameTo(famousPersonQuotesFile)){
            System.out.println("The file is rename");
        }
        if(famousPersonQuotesFile.delete()){
            System.out.println("The file is delete");
        }
    }
}
