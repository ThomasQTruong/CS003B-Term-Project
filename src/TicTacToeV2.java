import java.util.ArrayList;

/**
 * TicTacToeV2.java
 * A playable console game for 3 to 10 players.
 *
 * <p>Copyright (c) 2021, Thomas Truong.</p>
 */

public class TicTacToeV2 {
  public static void main(String[] args) {
    // The list of players.
    ArrayList<Player> players = new ArrayList<Player>();

    // Gets the amount of players and sets the players up.
    for (int player = 1; player <= getPlayers(); player++) {
      System.out.printf("Player %d, choose your symbol.", player);
      players.add(null);
    }
  }

  public static int getPlayers() {
    System.out.println("How many players will be playing?");
    return ConsoleInput.getIntRange(3, 10);
  }
}