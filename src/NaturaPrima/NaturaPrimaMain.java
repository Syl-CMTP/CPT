package NaturaPrima;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * author: Carl Palad
 * date: 09/01/2025
 * Educational text adventure game about reviving a dead ecosystem
 */

// AI Usage #1
// date: 10/01/2025; Asked AI which of the current tasks I should focus on. Told me to focus on the main gameplay loop(choice system, turn system, etc.) before 
// working on the side features(difficulty, emoji pictures, text colour, etc.)

// AI Usage #2
// date: 14/01/2025; Asked AI how to implement the room system for choosing choices. AI told me to use a while loop to keep the game running until the player
// reaches the max turns.

public class NaturaPrimaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Main Task List
        //TODO: Make a point system for the treatments to show treatment compatibility
        //TODO: Research and input pros and cons for each treatment
        //TODO: Make the end screen(shows user's ending)
        //TODO: Improve the start screen(Explains the premise of the game)
        //TODO: Make the user be able to choose to restart the game
        
        // Extra Task List
        //TODO: Make it so the user cannot use an inappropriate username
        //TODO: Make the emoji ending screen (Look at Mr.Habib's email)
        //TODO: Customize the text color using this website --> https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
        //TODO: See if we have time to implement difficulty.
    
        // List of all treatments
        ArrayList<Treatment> treatments = new ArrayList<Treatment>();
        treatments.add(new Treatment("multipond", 750, "good", "bad"));
        treatments.add(new Treatment("lake", 2000, "good", "bad"));
        treatments.add(new Treatment("tree planting", 1250, "good", "bad"));
        treatments.add(new Treatment("tree burning", 500, "good", "bad"));
        treatments.add(new Treatment("habitat building", 3000, "good", "bad"));
        treatments.add(new Treatment("Introduces Pollinators", 750, "good", "bad"));

        // List of selected treatments
        ArrayList<Treatment> selectedTreatments = new ArrayList<Treatment>();

        // Game Variables
        int turnCount = 0;
        int maxTurns = 10;

        // Room/Choice System
        while (turnCount < maxTurns) {
            // Picks a random treatment for option 1 and 2
            int optionOneRandIndex = (int)(Math.random() * treatments.size());
            int optionTwoRandIndex = (int)(Math.random() * treatments.size());
            
            // Ensures that option 1 and 2 is not the same
            while (optionTwoRandIndex == optionOneRandIndex) {
                optionTwoRandIndex = (int)(Math.random() * treatments.size()); 
            }
            
            System.out.println("Option 1: " + treatments.get(optionOneRandIndex).getTreatmentName());
            System.out.println("Option 2: " + treatments.get(optionTwoRandIndex).getTreatmentName());

            System.out.print("Choose an option: 1 or 2");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                selectedTreatments.add(treatments.get(optionOneRandIndex));
            } else if (choice == 2) {
                selectedTreatments.add(treatments.get(optionTwoRandIndex));
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2");
            }

            turnCount++;
        }
    
        //if choice gets picked, add to treatment to players selectedTreatments

        // Game Starts
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nWelcome to Natura Prima!\nA text adventure game in which you try to save a dying ecosystem.");
        System.out.println("You have 25,000$ to spend on treatments to save it. Good luck!\n");
        
        // Username Input
        String username = "";
        boolean validUsername = false;
        while (validUsername == false) {
            System.out.print("Input a username: ");
            username = input.nextLine();
            // Should I remove this? On the fence about this, feels like the opposite of what I wanted
            String[] inappropriateWords = {"fuck", "ass", "bitch", "butt", "booty", "nigg", "penis", "pussy", "testicles", "boob", "shit", "pee", "piss", "tits", "semen", "sperm", "arse", "bastard", "cunt", "cock", "cuck", "sucker", "poop", "fag", "weed"};
            boolean inappropriate = false;
            for (String word : inappropriateWords) {
                if (username.toLowerCase().contains(word.toLowerCase())) {
                    System.out.println("INAPPROPRIATE!!! Choose a different username.");
                    inappropriate = true;
                    break;
                }
            }
            if (inappropriate == true) {
                continue;
            }
            
            System.out.println("You have chosen, " + username + ", are you sure you want this?");
            System.out.print("Type 'yes' to confirm or 'no' to re-enter: ");
            String confirmation = input.nextLine();
            
            if (confirmation.equalsIgnoreCase("yes")) {
                validUsername = true;
            }
        }

        input.close();

        System.out.println(username + ", You went back to your family home and saw your childhood playplace was devastated. You have 25000 to fix it");

    }
}