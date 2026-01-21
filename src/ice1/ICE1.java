/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice1;

/**
 *
 * @author Sandeep
 */
public class ICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello! This is my first inclass exercise-1");
        System.out.println("Branch and clone are created");
        System.out.println("changes are made on github");
        
        String[] cards = new String[7];
        cards[0] = "Ace";
        cards[1] = "King";
        cards[2] = "Queen";
        cards[3] = "Jack";
        cards[4] = "Ten";
        cards[5] = "Nine";
        cards[6] = "Eight";

        String luckyCard = "Queen";

        boolean found = false;

        for (int i = 0; i < 7; i++) {
            if (cards[i].equals(luckyCard)) {
                found = true;
            }
        }

        if (found) {
            System.out.println("WIN");
        } else {
            System.out.println("LOSE");
        }
        
    }
}

