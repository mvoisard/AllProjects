// Name:        Max Voisard
// Class:       Adv Program Using C# CIT223S
// Date:        2/6/17
// Assignment:  Chapter 3 Programming Exercise

using System;
using static System.Console;

namespace Rectangle
{
    class RectangleCalculations
    {
        static void Main(string[] args)
        {
            double area, perimeter, length, width;                      // Declaring variables which will interact with methods
            length = GetDimensions("length");                           // Value returned from method is the rectangle's length.
            width = GetDimensions("width");                             // Value returned from method is the rectangle's width.
            area = CalculateArea(length, width);                        // Area is sent back to be received in method which has two variables as arguments.
            perimeter = CalculatePerimeter(length, width);              // Perimeter is sent to CalculatePerimeter method.
            DisplayResults(area, perimeter);                            // Method for displaying the results of area and perimeter.
            ReadKey();
        }
        static double GetDimensions(string side)
        {
            string inputValue;                                          // Declaring a string to get input from user.
            int feet, inches;                                           // Variables for rectangle's feet and inches.
            Write("Enter the {0} in feet: ", side);                     // The brackets will say "length" and then "width" in the string literal, the values given from the Main method
            inputValue = ReadLine();                                    // Reads the value given from the user.
            feet = int.Parse(inputValue);                               // Converting the string to an integer.
            Write("Enter the {0} in leftover inches: ", side);          // The brackets will say "length" and then "width" in the string literal, the values given from the Main method
            inputValue = ReadLine();                                    // Reads the value given from the user.
            inches = int.Parse(inputValue);                             // Converting the string to an integer.
            return (feet + (double)inches / 12);                        // Returns amounts for length and width with inches in decimal form.
        }
        static double CalculateArea(double length, double width)
        {
            double area;                                                // Declaring variable for area.
            area = length * width;                                      // Calculates area with two variables given by user and sent from Main
            return area;                                                // Returns area to Main
        }
        static double CalculatePerimeter(double length, double width)
        {
            double perimeter;                                           // Declaring variable for perimeter.
            perimeter = (2 * width) + (2 * length);                     // Calculating area with two variables given by user and sent from Main
            return perimeter;                                           // Returns perimeter to Main
        }
        static void DisplayResults(double area, double perimeter)
        {
            Write("The perimeter is: ");                                // To display perimeter.
            WriteLine("{0:F1}", perimeter);                             // Displaying perimeter, one decimal to the right.
            Write("The area is: ");                                     // To display area.
            WriteLine("{0,9:F1}", area);                                // Displaying area, one decimal to the right.
        }
    }
}
