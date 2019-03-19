/*
    Assignment Number: Chapter 6 Programming Challenge #2
	Programmer Name: Max Voisard
    Class Information: Intro to Prog C++ (001SS)
    Date: 3/24/2016
*/
// This program calculates a rectangle's area.
#include <iostream>
using namespace std;

// Function prototypes.
double getLength();
double getWidth();
double getArea(double length, double width);
void displayArea(double length, double width, double area);

int main()
{
	double length, width, area;
	
	// Obtain length and store it in amount.
	length = getLength();
	
	// Obtain width and store it in amount.
	width = getWidth();
	
	// Calculate area.
	area = getArea(length, width);
	
	// Display area.
	displayArea(length, width, area);
	
	return 0;
}

double getLength()													// Function getLength is called from int(main).
	{
	cout << "Enter the length of the rectangle: ";					// Ask user for length of rectangle.
	double length;													// Declare length to double precision.
	cin >> length;													// Obtain user input for length.
	return length;													// Return length to int(main).
	}

double getWidth()													// Function getWidth is called from int(main).
		{
	cout << "Enter the width of the rectangle: ";					// Ask user for width of rectangle.
	double width;													// Declare width to double precision.
	cin >> width;													// Obtain user input for length.
	return width;													// Return length to int(main).
		}	

double getArea(double length, double width)							// Function getArea is called from int(main).
			{
	double area = length * width;									// Calculate area by multiplying specified length and width.
	return area;													// Return resulting area to int(main).
			}

void displayArea(double length, double width, double area)			// Function displayArea is called from int(main).
				{
	cout << "The length of the rectangle is: " << length << endl;	// Display the length of the rectangle.
	cout << "The width of the rectangle is: " << width << endl;		// Display the width of the rectangle.
	cout << "The area of the rectangle is: " << area << endl;		// Display the area of the rectangle.
}
