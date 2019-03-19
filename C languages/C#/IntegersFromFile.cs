// Name:        Max Voisard
// Class:       Adv Program Using C# CIT223S
// Date:        5/1/17
// Assignment:  Chapter 13 Programming Challenge

using System;
using System.Linq;            // For obtaining minimum and maximum values of array
using System.Windows.Forms;
using System.IO;              // For reading and interacting with file

namespace Integers
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void btnContents_Click(object sender, EventArgs e)
        {
            string fileName = "C:\\Users\\mvoisard\\Desktop\\Numbers.txt";     // Setting string variable to file's name
            int count = 0, counter = 0;                                        // Initializing loop counters to 0
            if (File.Exists(fileName))                                         // If statement testing if the file exists, using the string variable
            {
                try                // Try block
                {
                    StreamReader inFile = new StreamReader("C:\\Users\\mvoisard\\Desktop\\Numbers.txt");  // Declaring object from StreamReader of the file
                    while ((fileName = inFile.ReadLine()) != null)          // While loop testing if null when reaching end of file
                    {
                        count++;                                            // Incrementing loop counter
                    }
                    inFile.Close();                     // Closing file to prevent damage to program and memory
                    int[] textFile = new int[count];    // Setting integer array equal to size of number of read lines in file
                    StreamReader file = new StreamReader("C:\\Users\\mvoisard\\Desktop\\Numbers.txt");  // Declaring object from StreamReader of the file
                    while ((fileName = file.ReadLine()) != null)          // While loop testing if null when reaching end of file
                    {
                        textFile[counter] = Convert.ToInt32(fileName);    // Setting integer-cast variable equal to array index
                        counter++;                                        // Incrementing loop counter
                    }
                    file.Close();                                             // Closing file to prevent damage to program and memory
                    int total = 0;                                            // Initializing accumulator to zero
                    for (int index = 0; index < textFile.Length; index++)     // For loop going through size of the array
                        total += textFile[index];                             // Adding array's values to accumulator
                    double average = total / textFile.Length;                 // Double-precision variable for calculating average
                    txtValues.Text = Convert.ToString(textFile.Length);       // Showing number of values in text box
                    txtAverage.Text = Convert.ToString(average);              // Showing the average, formatted to two decimal places
                    txtMax.Text = Convert.ToString(textFile.Max());           // Displaying the maximum value using Max function
                    txtMin.Text = Convert.ToString(textFile.Min());           // Displaying the minimum value using Min function
                }
                catch (FileNotFoundException except)           // Catch block for FormatException with except object
                {
                    MessageBox.Show(except.Message);           // Showing message that the data type was invalid (not integer)
                }
                catch (InvalidDataException er)                // Catch block for FormatException
                {
                    MessageBox.Show(er.Message);               // Telling user file has invalid data type (not an integer)
                }
                catch (EndOfStreamException er)                // Catch clause for EndOfStreamException
                {
                    MessageBox.Show(er.Message);               // Telling user cannot read anymore data since end of file
                }
                catch (IOException error)                      // Catch block for IOExceptionError with error object
                {
                    MessageBox.Show(error.Message);            // Displaying prewritten message to user that file couldn't be reached
                }
                catch (Exception er)                           // Catch clause for generic exception
                {
                    MessageBox.Show("Error: " + er.Message);   // Telling user error and what went wrong
                }
            }
            else
            {
                MessageBox.Show("File unavailable.");          // Else statement when File.Exists() is false, saying file is unavailable
            }
        }
    }
}

