/**
 * Test.java
 * Used for unit testing.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */

public class Test {
  /**
   * Main function.
   *
   * @param args - command-line arguments.
   */
  public static void main(String[] args) {
    Board b = new Board(11);
    b.resetBoard();
    b.markBoardAt(0, 0);
    b.markBoardAt(1, 1);
    b.markBoardAt(2, 2);
    b.markBoardAt(3, 3);
    b.markBoardAt(4, 4);
    b.markBoardAt(5, 5);

    b.markBoardAt(3, 5);
    b.markBoardAt(3, 4);
    b.markBoardAt(3, 2);
    b.markBoardAt(3, 1);

    b.markBoardAt(5, 3);
    b.markBoardAt(4, 3);
    b.markBoardAt(2, 3);
    b.markBoardAt(1, 3);

    b.markBoardAt(2, 4);
    b.markBoardAt(1, 5);
    b.markBoardAt(4, 2);
    b.markBoardAt(5, 1);

    b.printBoard();
    TicTacToeV2Util.isGameOver(b, 3, 3, 'X');
  }
}
