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
    // Color Codes
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

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
        treatments.append(new Treatment("Dig a couple bunds",
        250,
        "5 metre wide semi circles in the grounds for water retention",
        3,
        3,
        3,
        10,
        3,
        10,
        0
        ));
        treatments.append(new Treatment("Build a large pond",
        5000,
        "A 25 by 25 metre pond with a depth of about 2 metres",
        15,
        15,
        15,
        20,
        5,
        5, // Would ponds affect soilHealth all that much?
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
        1
        ));
        treatments.append(new Treatment("Burn the remaining vegetation and reintroduce native species",
        1750, 
        "A quick controlled burn of the remaining vegetation, which kills almost all species of vegetation, invasive or not. Enriches the soil with nutrients\nto allow " +
        "for a better start for new growth. Although, while most of the nutrients from the vegetation will be returned to the soil,\nnitrogen and the organisms that fix " +
        "nitrogen from the soil will be lost. A soil test will need to be done to determine how much nitrogen fertilizer should be added in the soil.\nNew native plants" +
        ", such as wild flowers, will need their seeds spread and seedlings planted quickly to prevent significant amounts of soil erosion. " ,
        0,
        0,
        0,
        20,
        20,
        30,
        0
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
        1
        ));
        treatments.append(new Treatment("Introduces Pollinators",
        750, 
        "Introducing pollinators such as bees and butterflies will help in the pollination of plants, which is essential for plant reproduction and ecosystem health.", 
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
        1
        ));
        treatments.append(new Treatment("Construct wildlife corridors",
        5000, 
        "Constructing wildlife corridors will provide safe passage for animals, helping them to move between different habitats and promoting genetic diversity.", 
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
            
            System.out.println(ANSI_YELLOW + "Option 1" + ANSI_RESET + ": " + treatments.get(optionOneRandIndex).getTreatmentName());
            System.out.println(ANSI_YELLOW + "Option 2" + ANSI_RESET + ": " + treatments.get(optionTwoRandIndex).getTreatmentName() + "\n");

            System.out.println("The info for option 1: " + treatments.get(optionOneRandIndex).getInfo() + "It costs " + treatments.get(optionOneRandIndex).getCost() + "$.\n");
            System.out.println("The info for option 2: " + treatments.get(optionTwoRandIndex).getInfo() + "It costs " + treatments.get(optionTwoRandIndex).getCost() + "$.\n");
        
            System.out.print("Choose an option '1' or '2': ");
            int choice = input.nextInt();
            input.nextLine();

            System.out.println("\n");
            
            // Reset for the next turn
            isChoiceChosen = false; 
        
            while (isChoiceChosen == false) {
                if (choice == 1 && treatments.get(optionOneRandIndex).getCost() <= budget) {
                    selectedTreatments.add(treatments.get(optionOneRandIndex));
                    budget -= treatments.get(optionOneRandIndex).getCost();
                    System.out.println(treatments.get(optionOneRandIndex).getTreatmentName() + " was chosen.\n");
                    isChoiceChosen = true;
                } else if (choice == 2 && treatments.get(optionTwoRandIndex).getCost() <= budget) {
                    selectedTreatments.add(treatments.get(optionTwoRandIndex));
                    budget -= treatments.get(optionTwoRandIndex).getCost();
                    System.out.println(treatments.get(optionTwoRandIndex).getTreatmentName() + " was chosen.\n");
                    isChoiceChosen = true;
                } else if (choice == 1 && treatments.get(optionOneRandIndex).getCost() > budget) {
                    System.out.println("insufficient budget, choose the other option.\n");
                } else if (choice == 2 && treatments.get(optionTwoRandIndex).getCost() > budget) {
                    System.out.println("insufficient budget, choose the other option.\n");
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

                System.out.println("Your " + ANSI_GREEN + "budget" + ANSI_RESET + " is now " + + budget + "$\n");
            }
        
            turnCount++;

        }
        
        System.out.println(selectedTreatments.toString());
        
        input.close();

    }
}