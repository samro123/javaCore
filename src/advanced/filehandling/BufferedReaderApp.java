package advanced.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class BufferedReaderApp {
    public static void main(String[] args) {
        String MAIL_FILE_PATH = "src\\advanced\\filehandling\\mail.txt";

        try(FileReader mailReader = new FileReader(MAIL_FILE_PATH)) {
            BufferedReader mailBufferedReader = new BufferedReader(mailReader, 16000);
            String mail  = mailBufferedReader.lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(mail);

            //readAllLines(mailBufferedReader);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAllLines(BufferedReader mailBufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = mailBufferedReader.readLine()) != null){
            stringBuffer.append(line);
            stringBuffer.append(System.lineSeparator());
        }
        System.out.println(stringBuffer.toString());
    }
}
