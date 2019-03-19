// Name:       Max Voisard
// Class:      Adv Program Using C# CIT223S
// Date:       3/20/17
// Assignment: Chapter 7 Programming Exercise

using System;
using static System.Console;

namespace Names
{
    class Program
    {
        static void Main(string[] args)
        {
            WriteLine("How many names will you enter? ");           // Asking user for specified size of array
            int number;                                             // Declaring integer variable for array's size
            string input, name;                                     // Declaring string variables for user to enter data
            input = ReadLine();                                     // Reading the input for the size of array number
            number = int.Parse(input);                              // Converting string to an integer
            string[] Name = new string[number];                     // String array with user-determined size for names
            if (number != 0)                                        // If statement testing if array size is zero
            {
                for (int index = 0; index < Name.Length; index++)       // For loop to go through asking for names
                {
                    WriteLine("Enter last name, first name #{0}", index + 1 + ":");     // Asking for name in certain order
                    name = ReadLine();                                                  // Reading the input
                    Name[index] = name;                                                 // Setting array subscript equal to input
                }
                Array.Sort(Name);                                   // Sorting the array elements for last name in ascending order
                WriteLine("\nNames:\n");                            // To display the names
                for (int count = 0; count < Name.Length; count++)   // For loop for displaying the number of names
                    WriteLine("{0}", Name[count]);                  // Display names with last name first followed by first name
            }
            else
                WriteLine("Empty array.");        // Telling user array is empty if they enter zero
            ReadKey();
        }
    }
}