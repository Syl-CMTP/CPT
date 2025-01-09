package NaturaPrima;

import java.util.Scanner;

/**
 * author: Carl Palad
 * date: 09/01/2025
 * Educational text adventure game about reviving a dead ecosystem
 */

public class NaturaPrimaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Task List
        //TODO: Make it so the user cannot use an inappropriate username
        //TODO: Make the user be able to choose to restart or exit the game
        //TODO: Make the end screen(shows user's ending)
        //TODO: Make the emoji ending screen (Look at Mr.Habib's email)
        //TODO: Customize the text color using this website --> https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
        
        
        //TODO: Make the start screen(Explains the premise of the game)

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\nWelcome to Natura Prima!\nA text adventure game in which you try to save a dying ecosystem.");
        
        String username = input.nextLine();

        input.close();
        
    }
}