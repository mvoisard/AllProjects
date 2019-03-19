// Name:    Max Voisard
// Class:   Adv Program Using C# CIT223S
// Date:    1/30/17
// Purpose: To convert 4.5 miles into feet and kilometers, and show kilometers in 2 decimal places.

using System;
using static System.Console;

namespace Miles
{
    class MileConversions
    {
        static void Main(string[] args)
        {
            const double miles = 4.5;                                           // Initializing miles to the declared constant value intended, double precision.
            const int FEET_PER_MILE = 5280;                                     // Initializing number of feet in mile.
            const double KM_PER_MILE = 1.6934;                                  // Initializing number of kilometers in mile, double precision.
            const string TOTAL_MILES = "Total miles";                           // Doing a string to display output saying "Total miles"
            const string TOTAL_FEET = "Total feet";                             // Doing a string to display output saying "Total feet"
            const string TOTAL_KM = "Total kilometers";                         // Doing a string to display output saying "Total kilometers"
            double totalFeet;                                                   // Accumulator to receive total value of feet.
            double totalKilometers;                                             // Accumulator to receive total value of kilometers.
                
            totalFeet = miles * (double)FEET_PER_MILE;                          // Calculating total feet, keeping all the same data types.
            totalKilometers = miles * KM_PER_MILE;                              // Calculating total kilometers

            WriteLine("{0,5}{1,10:F2}", TOTAL_MILES + ":", miles);              // Writing the line to display miles with two decimals, number of spaces specified
            WriteLine("{0,5}{1,13:N0}", TOTAL_FEET + ":", totalFeet);           // Writing the line to display feet with comma separators
            WriteLine("{0,0}{1,5:F2}", TOTAL_KM + ":", totalKilometers);        // Writing the line to display kilometers with two decimals

            ReadKey();
        }
    }
}
