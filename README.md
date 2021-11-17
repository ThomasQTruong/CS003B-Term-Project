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
- ConsoleInput.java
  - Provides handy methods for accepting input in the console.
  - Methods:
    - int getInt()
      - Asks the user to input an integer.
      - Invalid inputs--Strings and doubles--will not cause errors.
      - @return int - the integer received from the user.

