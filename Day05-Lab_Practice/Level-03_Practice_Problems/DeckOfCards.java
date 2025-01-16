// Create a class DeckOfCards to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players
import java.util.Scanner;

class DeckOfCards 
{
    // Method to initialize the deck of cards
    public static String[] initializeDeck() 
	{
        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length]; 

        // Populate the deck with cards
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
		
		// Return the initialized deck
        return deck; 
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) 
	{
		// Total number of cards in the deck
        int n = deck.length; 

        // Shuffle the deck by swapping cards randomly
        for (int i = 0; i < n; i++) {
			// Generate random index
            int randomCardNumber = i + (int) (Math.random() * (n - i)); 
            String temp = deck[i]; 
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) 
	{
        // Check if cards can be distributed evenly
        if (numPlayers * cardsPerPlayer > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute.");
        }

        // Create a 2D array to store players and their cards
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        // Assign cards to players
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++]; 
            }
        }
		
		// Return the distributed cards
        return players; 
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) 
	{
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + " | "); 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) 
	{
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Initialize and shuffle the deck of cards
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Prompt the user to enter the number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = sc.nextInt();

        // Prompt the user to enter the number of cards per player
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        try {
            // Distribute cards to players
            String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

            // Print the players and their cards
            printPlayersCards(players);
        } catch (IllegalArgumentException e) {
			// Handle the case where cards cannot be evenly distributed
            System.out.println(e.getMessage()); 
        }

        // Close the Scanner object
        sc.close();
    }
}
