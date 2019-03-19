// Name:       Max Voisard
// Date:       4/4/2017
// Class:      Java Programming CIT230S
// Assignment: Chapter 12 Programming Challenge

import java.util.Scanner;                                // Class for getting input from user
import java.util.InputMismatchException;                 // Class for getting this exception
public class RandomGuess4
{
  public static void main(String[] args)
  {
    int number = 0, randomNumber = 1, index = 0;    // Variables for user's number, real number, and loop counter
    GetRandom(number, randomNumber, index);         // Calling GetRandom method with arguments passed
  }
  public static void GetRandom(int number, int randomNumber, int count)  // Method with three parameters
  {
    Scanner keyboard = new Scanner(System.in);           // Variable for getting input
    try              // Try block to see if the number entered is valid
    {
      while(number != randomNumber)   // While loop that iterates when the 2 numbers don't match
      {
        count++;                                         // Incrementing the loop counter
        System.out.print("Enter a number from 1 to 10:");    // Asking user for number from 1 to 10
        number = keyboard.nextInt();                         // Getting the number typed
        keyboard.close();
        randomNumber = (1 + (int)(Math.random() * 10));      // Generating random number
        if(number < randomNumber)                        // For telling user the number is incorrect and lower
        {
          System.out.print("Your guess is incorrect. It is lower than the real number, " + randomNumber + ". \n");
        }
        if(number == randomNumber)                       // For telling user the number is correct and # of guesses
        {
          System.out.print("Your guess is correct! It took you " + count + " times to guess it right.");
        }
        if(number > randomNumber)                        // For telling user the number is incorrect and higher
        {
          System.out.print("Your guess is incorrect. It is higher than the real number, " + randomNumber + ". \n");
        }
      }
    }
    catch(InputMismatchException mistake)     // Catch block for making sure number is an integer data type
    {
      System.out.print("Error. Value must be a number." + "\n");  // Telling user input is invalid
      GetRandom(number, randomNumber, count);       // Calling GetRandom to start method over
    }
  }
}