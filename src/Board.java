/**
 * Board.java
 * Mimics a Tic Tac Toe board.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */
public class Board {
  private int boardSize = 0;
  private char[][] board;

  /**
   * Constructor; creates a board of a given size.
   *
   * @param size - the size of the board.
   */
  public Board(int size) {
    boardSize = size;
    board = new char[size][size];
  }

  /**
   * Initializes the board.
   */
  public void initialize() {
    for (int row = 0; row < boardSize; row++) {
      for (int col = 0; col < boardSize; col++) {
        board[row][col] = 'a';
      }
    }
  }

  /**
   * Prints the board.
   */
  public void printBoard() {
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
  }
}
