/*
    Assignment Number: Chapter 9 Programming Challenge #1
    Programmer Name: Max Voisard
    Class Information: Intro to Prog C++ (001SS)
    Date: 4/14/2016
*/
#include <iostream>
using namespace std;

int figure(int numb);								// Function prototype for array size.
int* dynamicallyAllocatedNumbers(int number);		// Function prototype with function argument for array and pointer.

int main()
{
	int size = 0;							// For the number of elements in the array, set accumulator to 0.
	int *digits;							// A pointer to the array.
	int count;								// A loop counter.	
	
	size = figure(size);							// Function argument size interchanges with numb.
	digits = dynamicallyAllocatedNumbers(size);		// Function argument size interchanges with number.
	
	cout << "\nNumbers:" << endl;					// Header for the values at end of program.
	
	for (count = 0; count < size; count++)			// For loop for the number of elements entered.
	{
	cout << digits[count] << "\n";					// Numbers are displayed based on entries.
	}
}

int figure(int numb)												// The figure function is called.
{
	cout << "How many elements should the array have? " << endl;	// Ask for size of array, which user determines.
	cin >> numb;													// Entered number is stored in size variable.
	return numb;													// Return statement so it is passed back to function.
}

int* dynamicallyAllocatedNumbers(int number)				// The dynamicallyAllocatedNumbers pointer function starts.
{
	int count;										// Declare count so variable is in scope.
	int *digits = new int(number);					// Pointer is dereferenced with indirection operator, new operator for dynamic memory allocation.
	for (count = 0; count < number; count++)		// For loop goes to the amount of what was "size" and is now "number."
	{
	cout << "Enter number " << count + 1 << ":" << endl;	// Asks user for entries (amount of numbers is what user stated previously).
	cin >> digits[count];									// User enters numbers each time, passed to main function.
	}
	return digits;											// Return the pointer.
}

