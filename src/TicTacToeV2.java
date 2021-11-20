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
    Board board;
    TicTacToeV2Util util;
    // The list of players.
    ArrayList<Player> playerList = new ArrayList<Player>();

    // Gets the amount of players. 
    int amountOfPlayers = getPlayers();

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

    // Set up the board and util.
    board = new Board(Player.size() + 1);
    util = new TicTacToeV2Util(getWinCondition());

    int row;
    int col;
    do {
      // Print the board.
      board.printBoard();
      System.out.printf("Player %d, enter a move.\n", util.getPlayerTurn());
      boolean validMove;
      do {
        row = ConsoleInput.getIntRange("Enter the row: ", 0, Player.size());
        col = ConsoleInput.getIntRange("Enter the column: ", 0, Player.size());
        validMove = board.markBoardAt(row, col, playerList.get(util.getPlayerTurn()).getMark());
        if (validMove == false) {
          System.out.println("Invalid coordinate. Try again.");
        }
      } while (validMove == false);
      System.out.println(playerList.get(util.getPlayerTurn()).getMark());
    } while (util.isGameOver(board, row, col, playerList.get(util.getPlayerTurn()).getMark()) == 0);
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
}