/**
 * TicTacToeV2.java
 * A playable console game!
 *
 * <p>Copyright (c) 2021, Thomas Truong.</p>
 */

public class TicTacToeV2 {
  public static void main(String[] args) {
    getPlayers();
  }

  public static int getPlayers() {
    System.out.println("How many players will be playing?");
    return ConsoleInput.getIntRange(3, 10);
  }
}