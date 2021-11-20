/**
 * Board.java
 * Mimics a Tic Tac Toe board.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */
public class Board {
  private int boardSize;   // The size of the board.
  private char[][] board;  // The game board itself.


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


  /**
   * Retrieves the size of the board.
   *
   * @return int - the board size.
   */
  public int size() {
    return boardSize;
  }


  /**
   * Checks if one of the edges matches a mark.
   * The edge will be based on the edge number.
   * 1 2 3
   * 8 X 4
   * 7 6 5
   * X is the initial mark.
   * 1-8 represents the edge number.
   * This function has a recursive structure.
   * It will keep checking the next edges until the mark does not match.
   * Keeps track of the amount of times matched and returns it.
   *
   * @param row - The row that the initial mark is on.
   * @param col - The column that the initial mark is on.
   * @param mark - The mark to match with.
   * @param edgeNumber - The edge 
   * @return int - the amount of times the edge matched the mark.
   */
  public int checkEdge(int row, int col, char mark, int edgeNumber) {
    // Modify row.
    if (edgeNumber <= 3) {
      row--;
    } else if (edgeNumber >= 5 && edgeNumber <= 7) {
      row++;
    }

    // Modify column.
    if (edgeNumber == 1 || edgeNumber == 7 || edgeNumber == 8) {
      col--;
    } else if (edgeNumber >= 3 && edgeNumber <= 5) {
      col++;
    }

    // Base cases, no edge to check!
    if (row < 0 || row > boardSize) {
      return 0;
    } else if (col < 0 || col > boardSize) {
      return 0;
    }

    if (board[row][col] == mark) {
      // Mark matches; recursively check if it continues on and add 1 to the return.
      return checkEdge(row, col, mark, edgeNumber) + 1;
    } else {
      // Did not match.
      return 0;
    }
  }
}
