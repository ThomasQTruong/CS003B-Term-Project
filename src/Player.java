import java.util.HashSet;
import java.util.Set;

/**
 * Player.java
 * Stores the data of a player.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */

public class Player {
  // Contains every player's marks; no duplicates.
  private static Set<Character> marks = new HashSet<Character>();
  // The player's mark on the board.
  private char mark;


  /**
   * Constructor, creates a player.
   * Will throw IllegalArgumentExceptions if mark is invalid or taken.
   *
   * @param m - the mark the player will be.
   */
  public Player(char m) {
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
        throw new IllegalArgumentException("Invalid mark passed to Player(char m).");
      default:
        // Do nothing.
    }
    // Already exists!
    if (marks.contains(m)) {
      throw new IllegalArgumentException("The mark " + m + " already exists!");
    }
    
    // Passed every check; valid mark.
    marks.add(m);
    mark = m;
  }


  /**
   * Checks whether a mark is already in used by another player.
   *
   * @param m - the mark to check for.
   * @return boolean - true if exists, false if does not exist.
   */
  public boolean markExist(char m) {
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
   * Clears all of the existing marks from marks.
   */
  public static void resetMarks() {
    marks.clear();
  }
}