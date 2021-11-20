import java.util.ArrayList;

/**
 * TicTacToeV2.java
 * A playable console game for 3 to 10 players.
 *
 * <p>Copyright (c) 2021, Thomas Truong.</p>
 */

public class TicTacToeV2 {
  public static void main(String[] args) {
    // The list of players.
    ArrayList<Player> playerList = new ArrayList<Player>();

    // Gets the amount of players. 
    int amountOfPlayers = getPlayers();

    // Sets the players up.
    for (int player = 1; player <= amountOfPlayers; player++) {
      char symbol = ' ';  // The player's symbol (mark).
      do {
        // Asks the user to input their chosen symbol.
        symbol = ConsoleInput.getChar("Player " + player + ", choose your symbol.");

        try {
          // Try creating a new player with the given symbol.
          playerList.add(new Player(symbol));
        } catch (IllegalArgumentException e) {
          // Symbol is not valid!
          if (e.getMessage() == "Player(char m): invalid mark.") {
            // Invalid mark error.
            System.out.printf("%s is not a valid mark. Try again.\n", symbol);
          } else {
            // Mark exists error.
            System.out.printf("%s already exists. Try again.\n", symbol);
          }
          symbol = ' ';
        }
      } while (symbol == ' ');
      
    }
  }

  public static int getPlayers() {
    System.out.println("How many players will be playing?");
    return ConsoleInput.getIntRange(3, 10);
  }
}