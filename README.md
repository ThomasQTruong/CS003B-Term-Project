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
    - boolean markBoardAt(int row, int col)
      - Marks the board at a certain coordinate.
      - @param row - the x coordinate.
      - @param col - the y coordinate.
      - @return boolean - true if successfully marked, false if unsuccessful.
    - int size()
      - Retrieves the size of the board.
      - @return int - the board size.

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
    - static void closeScanner()
      - Closes the input scanner.

<br/>

- Player.java
  - Stores the data of a player.
  - Methods:
    - Player(char m)
      - Constructor, creates a player.
      - Will throw IllegalArgumentExceptions if mark is invalid or taken.
      - @param m - the mark the player will be.
    - boolean markExist(char m)
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
    - static int size()
      - Gets the total number of marks.
      - @return int - the number of marks in the set.
