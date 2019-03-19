// Name:        Max Voisard
// Class:       Adv Program Using C# CIT223S
// Date:        3/27/17
// Assignment:  Chapter 8 Programming Exercise

using System;
using static System.Console;
using System.Windows.Forms;

namespace RandomNumbersAndSquares
{
    class Program
    {
        static void Main(string[] args)
        {     
            int[,] random = new int[10, 2];   // Two-dimensional array with 10 rows and 2 columns
            random = GenerateRandomNumbs();   // Returning randomness array and setting equal to random method
            random = SquaringNumbers(random); // Returning square array equal to squaring method with random numbers array passed
            DisplayContents(random);          // Passing adjusted array to displaying method
            ReadKey();
        }

        static int[,] GenerateRandomNumbs()                             // Two-dimensional integer array function for generating random numbers
        {
            int[,] randomness = new int[10, 2];                         // Creating array for integer array method
            Random number = new Random();                               // Creating variable for random number with class
            int index = 0, randomNumber;                                // Declaring loop counter and random number variable
            for (index = 0; index < randomness.GetLength(0); index++)   // For loop to iterate 10 times, or size of array's first dimension
            { 
               randomNumber = number.Next(100);                         // Setting variable equal to random number from 0-100
               randomness[index, 0] = randomNumber;                     // Putting values in first column
            }
            return randomness;                                          // Returning array to Main
        }

        static int[,] SquaringNumbers(int[,] square)                    // Two-dimensional integer array function for squaring random numbers which come from array parameter
        {
            for (int value = 0; value < square.GetLength(0); value++)   // For loop to go through 10 random element values
            {
               int squaring = (int)Math.Pow(square[value, 0], 2);       // Using math power function to square first dimension's values
               square[value, 1] = squaring;                             // Putting first-dimension values into second dimension
            }
            return square;                                              // Returning array to Main
        }
        static void DisplayContents(int[,] rand)                        // Void function to display values from two-dimensional array parameter
        {
            string output = "Number\t\tSquared\n";                      // Formatting two columns to indicate types of values
            for (int index = 0; index < 10; index++)                    // Outer loop to go through rows
            {
                for (int count = 0; count < 2; count++)                 // Nested inner loop to go through columns
                {
                    output += rand[index, count] + "\t\t";              // Outputting values, tabbed twice to be under columns
                }
                output += "\n";                                         // Going to the next line
            }
            MessageBox.Show(output);                                    // Displaying values in message box
        }
    }
}