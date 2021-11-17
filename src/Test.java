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
    b.markBoardAt(0, 0);
    b.printBoard();
  }
}
