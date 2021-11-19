/**
 * TicTacToeV2Util.java
 * Utility methods and variables for Tic Tac Toe V2.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */

public class TicTacToeV2Util {
  private int amountToWin;

  /**
   * Constructor; configures amountToWin.
   *
   * @param winAmount - the amount of marks needed in a row to win.
   */
  public TicTacToeV2Util(int winAmount) {
    // Win amount needs to be >= 3 and <= player + 1.
    if (winAmount < 3) {
      throw new IllegalArgumentException(
          "TicTacToeV2Util(int winAmount): winAmount cannot be less than 3.");
    }
    if (winAmount > Player.size() + 1) {
      throw new IllegalArgumentException(
          "TicTacToeV2Util(int winAmount): winAmount cannot be greater than [Player.size() + 1].");
    }

    // Valid winAmount given.
    amountToWin = winAmount;
  }


  /**
   * Sets the value of amountToWin to a different number.
   *
   * @param winAmount - the amount of marks needed in a row to win.
   */
  public void setAmountToWin(int winAmount) {
    // Win amount needs to be >= 3 and <= player + 1.
    if (winAmount < 3) {
      throw new IllegalArgumentException(
          "TicTacToeV2Util(int winAmount): winAmount cannot be less than 3.");
    }
    if (winAmount > Player.size() + 1) {
      throw new IllegalArgumentException(
          "TicTacToeV2Util(int winAmount): winAmount cannot be greater than [Player.size() + 1].");
    }

    // Valid winAmount given.
    amountToWin = winAmount;
  }


  /**
   * Checks whether the game ended or not.
   * 0 indicates it is not over; no win/tie.
   * 1 indicates that it is over; win.
   * 2 indicates that it is over; tie.
   *
   * @return int - the number that indicates the status of the game.
   */
  public static int isGameOver(Board board) {
    return 0;
  }
}