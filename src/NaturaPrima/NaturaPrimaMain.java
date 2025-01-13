package NaturaPrima;

import java.util.Scanner;

/**
 * author: Carl Palad
 * date: 09/01/2025
 * Educational text adventure game about reviving a dead ecosystem
 */

// AI Usage #1
// date: 10/01/2025; Asked AI which of the current tasks I should focus on. Told me to focus on the main gameplay loop(choice system, turn system, etc.) before 
// working on the side features(difficulty, emoji pictures, text colour, etc.)

public class NaturaPrimaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Main Task List
        //TODO: Make the room system for choosing choices
        //TODO: Make the choice system
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
        Treatment treatments[] = {
            new Treatment("multipond",750, "good", "bad"),
            new Treatment("lake",2000, "good", "bad"),
            new Treatment("tree planting",12s50, "good", "bad"),
            new Treatment("tree burning", 500, "good", "bad"),
            new Treatment("habitat building",3000, "good", "bad"),
            new Treatment("Introduces Pollinators",750, "good", "bad")
        };

        // Room/Turn system
        for (int i = 0; i < treatments.length; i++) {
            
            System.out.println("Option 1: " + treatments[((int)Math.random() * treatments.length)].getTreatmentName());
        }
        //if choice gets picked, add to treatment to players selectedTreatments

        // Game
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\nWelcome to Natura Prima!\nA text adventure game in which you try to save a dying ecosystem.");
        System.out.print("Input a username: ");
        String username = input.nextLine();
        // TODO: Make a while loop for this
        System.out.println("You have chosen, " + username + ", are you sure you want this?");
        System.out.println("yes or no?");
        String optionOne = input.nextLine();
        if (optionOne == "yes") {
            // Continue the game
        } else {
            // Rename
        }

        input.close();

        // Game Starts
        System.out.println(username + ", You went back to your family home and saw your childhood playplace was devastated. You have 25000 to fix it");

    }
}