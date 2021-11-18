/**
 * Board.java
 * Mimics a Tic Tac Toe board.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */
public class Board {
  private int boardSize = 0;  // The size of the board.
  private char[][] board;     // The game board itself.


  /**
   * Constructor, creates a board of a given size.
   *
   * @param size - the size of the board.
   */
  public Board(int size) {
    boardSize = size;
    board = new char[size][size];
  }


  /**
   * Resets the board; also used for initializing.
   */
  public void resetBoard() {
    // For every element in the array,
    for (int row = 0; row < boardSize; row++) {
      for (int col = 0; col < boardSize; col++) {
        // Set the value to a period ('.').
        board[row][col] = '.';
      }
    }
  }


  /**
   * Prints the board in a grid format.
   */
  public void printBoard() {
    // Label top axis.
    System.out.printf("%3s", "");
    for (int col = 0; col < boardSize; col++) {
      System.out.printf("%d ", col);
    }
    System.out.println();

    // Print elements in the board in a grid format.
    for (int row = 0; row < boardSize; row++) {
      // Label the left axis.
      System.out.printf("%2d ", row);

      // Print row.
      for (int col = 0; col < boardSize; col++) {
        System.out.printf("%s ", board[row][col]);
      }
      // Skip line after printing row.
      System.out.println();
    }
  }


  /**
   * Checks whether a specific slot on the board is empty or not.
   *
   * @param row - The row the slot is on.
   * @param col - The column the slot is on.
   * @return boolean - true if empty, false if taken.
   */
  public boolean isSlotEmpty(int row, int col) {
    return board[row][col] == '.';
  }


  /**
   * Marks the board at a certain coordinate.
   *
   * @param row - the x coordinate.
   * @param col - the y coordinate.
   * @return boolean - true if successfully marked, false if unsuccessful.
   */
  public boolean markBoardAt(int row, int col) {
    // Slot is taken, can't mark!
    if (!isSlotEmpty(row, col)) {
      return false;  // Unsuccessful call.
    }
    // Slot is not taken, continue.
    board[row][col] = 'X';             // Mark the board with player's symbol.
    
    return true;  // Successfully marked.
  }
}
