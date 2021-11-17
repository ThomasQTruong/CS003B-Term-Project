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
    - boolean isSlotTaken()
      - Checks whether a specific slot on the board is taken or not.
      - @param row - The row the slot is on.
      - @param col - The column the slot is on.
      - @return boolean - true if taken, false if empty.
<br></br>
- ConsoleInput.java
  - Provides handy methods for accepting input in the console.
  - Methods:
    - int getInt()
      - Asks the user to input an integer.
      - Returns min + 1 if invalid min/max.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @return int - the integer received from the user.
    - int getInt(String prompt)
      - Asks the user to input an integer with a custom prompt.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @param prompt - the String used for asking the user for input.
      - @return int - the integer received from the user.
    - int getIntRange(int min, int max)
      - Asks the user to input an integer within a range.
      - Returns an integer out of the range if invalid min/max.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @param min - the minimum value the int can be.
      - @param max - the maximum value the int can be.
      - @return int - the int within the range.
    - int getIntRange(String prompt, int min, int max)
      - Asks the user to input an integer within a range with a custom prompt.
      - Returns an integer out of the range if invalid min/max.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @param prompt - the String used for asking the user for input.
      - @param min - the minimum value the int can be.
      - @param max - the maximum value the int can be.
      - @return int - the int within the range.

