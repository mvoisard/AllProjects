// Name:       Max Voisard
// Class:      Java Programming CIT230S
// Date:       2/21/17
// Assignment: Chapter 7 Programming Challenge

import java.util.Scanner;
public class Password
{
  public static void main(String[] args)
  {
    PasswordValidation();                               // Calling PasswordValidation function
  }
   public static void PasswordValidation()              // Function for password length and characters
   {
      String password1 = "";                            // Initializing string variable for password to null
      Scanner input = new Scanner(System.in);           // Scanner object to get user input
      boolean ifTrue = false, ifRight = false;          // Declaring boolean flag variables
      System.out.print("Please enter your password: "); // Asking user for password
      password1 = input.nextLine();                     // Obtaining password
      if (password1.length() >= 6 && password1.length() <= 10)    // If-else statement checking password length
      {
      }
      else                                         
      {
        System.out.print("Your password must be between 6-10 characters long." + "\n"); // Telling what's wrong
        PasswordValidation();                                   // Restarting method since there's an invalid password
      }
          for (int i = 0; i < password1.length(); i++)          // For loop checking all characters of password
          {
            if (Character.isLetter(password1.charAt(i)))        // If statement seeing if one letter
            {
              ifTrue = true;                                    // Assigned to true if one letter
            }
               else if (Character.isDigit(password1.charAt(i))) // Else if statement seeing if one digit
               {
                 ifRight = true;                                // Assigned to true if one digit
               }
          }
            if (ifTrue & ifRight)     // If-else statement checking if both boolean values (letter and digit) are true
            {
              input.close();
              DetermineMatch(password1);  // Going to DetermineMatch method to reenter password
            }
            else
            {
             System.out.print("Your password must contain at least one letter and one digit." + "\n"); // Saying wrong
             PasswordValidation();                              // Restarting method since there's an invalid password
            }
     }
    public static void DetermineMatch(String password1)        // Function seeing if both passwords match
        {
          String password2 = "";                              // Initializing second password to null
          Scanner keyboard = new Scanner(System.in);          // Scanner object to get user input
          System.out.print("Please enter your password again: "); // Asking for password a second time
          password2 = keyboard.nextLine();                           // Obtaining user input
              if (password1.equals(password2))                  // If-else statement checking if passwords are the same
              {
                System.out.print("Your passwords match!");        // Telling user the passwords match
                keyboard.close();
                System.exit(0);                                   // Terminating the program
              }
              else
              {
                System.out.print("Your passwords do not match." + "\n");   // Telling user they don't match
                PasswordValidation();                             // Starting over by calling PasswordValidation
              }
        }
}