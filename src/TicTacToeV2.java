import java.util.ArrayList;

/**
 * TicTacToeV2.java
 * A playable console game for 3 to 10 players.
 *
 * <p>Copyright (c) 2021, Thomas Truong.</p>
 */

public class TicTacToeV2 {
  /**
   * The main function; the program begins here.
   *
   * @param args - Command-line arguments.
   */
  public static void main(String[] args) {
    // Repeat the game until the user does not want to anymore.
    do {
      game();
    } while (playAgain() == 'y');

    // User doesn't want to play anymore.
    System.out.println("Thanks for playing!");
  }


  /**
   * The full game itself.
   */
  public static void game() {
    // The list of players.
    Player.removeAll();  // Makes sure the list is cleared.
    ArrayList<Player> playerList = new ArrayList<Player>();

    // Gets the amount of players. 
    int amountOfPlayers = getPlayers();
    System.out.println();  // Skip line to format console.

    // Sets the players up.
    for (int playerNumber = 1; playerNumber <= amountOfPlayers; playerNumber++) {
      // The player's mark.
      char mark = ' ';

      // Keep asking user to input again if invalid.
      do {
        // Asks the user to input their chosen mark.
        mark = ConsoleInput.getChar("Player " + playerNumber + ", choose your mark.");

        try {
          // Try creating a new player with the given mark.
          playerList.add(new Player(mark, playerNumber));
        } catch (IllegalArgumentException e) {
          // mark is not valid!
          if (e.getMessage() == "Player(char m): invalid mark.") {
            // Invalid mark error.
            System.out.printf("%s is not a valid mark. Try again.\n", mark);
          } else {
            // Mark exists error.
            System.out.printf("%s already exists. Try again.\n", mark);
          }
          // Make mark = ' ' to loop.
          mark = ' ';
        }
      } while (mark == ' ');
    }
    System.out.println();  // Skip line to format console.

    // Set up the board and util.
    Board board = new Board(Player.size() + 1);
    TicTacToeV2Util util = new TicTacToeV2Util(getWinCondition());
    System.out.println();  // Skip line to format console.

    int row;          // The row the player chose.
    int col;          // The column the player chose.
    char playerMark;  // The player's mark.

    // Repeat until someone wins or until a tie occurs.
    do {
      // Increase the turn.
      util.nextTurn();

      // Get player's mark.
      playerMark = playerList.get(util.getPlayerTurn() - 1).getMark();

      // Print the board.
      board.printBoard();
      
      // Ask player for their move.
      System.out.printf("Player %d (%s), enter a move.\n", util.getPlayerTurn(), playerMark);
      // Keeps track whether move is valid or not.
      boolean validMove;
      // Repeat until player put a valid move.
      do {
        row = ConsoleInput.getIntRange("Enter the row: ", 0, Player.size());
        col = ConsoleInput.getIntRange("Enter the column: ", 0, Player.size());
        validMove = board.markBoardAt(row, col, playerMark);
        
        // If move is invalid.
        if (validMove == false) {
          System.out.println("Invalid coordinate. Try again.");
        }
      } while (validMove == false);
      System.out.println();  // Skip line to format console.
    } while (util.isGameOver(board, row, col, playerMark) == 0);
    
    // Print the board.
    board.printBoard();
    
    // Check if it was a win or tie.
    if (util.isGameOver(board, row, col, playerMark) == 1) {
      // Someone won, print the winner.
      System.out.printf("Player %d (%s) wins!\n", util.getPlayerTurn(), playerMark);
    } else {
      // No one won, print that there was a tie.
      System.out.println("There was a tie!");
    }
    System.out.println();  // Skip line to format console.
  }


  /**
   * Asks the user to input the amount of players playing.
   *
   * @return int - the amount of players playing.
   */
  public static int getPlayers() {
    System.out.println("How many players will be playing?");
    return ConsoleInput.getIntRange(3, 10);
  }


  /**
   * Asks the user for the amount of marks in a row needed to win.
   *
   * @return int - the amount needed to win.
   */
  public static int getWinCondition() {
    System.out.println("How many marks in a row to win?");
    // The amount to win can only be from 3 to [Player.Size + 1].
    return ConsoleInput.getIntRange(3, Player.size() + 1);
  }


  /**
   * Asks the user if they would like to play again.
   *
   * @return char - the user's choice.
   */
  public static char playAgain() {
    char choice;

    // Keep asking user if choice isnt y or n.
    do {
      choice = ConsoleInput.getChar("Would you like to play again? [y/n]");
      // If the user's input is uppercased, convert to lowercase.
      if (choice == 'Y') {
        choice = 'y';
      } else if (choice == 'N') {
        choice = 'n';
      }
    } while (choice != 'y' && choice != 'n');
    System.out.println();  // Skip line to format console.

    return choice;
  }
}
