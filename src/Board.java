/**
 * Board.java
 * Mimics a Tic Tac Toe board.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */
public class Board {
  private int board_size = 0;
  private char board[][];

  /**
   * Constructor; creates a board of a given size.
   *
   * @param size - the size of the board.
   */
  public Board(int size) {
    board_size = size;
    board = new char[size][size];
  }

  /**
   * Initializes the board.
   */
  public void initialize() {
    for (int row = 0; row < board_size; row++) {
      for (int col = 0; col < board_size; col++) {
        board[row][col] = 'a';
      }
    }
  }

  /**
   * Prints the board.
   */
  public void printBoard() {
    for (int i = 0; i < board_size; i++) {
      for (int j = 0; j < board_size; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
  }
}
