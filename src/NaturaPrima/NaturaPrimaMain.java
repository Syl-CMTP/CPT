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
// had a head variable and a Node class that had a data and next variable. Will try to understand later and implement my human-made code but If I can't I will as is.
// Nevermind managed to figure it out.

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
        boolean playAgain = false;

        while (playAgain == false) {
            // Main Task List
            //TODO: Change the placeholder list of treatments into an actual list of treatments
            //TODO: Tweak the scores for each treatment
            //TODO: Make the end screen(shows user's ending)
            //TODO: Make the various endings
            
            // Extra Task List
            //TODO: Make the user be able to choose to restart the game
            //TODO: Make it so the user cannot use an inappropriate username
            //TODO: Make the emoji ending screen (Look at Mr.Habib's email)
            //TODO: Customize the text color using this website --> https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
            //TODO: See if we have time to implement difficulty.
        
            // List of all treatments
            MyLinkedList<Treatment> treatments = new MyLinkedList<>();
            treatments.append(new Treatment("Dig a couple bunds all around the place",
            500,
            "Dig 5 metre wide semi circles in the grounds for water retention.\nThis will help plants grow and those plant's roots will reduce soil erosion.",
            3,
            3,
            3,
            10,
            3,
            10,
            0
            ));
            treatments.append(new Treatment("Build a large pond at the center of the area",
            5000,
            "Dig a 25 by 25 metre pond with a depth of about 2 metres, which will help in water retention and provide a habitat for aquatic life.\nHowever, this will require heavy duty construction equipment which means it will be costly. ",
            15,
            15,
            15,
            20,
            5,
            10,
            0
            ));
            treatments.append(new Treatment("Cut down the remaining trees and plant a multitude of tree saplings around the area",
            1250,
            "Planting trees will help in soil retention, provide habitats for animals, and reduce carbon dioxide in the air.\nFurthermore, the cut down trees will act as habitats for insects and fungi. ",
            1,
            1,
            1,
            1,
            1,
            1,
            0
            ));
            treatments.append(new Treatment("Burn the old vegetation and reintroduce native species",
            2000, 
            "A quick controlled burn of the old vegetation. Enriches the soil with nutrientsto allow" +
            "for a better start for new growth.\nAlthough, while most of the nutrients from the vegetation will be returned to the soil,nitrogen and the organisms that fix " +
            "nitrogen from the soil will be lost.\nA soil test will need to be done to determine how much nitrogen fertilizer should be added in the soil.\nNew native plants," +
            " such as wild flowers, will need their seeds spread and seedlings planted quickly to prevent significant amounts of soil erosion. " ,
            0,
            0,
            0,
            20,
            20,
            40,
            0
            ));
            treatments.append(new Treatment("Build some wildlife shelters",
            3000,
            "Building wildlife shelters will provide a safe place for animals to live and reproduce, which will help in the recovery of the ecosystem. ",
            20,
            20,
            20,
            3,
            20,
            1,
            0
            ));
            treatments.append(new Treatment("Introduces Pollinators",
            750, 
            "Introducing pollinators such as bees and butterflies will help in the pollination of plants,\nwhich is essential for plant reproduction and ecosystem health. ", 
            5,
            5,
            5,
            25,
            30,
            1,
            0
            ));
            treatments.append(new Treatment("Plant different types of fungi and worms",
            500, 
            "Planting different types of fungi and worms will help in the decomposition of organic matter,\nwhich will provide nutrients to the soil and help in the growth of plants. ", 
            5,
            5,
            5,
            15,
            1,
            15,
            0
            ));
            treatments.append(new Treatment("Dig up the soil and add composted manure",
            1500, 
            "Digging up the soil will help in aeration and the addition of composted manure will provide nutrients to the soil, which will help in the growth of plants.\nFurthermore, the microorganisms in the composted manure will help in the decomposition of organic matter. ", 
            5,
            5,
            5,
            15,
            0,
            15,
            0
            ));
            treatments.append(new Treatment("Build a small eco-tourism center",
            5000, 
            "Building an eco-tourism center will provide an opportunity for people to visit the area and learn about the ecosystem,\nwhich will help in raising awareness and funds for its conservation. ", 
            0,
            0,
            0,
            0,
            0,
            0,
            35
            ));
            treatments.append(new Treatment("Build nature paths and signs to educate visitors",
            1500, 
            "Building nature paths and signs will help in guiding visitors through the area and educating them about the ecosystem,\nwhich will help in raising awareness and funds for its conservation. ", 
            0,
            0,
            0,
            0,
            0,
            0,
            25
            ));
            treatments.append(new Treatment("Construct wildlife corridors to connect habitats(Some will go over roads)",
            5000, 
            "Constructing wildlife corridors will provide safe passage for animals, helping them to move between different habitats and promoting genetic diversity.\nHowever, this will require heavy duty construction equipment which means it will be costly. ", 
            20,
            20,
            20,
            10,
            15,
            5,
            10
            ));

            // List of selected treatments
            ArrayList<Treatment> selectedTreatments = new ArrayList<Treatment>();

            // Game Variables
            int turnCount = 0;
            int maxTurns = 5;
            double budget = 10000;
            
            // Divider
            System.out.println("================================================================================================================================\n");

            // Username Input
            String username = "";
            boolean validUsername = false;
            while (validUsername == false) {
                System.out.print("Input a " + ANSI_PURPLE + "username" + ANSI_RESET + ": ");
                username = input.nextLine();
                // List of inappropriate words
                String[] inappropriateWords = {"fuck", "sex", "ass", "bitch", "butt", "booty", "penis", "testicles", "shit", "pee", "piss", "semen", "sperm", "arse", "bastard", "cock", "cuck", "sucker", "poop", "weed"};
                // Checks if the username contains inappropriate words
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
                
                System.out.println("You have chosen, " + ANSI_PURPLE + username + ANSI_RESET + ", are you sure you want this?");
                System.out.print("Type 'yes' to confirm or 'no' to re-enter: ");
                String confirmation = input.nextLine();
                
                if (confirmation.equalsIgnoreCase("yes")) {
                    validUsername = true;
                }
                
                System.out.println("\n");
            }
            
            // Game Starts
            // Another Divider
            System.out.println("================================================================================================================================\n");
            System.out.println("Welcome to " + ANSI_GREEN + "Natura Prima!" + ANSI_RESET + "\nA text adventure game in which you try to save a " + ANSI_RED + "dying" + ANSI_RESET + " ecosystem.");
            System.out.println("You have " + ANSI_GREEN + "10000.00$" + ANSI_RESET + " to spend on treatments to save it.\n");
            System.out.println(ANSI_PURPLE + username + ANSI_RESET + ", You were sent here by the " + ANSI_GREEN + "Mossy Earth Foundation" + ANSI_RESET + " to rewild this " + ANSI_RED + "dying" + ANSI_RESET + " ecosystem.\nThe soil is dry, the few trees and plants are withering, and you can't spot any wildlife.\nIt looks pretty shabby right now, but with your help, we can bring it back to life.\nYou only have 5 turns to rewild this wreck. " + ANSI_YELLOW + "Good luck!" + ANSI_RESET + "\n");
            
            // Room/Choice System
            boolean isChoiceChosen = false;
            while (turnCount < maxTurns) {
                System.out.println("Turn " + (turnCount + 1) + " of " + maxTurns + "\n");
                System.out.println("Your " + ANSI_GREEN + "budget" + ANSI_RESET + " is now " + + budget + "0$.\n");
                // Picks a random treatment for option 1 and 2
                int optionOneRandIndex = (int)(Math.random() * treatments.size());
                int optionTwoRandIndex = (int)(Math.random() * treatments.size());
                
                // Ensures that option 1 and 2 is not the same
                while (optionTwoRandIndex == optionOneRandIndex) {
                    optionTwoRandIndex = (int)(Math.random() * treatments.size()); 
                }
                
                System.out.println(ANSI_YELLOW + "Option 1" + ANSI_RESET + ": " + treatments.get(optionOneRandIndex).getTreatmentName());
                System.out.println(ANSI_YELLOW + "Option 2" + ANSI_RESET + ": " + treatments.get(optionTwoRandIndex).getTreatmentName() + "\n");

                System.out.println("The info for option 1: " + treatments.get(optionOneRandIndex).getInfo() + "It costs " + treatments.get(optionOneRandIndex).getCost() + "0$.\n");
                System.out.println("The info for option 2: " + treatments.get(optionTwoRandIndex).getInfo() + "It costs " + treatments.get(optionTwoRandIndex).getCost() + "0$.\n");
            
                System.out.print("Choose an option '1', '2', or no option '0': ");
                int choice = input.nextInt();
                input.nextLine();
                
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
                    } else if (choice == 0) {
                        System.out.println("No option chosen\n");
                        isChoiceChosen = true;
                    } else {
                        System.out.println("Invalid choice. Please choose '1', '2', or no option '0'\n");
                    }

                    // If there is no choice chosen, ask the user to choose again
                    // or else we go into an infinite loop lol
                    if (isChoiceChosen == false) {
                        System.out.print("Choose an option '1', '2', or no option '0': ");
                        choice = input.nextInt();
                        input.nextLine();
                    }
                }
            
                turnCount++;

            }

            // Game Ends

            // Calculate the final scores
            Ecosystem ecosystem = new Ecosystem();
            ecosystem.setSelectedTreatments(selectedTreatments);
            String status = ecosystem.getStatus(ecosystem.getFinalHerbivoreScore(), ecosystem.getFinalCarnivoreScore(), ecosystem.getFinalOmnivoreScore(), ecosystem.getFinalPlantScore(), ecosystem.getFinalPollinatorScore(), ecosystem.getFinalSoilHealthScore(), ecosystem.getFinalEcoTourismScore());

            // Another Divider
            System.out.println("================================================================================================================================\n");
            System.out.println("You have reached the end of the game! You got the " + status + " ending.\n");
            
            System.out.println("Here's the list of treatments you chose:\n" + selectedTreatments.toString() + "\n");
            
            System.out.print("Would you like to play again? Type 'yes' or 'no': ");
            String response = input.nextLine();
            if (response.equals("no")) {
                playAgain = true;
            }
        }

        input.close();

    }
}