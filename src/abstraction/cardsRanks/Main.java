package abstraction.cardsRanks;

public class Main {
    public static void main(String[] args) {
        CardRanks[] cardRanks = CardRanks.values(); //array with the elements from Enum
        System.out.println("Card Ranks:");
        for (CardRanks cardRank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}
