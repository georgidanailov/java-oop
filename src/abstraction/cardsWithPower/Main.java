package abstraction.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rankInput = scanner.nextLine();

        String suitInput = scanner.nextLine();


        scanner.close();

        try {
            Rank rank = Rank.valueOf(rankInput);
            Suit suit = Suit.valueOf(suitInput);

            Card card = new Card(rank, suit);

            // Output
            System.out.println("Card name: " + card.getCardName() + "; Card power: " + card.getCardPower());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter a valid rank and suit.");
        }
    }
}
