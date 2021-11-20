/**
 * TicTacToeV2Util.java
 * Utility methods and variables for Tic Tac Toe V2.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */

public class TicTacToeV2Util {
  // Setting; the amount of marks in a row needed to win.
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
   * @param board - the tic tac toe board.
   * @param row - the last move's row index.
   * @param col - the last move's column index.
   * @param mark - last move's player's mark.
   * @return int - the number that indicates the status of the game.
   */
  public int isGameOver(Board board, int row, int col, char mark) {
    // The amount of marks in a row.
    int count = 1;
    
    for (int i = 1; i <= 4; i++) {
      // The center mark counts as one.
      count = 1;

      // Check if any edge matches; if it does, count the amount of times it extends to.
      count += board.checkEdge(row, col, mark, i);
      // i + 4 = opposite side of the grid; check the opposite side for matches.
      count += board.checkEdge(row, col, mark, i + 4);
      
      // Player won.
      if (count == amountToWin) {
        return 1;
      }
    }

    // No one won, check if theres still empty slots on the board.
    for (int r = 0; r < board.size(); r++) {
      for (int c = 0; c < board.size(); c++) {
        // Still an empty slot on the board.
        if (board.isSlotEmpty(r, c)) {
          return 0;
        }
      }
    }

    // No one won and no empty slot, has to be a tie!
    return 2;
  }
}