package advanced.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String startWarsQuote = "May, the, force, be, with, you!";
        StringTokenizer stringTokenizer = new StringTokenizer(startWarsQuote,",");
        System.out.println("Number of token: "+ stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
