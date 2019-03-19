// Name:        Max Voisard
// Class:       Adv Program Using C# CIT223S
// Date:        4/24/17
// Assignment:  Chapter 12 Programming Exercise

using System;
using static System.Console;

namespace AveragesWithExceptions
{
    class Program
    {
        public static void Main(string[] args)
        {
            WriteLine("How many sets of test scores will you enter?");     // Asking user for number of sets
            string theSets = ReadLine();                                   // Reading the input
            int sets = int.Parse(theSets);                                 // Converting string into integer for sets
            GetTests(sets);                                                // Calling GetTests method and sending "sets" as argument
        }
        static void GetTests(int sets)                                     // GetTests method with "sets" parameter
        {
            double[] Average = new double[sets];                               // Declaring double array to hold averages for each set at decimal precision, array size has "sets" # of elements
            string[] Grades = new string[sets];                                // Declaring string array to hold letter grades for each set
            WriteLine("How many test scores will you enter for each set?");    // Asking user for number of test scores
            string number = "";                                                // String variable initialized to null, to be converted into integer for # of scores later
            number = ReadLine();                                               // Reading the input
            GetScores(sets, number, Average, Grades);                          // Calling GetScores method with four arguments passed
        }
        static void GetScores(int sets, string number, double[] Average, string[] Grades)  // GetScores method with four parameters received
        {
            string inputValue = "";                                // String variable initialized to null, to be converted into integer for scores later
            try                                                    // Try block to test if input will be error- or exception-free
            {
                double count = double.Parse(number);                             // Converting string into double for number of test scores
                if (count <= 0)                                                  // If statement testing if # of scores is at least 1 
                {
                    DivideByZeroException error = new DivideByZeroException();   // Declaring object from DivideByZeroException
                    throw error;                                                 // Throwing object to the catch block for dividing by zero
                }
                else                                                       // Else, if good, display "Set #1:"
                {
                    WriteLine("\nSet #1:");                                // Displaying header for set #1
                }
                for (int num = 0; num < sets; num++)               // For loop to go through number of sets
                {
                    double total = 0;                              // Initializing accumulator variable to zero, to reset after each iteration of loop
                    for (int index = 0; index < count; index++)    // Nested for loop to go through number of tests per set
                    {
                        WriteLine("Enter test score #" + (index + 1) + ":");   // Asking for test score
                        inputValue = ReadLine();                               // Reading next characters
                        int score = int.Parse(inputValue);                     // Converting string to double
                        if (score < 0 || score > 100)                          // If statement doing range check of 0-100
                        {
                            ArithmeticException exceptObj = new ArithmeticException();   // If not in range, declaring object for ArithmeticException
                            throw exceptObj;                                   // Throwing the exception object
                        }
                        else
                            total += score;                          // If from 0-100, adding score to accumulator variable total
                        if (index == count - 1)                      // If the loop reaches the end of the scores for one set, calculate average
                        {
                            Average[num] = total / count;          // Calculating average
                            if (num == sets - 1)      // Nested if statement testing if loop has reached the end, so it doesn't print set # anymore
                            {
                            }
                            else
                               WriteLine("\nSet #" + (num + 2) + ":");  // Displaying what set number it is
                        }
                    }
                }
                for (int numb = 0; numb < sets; numb++)    // For loop to go through number of elements (sets) in both arrays
                {
                    if (Average[numb] >= 90 && Average[numb] <= 100)   // If statement for range check of 90-100 in Average array
                    {
                        Grades[numb] = "A";    // Giving letter grade of A in Grades array for that specific index
                    }
                    if (Average[numb] >= 80 && Average[numb] < 90)     // If statement for range check of 80-90
                    {
                        Grades[numb] = "B";    // Giving letter grade of B
                    }
                    if (Average[numb] >= 70 && Average[numb] < 80)     // If statement for range check of 70-80
                    {
                        Grades[numb] = "C";    // Giving letter grade of C
                    }
                    if (Average[numb] >= 60 && Average[numb] < 70)     // If statement for range check of 60-70
                    {
                        Grades[numb] = "D";    // Giving letter grade of D
                    }
                    if (Average[numb] < 60)                       // If statement checking if grade is below 60
                    {
                        Grades[numb] = "F";    // Giving letter grade of F
                    }
                }
                for (int value = 0; value < sets; value++)   // Going through number of elements (sets) in both arrays to display average and letter grade
                {
                    WriteLine("\nThe average for set #" + (value + 1) + " is: " + Average[value]);     // Displaying average.
                    WriteLine("The letter grade for set #" + (value + 1) + " is: " + Grades[value]);   // Displaying letter grade.
                }
            }
            catch (FormatException e)               // Catch block going along with try block, testing for correct input data type
            {
                WriteLine("Error. Values entered must be numbers, not letters or other symbols. \nException type: {0}", e.Message);  // Displaying error message
                GetTests(sets);    // Calling GetTests method to start over because invalid
            }
            catch (DivideByZeroException error) // Catch block testing if attempting to divide by zero
            {
                WriteLine("Error. Cannot divide by zero (or less). \nException type: {0}", error.Message);  // Displaying error message
                GetTests(sets);   // Calling GetTests method to start over because invalid
            }
            catch (ArithmeticException exceptObj)   // Catch block testing if there is an arithmetic exception
            {
                WriteLine("Error. Numbers must be between 0-100. \nException type: {0}", exceptObj.Message);  // Displaying error message
                GetScores(sets, number, Average, Grades);   // Calling GetScores method to start over because invalid
            }
            catch (Exception e)   // Catch block for any general exception
            {
                WriteLine("Error. Exception type: {0}", e.Message);  // Displaying error message
                GetTests(sets);   // Calling GetTests method to start over because invalid
            }
            ReadKey();
        }
        }
 }