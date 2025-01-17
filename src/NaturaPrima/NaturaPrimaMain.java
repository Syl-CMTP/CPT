package NaturaPrima;

import java.util.Scanner;
import java.util.ArrayList;

// TODO: Add Javadoc comments for all classes, methods, and fields

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

// AI Usage #3
// date: 15/01/2025; Asked AI to implement MyLinkedList in a way that it worked with my code. AI told me to create a Node class and a MyLinkedList class that
// had a head variable and a Node class that had a data and next variable. Will try to understand later and implement my human-made code.

public class NaturaPrimaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Main Task List
        //TODO: Change the placeholder list of treatments into an actual list of treatments
        //TODO: Tweak the scores for each treatment
        //TODO: Make the end screen(shows user's ending)
        //TODO: Make the various endings
        //TODO: Improve the start screen by adding more details about the game's objective and instructions on how to play
        
        // Extra Task List
        //TODO: Make the user be able to choose to restart the game
        //TODO: Make it so the user cannot use an inappropriate username
        //TODO: Make the emoji ending screen (Look at Mr.Habib's email)
        //TODO: Customize the text color using this website --> https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
        //TODO: See if we have time to implement difficulty.
    
        // List of all treatments
        MyLinkedList<Treatment> treatments = new MyLinkedList<>();
        treatments.append(new Treatment("Make multiple ponds",
        750,
        "info",
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Make a lake",
        2000,
        "info",
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Plant some trees",
        1250,
        "info",
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Burn some trees",
        500, 
        "info", 
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Build some wildlife shelters",
        3000,
        "info",
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Introduces Pollinators",
        750, 
        "info", 
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Introduces Bulls",
        750, 
        "info", 
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Introduces Pigs",
        750, 
        "info", 
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Introduces Flys",
        750, 
        "info", 
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Introduces Unicorns",
        750, 
        "info", 
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));
        treatments.append(new Treatment("Introduces wildlife corridors",
        750, 
        "info", 
        1,
        1,
        1,
        1,
        1,
        1,
        1,
        1
        ));

        // List of selected treatments
        ArrayList<Treatment> selectedTreatments = new ArrayList<Treatment>();

        System.out.println(treatments.toString());

        // Game Variables
        int turnCount = 0;
        int maxTurns = 10;
        double budget = 25000;
        
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
            // Also can't figure out a way to make it so that even if the user uses underscores, it still counts as inappropriate
            String[] inappropriateWords = {"fuck", "sex", "ass", "bitch", "butt", "booty", "penis", "testicles", "shit", "pee", "piss", "semen", "sperm", "arse", "bastard", "cock", "cuck", "sucker", "poop", "weed"};
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

            System.out.println("\n");
        }

        System.out.println(username + ", You went back to your family home and saw your childhood playplace was devastated. You have 25000 to rewild it\n");
        
        // Room/Choice System
        boolean isChoiceChosen = false;
        while (turnCount < maxTurns) {
            // Picks a random treatment for option 1 and 2
            int optionOneRandIndex = (int)(Math.random() * treatments.size());
            int optionTwoRandIndex = (int)(Math.random() * treatments.size());
            
            // Ensures that option 1 and 2 is not the same
            while (optionTwoRandIndex == optionOneRandIndex) {
                optionTwoRandIndex = (int)(Math.random() * treatments.size()); 
            }
            
            System.out.println("Option 1: " + treatments.get(optionOneRandIndex).getTreatmentName());
            System.out.println("Option 2: " + treatments.get(optionTwoRandIndex).getTreatmentName() + "\n");

            System.out.println("The info for option 1 is " + treatments.get(optionOneRandIndex).getInfo() + "\n");
            System.out.println("The info for option 2 is " + treatments.get(optionTwoRandIndex).getInfo() + "\n");
        
            System.out.print("Choose an option '1' or '2':");
            int choice = input.nextInt();
            input.nextLine();

            System.out.println("\n");
            
            // Reset for the next turn
            isChoiceChosen = false; 
        
            while (isChoiceChosen == false) {
                if (choice == 1 && treatments.get(optionOneRandIndex).getCost() <= budget) {
                    selectedTreatments.add(treatments.get(optionOneRandIndex));
                    budget -= treatments.get(optionOneRandIndex).getCost();
                    System.out.println(treatments.get(optionOneRandIndex).getTreatmentName() + " was chosen.");
                    isChoiceChosen = true;
                } else if (choice == 2 && treatments.get(optionTwoRandIndex).getCost() <= budget) {
                    selectedTreatments.add(treatments.get(optionTwoRandIndex));
                    budget -= treatments.get(optionTwoRandIndex).getCost();
                    System.out.println(treatments.get(optionTwoRandIndex).getTreatmentName() + " was chosen.");
                    isChoiceChosen = true;
                } else if (choice == 1 && treatments.get(optionOneRandIndex).getCost() > budget) {
                    System.out.println("insufficient budget, choose the other option.");
                } else if (choice == 2 && treatments.get(optionTwoRandIndex).getCost() > budget) {
                    System.out.println("insufficient budget, choose the other option.");
                } else {
                    System.out.println("Invalid choice. Please choose 1 or 2\n");
                }

                // If there is no choice chosen, ask the user to choose again
                // or else we go into an infinite loop lol
                if (isChoiceChosen == false) {
                    System.out.print("Choose an option: 1 or 2\n");
                    choice = input.nextInt();
                    input.nextLine();
                }
            }
        
            turnCount++;

        }
        
        System.out.println(selectedTreatments.toString());
        
        input.close();

    }
}