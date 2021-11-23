# CS 003B Term Project: TicTacToe 2.0

## By <ins>Thomas Truong</ins>

## Features:
- Board.java
  - Mimics a Tic Tac Toe board.
  - Methods:
    - Board(int size)
      - Constructor, creates a board of a given size.
      - @param size - the size of the board.
    - void resetBoard()
      - Resets the board; also used for initializing.
    - void printBoard()
      - Prints the board in a grid format.
    - boolean isSlotEmpty()
      - Checks whether a specific slot on the board is empty or not.
      - @param row - The row the slot is on.
      - @param col - The column the slot is on.
      - @return boolean - true if empty, false if taken.
    - boolean markBoardAt(int row, int col, char mark)
      - Marks the board at a certain coordinate.
      - @param row - the x coordinate.
      - @param col - the y coordinate.
      - @param mark - the player's mark.
      - @return boolean - true if successfully marked, false if unsuccessful.
    - int size()
      - Retrieves the size of the board.
      - @return int - the board size.
    - int checkEdge(int row, int col, char mark, int edgeNumber)
      - Checks if one of the edges matches a mark.
      - The edge will be based on the edge number.
      - 1 2 3
      - 8 X 4
      - 7 6 5
      - X is the initial mark.
      - 1-8 represents the edge number.
      - This function has a recursive structure.
      - It will keep checking the next edges until the mark does not match.
      - Keeps track of the amount of times matched and returns it.
      - @param row - The row that the initial mark is on.
      - @param col - The column that the initial mark is on.
      - @param mark - The mark to match with.
      - @param edgeNumber - The edge 
      - @return int - the amount of times the edge matched the mark.

<br/>

- ConsoleInput.java
  - Provides handy methods for accepting inputs in the console.
  - Methods:
    - static int getInt()
      - Asks the user to input an integer.
      - Returns min + 1 if invalid min/max.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @return int - the integer received from the user.
    - static int getInt(String prompt)
      - Asks the user to input an integer with a custom prompt.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @param prompt - the String used for asking the user for input.
      - @return int - the integer received from the user.
    - static int getIntRange(int min, int max)
      - Asks the user to input an integer within a range.
      - Returns an integer out of the range if invalid min/max.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @param min - the minimum value the int can be.
      - @param max - the maximum value the int can be.
      - @return int - the int within the range.
    - static int getIntRange(String prompt, int min, int max)
      - Asks the user to input an integer within a range with a custom prompt.
      - Returns an integer out of the range if invalid min/max.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @param prompt - the String used for asking the user for input.
      - @param min - the minimum value the int can be.
      - @param max - the maximum value the int can be.
      - @return int - the int within the range.
    - static char getChar()
      - Asks the user to input a character.
      - @return char - the character that the user inputted.
    - static char getChar(String prompt)
      - Asks the user to input a character using a prompt.
      - @param prompt - the prompt to use to ask the user for input.
      - @return char - the character that the user inputted.
    - static void closeScanner()
      - Closes the input scanner.

<br/>

- Player.java
  - Stores the data of a player.
  - Methods:
    - Player(char m)
      - Constructor, creates a player.
      - Will throw IllegalArgumentExceptions if mark is invalid or taken.
      - "Player(char m): invalid mark." will be thrown if invalid.
      - "Player(char m): the mark already exists." will be thrown if taken.
      - @param m - the mark the player will be.
    - static boolean validMark(char m)
      - * Checks whether the mark is valid or not.
      - @param m - the mark.
      - @return boolean - true if valid, false if invalid.
    - static boolean markExists(char m)
      - Checks whether a mark is already in used by another player.
      - @param m - the mark to check for.
      - @return boolean - true if exists, false if does not exist.
    - char getMark()
      - Gets the player's mark.
      - @return char - the player's mark.
    - boolean remove(char m)
      - Removes the mark from the set.
      - @param m - the mark to remove from the set.
      - @return boolean - true if removed successfully, false if unsuccessful.
    - static void removeAll()
      - Clears all of the marks in the set.
    - static int size()
      - Gets the total number of marks.
      - @return int - the number of marks in the set.

<br/>

- TicTacToeV2Util.java
  - Utility methods and variables for Tic Tac Toe V2.
  - Methods:
    - TicTacToeV2Util(int winAmount)
      - Constructor; configures amountToWin.
      - @param winAmount - the amount of marks needed in a row to win.
    - void setAmountToWin(int winAmount)
      - Sets the value of amountToWin to a different number.
      - @param winAmount - the amount of marks needed in a row to win.
    - void nextTurn()
      - Tells the game that it is the next turn.
    - int getTurn()
      - Retrieves the current turn number.
      - @return int - the current turn.
    - int getPlayerTurn()
      - Retrieves which player's turn.
      - @return int - the player number of whoever's turn it is.
    - int isGameOver(Board board, int row, int col, char mark)
      - Checks whether the game ended or not.
      - 0 indicates it is not over; no win/tie.
      - 1 indicates that it is over; win.
      - 2 indicates that it is over; tie.
      - @param board - the tic tac toe board.
      - @param row - the last move's row index.
      - @param col - the last move's column index.
      - @param mark - last move's player's mark.
      - @return int - the number that indicates the status of the game.

<br/>

- TicTacToeV2.java
  - A playable console game for 3 to 10 players.
  - Methods:
    - static void main(String[] args)
      - The main function; the program begins here.
      - @param args - Command-line arguments.
    - static void game()
      - The full game itself.
    - static int getPlayers()
      - Asks the user to input the amount of players playing.
      - @return int - the amount of players playing.
    - static int getWinCondition()
      - Asks the user for the amount of marks in a row needed to win.
      - @return int - the amount needed to win.
    - static char playAgain()
      - Asks the user if they would like to play again.
      - @return char - the user's choice.

<br/>

## How to Play:
1. Enter the number of players that will be playing [3 to 10].
2. Choose a unique mark for every player.
3. Choose the number of marks needed in a row to win [3 to playerCount-1].
4. Every player has a turn to choose where to place their marks.
    - First, you enter the row number that you want to mark at.
    - Then, you enter the column number that you want to mark at.
5. Once the game ends (win/tie), you can choose to quit or play again.
    - The same process repeats.
