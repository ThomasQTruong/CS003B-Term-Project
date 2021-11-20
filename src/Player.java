import java.util.HashSet;
import java.util.Set;

/**
 * Player.java
 * Stores the data of a player.
 *
 * <p>Copyright (c) 2021, Thomas Truong.</p>
 */

public class Player {
  // Contains every player's marks; no duplicates.
  private static Set<Character> marks = new HashSet<Character>();
  // The player's mark on the board.
  private char mark;


  /**
   * Constructor, creates a player.
   * Will throw IllegalArgumentExceptions if mark is invalid or taken.
   * <p>"Player(char m): invalid mark." will be thrown if invalid.</p>
   * <p>"Player(char m): the mark already exists." will be thrown if taken.</p>
   *
   * @param m - the mark the player will be.
   */
  public Player(char m) {
    if (!validMark(m)) {
      throw new IllegalArgumentException("Player(char m): invalid mark.");
    }
    // Already exists!
    if (marks.contains(m)) {
      throw new IllegalArgumentException("Player(char m): the mark already exists.");
    }
    
    // Passed every check; valid mark.
    marks.add(m);
    mark = m;
  }


  /**
   * Checks whether the mark is valid or not.
   *
   * @param m - the mark.
   * @return boolean - true if valid, false if invalid.
   */
  public static boolean validMark(char m) {
    switch (m) {
      // Cannot be a period since its part of the board.
      case '.':
      // Space is not allowed.
      case ' ':
      // Most escape sequences are not allowed.
      case '\t':
      case '\n':
      case '\b':
      case '\r':
      case '\f':
        return false;
      default:
        // Passed every case, valid mark.
        return true;
    }
  }


  /**
   * Checks whether a mark is already in used by another player.
   *
   * @param m - the mark to check for.
   * @return boolean - true if exists, false if does not exist.
   */
  public static boolean markExists(char m) {
    return marks.contains(m);
  }


  /**
   * Gets the player's mark.
   *
   * @return char - the player's mark.
   */
  public char getMark() {
    return mark;
  }


  /**
   * Removes the mark from the set.
   *
   * @param m - the mark to remove from the set.
   * @return boolean - true if removed successfully, false if unsuccessful.
   */
  public boolean remove(char m) {
    return marks.remove(m);
  }


  /**
   * Gets the total number of marks.
   *
   * @return int - the number of marks in the set.
   */
  public static int size() {
    return marks.size();
  }
}