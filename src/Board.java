/**
 * Board.java
 * Mimics a Tic Tac Toe board.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */
public class Board {
  private int boardSize = 0;        // The size of the board.
  private char[][] board;           // The game board itself.
  private boolean[][] boardSlots;   // Uses memoisation to keep track of taken slots on the board.

  /**
   * Constructor; creates a board of a given size.
   *
   * @param size - the size of the board.
   */
  public Board(int size) {
    boardSize = size;
    board = new char[size][size];
    boardSlots = new boolean[size][size];
  }

  /**
   * Initializes the board.
   */
  public void initialize() {
    // For every element in the array,
    for (int row = 0; row < boardSize; row++) {
      for (int col = 0; col < boardSize; col++) {
        // Set the value to a period ('.').
        board[row][col] = '.';
      }
    }
  }

  /**
   * Prints the board.
   */
  public void printBoard() {
    // Label top axis.
    System.out.print("   ");
    for (int i = 0; i < boardSize; i++) {
      System.out.printf("%d ", i);
    }
    System.out.println();

    // Print elements in the board in a grid format.
    for (int i = 0; i < boardSize; i++) {
      // Label the left axis.
      System.out.printf("%2d ", i);

      // Print row.
      for (int j = 0; j < boardSize; j++) {
        System.out.printf("%s ", board[i][j]);
      }
      // Skip line after printing row.
      System.out.println();
    }
  }
}
