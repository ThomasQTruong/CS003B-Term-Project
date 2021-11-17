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
    b.printBoard();

    ConsoleInput c = new ConsoleInput();
    System.out.println("Input was: " + c.getIntRange("ghello", -2, -1));
  }
}
