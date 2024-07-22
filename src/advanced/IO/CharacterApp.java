package advanced.IO;

import java.util.Scanner;

public class CharacterApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to World of Warlords");
        System.out.println("Here you can create your character: ");
        System.out.println("Name: ");
        String name = userInput.nextLine();

        System.out.println("Race (human or orc): ");
        while (!userInput.hasNext("human") && !userInput.hasNext("orc")){
            System.err.println("Invalid input, you need to type in human or orc");
            userInput.nextLine();
        }

        String race = userInput.nextLine();

        System.out.println("Difficulty (0 - easy, 1 - medium, 2 - hard): ");
        while (!userInput.hasNextByte(3)){
            System.err.println("Invalid input, you need to type in 0 or 1 or 2");
            userInput.nextLine();
        }

        byte difficulty = userInput.nextByte();

        System.out.println("Nightmare mode is on (false or true): ");
        while (!userInput.hasNextBoolean()){
            System.err.println("Invalid input, you need to type in true or false");
            userInput.nextLine();
        }

        boolean isNightMare = userInput.nextBoolean();

        System.out.println("------------------------------");
        System.out.println("You character is created: ");
        System.out.printf("Name: %s", name);
        System.out.printf("Difficulty: %s", difficulty);
        System.out.printf("Race: %s" , race);
        System.out.printf("NightMare: %b ", isNightMare);
    }
}
