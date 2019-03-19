// Chapter 6, Programming Challenge 2
#include <iostream>
using namespace std;

// Write the prototypes for the getLength,
// getWidth, getArea, and displayData
// functions here.
double getLength();
double getWidth();
double getArea(double length, double width);
void displayData(double length, double width, double area);

int main()
{
double length, width, area;

// Get the rectangle's length.
length = getLength();
{
cout << "Enter length:";
cin >> length;
return length;
}
// Get the rectangle's width.
width = getWidth();
{
cout << "Enter width:";
cin >> width;
return width;
}
// Get the rectangle's area.
area = getArea(length, width);
{
area = length * width;
return area;
}

// Display the rectangle's data.
void displayData(double length, double width, double area);
	{
cout << "The length is: " << length << endl;
cout << "The width is: " << width << endl;
cout << "Total area is: " << area << endl;
exit(0);
	}
}
