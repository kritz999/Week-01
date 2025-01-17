import java.util.Arrays;

public class CardDeck {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of n cards to x players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The number of cards cannot be evenly distributed among the players.");
            return null;
        }

        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];

        // Distribute the cards
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards != null) {
            for (int i = 0; i < playersCards.length; i++) {
                System.out.print("Player " + (i + 1) + " has: ");
                for (String card : playersCards[i]) {
                    System.out.print(card + ", ");
                }
                System.out.println();
            }
        }
    }

    // Main method to execute the card game
    public static void main(String[] args) {
        int numOfCards = 52;
        int numOfPlayers = 4;  // You can change this to any number of players

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Distribute cards to players
        String[][] playersCards = distributeCards(deck, numOfCards, numOfPlayers);

        // Print the players' cards
        printPlayersCards(playersCards);
    }
}
