import java.util.Scanner;

/**
 * ConsoleInput.java
 * Provides handy methods for accepting input in the console.
 *
 * <p>Copyright (c) 2021, Thomas Truong.
 */
public class ConsoleInput {
  private Scanner input = new Scanner(System.in);

  /**
   * Asks the user to input an integer.
   * Invalid inputs--Strings and doubles--will not cause errors.
   *
   * @return int - the integer received from the user.
   */
  public int getInt() {
    // Prompt user.
    System.out.println("Enter a number.");
    System.out.print("Input: ");
    // Ask for input and loop if not an integer; if valid, skip loop.
    while(!input.hasNextInt()) {
      System.out.print("Input: ");
      // Eat up the invalid input.
      input.nextLine();
    }
    // Return the correct input.
    return input.nextInt();
  }
}
