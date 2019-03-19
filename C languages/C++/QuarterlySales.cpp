/*
        Assignment Number: Chapter 12 Programming Challenge #11
        Programmer Name: Max Voisard
        Class Information: Intro to Prog C++ (001SS)
        Date: 5/5/2016
*/
// This program manipulates quarterly sales for different divisions.
#include <iostream>
#include <fstream>
using namespace std;

struct Information								// Structure named Information.
{
	string divisionName;						// String for division's name.
	double quarter;								// Double for quarter.
	double quarterlySales;						// Double for quarterly sales.
};					

int main()
{
	Information division[4];					// Array size of 4.
	fstream Quarters;							// File stream object of Quarters.
	int index;									// Declaring loop counter.
		
	Quarters.open("quarters.txt", ios::out);	// Opening file.
	
	do
	{
	cout << "Enter a positive number of sales for the East division for quarter 1: " << endl;
	cin >> division[index].quarterlySales;								
	} while (division[index].quarterlySales < 0);					// For loop for input.	
	do
	{
	cout << "Enter a positive number of sales for the West division for quarter 1: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.
	do
	{
	cout << "Enter a positive number of sales for the North division for quarter 1: " << endl;
	cin >> division[index].quarterlySales;
	} while (division[index].quarterlySales < 0);					// For loop for input.							
	do
	{
	cout << "Enter a positive number of sales for the South division for quarter 1: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.			

	do
	{
	cout << "Enter a positive number of sales for the East division for quarter 2: " << endl;
	cin >> division[index].quarterlySales;								
	} while (division[index].quarterlySales < 0);					// For loop for input.	
	do
	{
	cout << "Enter a positive number of sales for the West division for quarter 2: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.
	do
	{
	cout << "Enter a positive number of sales for the North division for quarter 2: " << endl;
	cin >> division[index].quarterlySales;
	} while (division[index].quarterlySales < 0);					// For loop for input.							
	do
	{
	cout << "Enter a positive number of sales for the South division for quarter 2: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.	

	do
	{
	cout << "Enter a positive number of sales for the East division for quarter 3: " << endl;
	cin >> division[index].quarterlySales;								
	} while (division[index].quarterlySales < 0);					// For loop for input.	
	do
	{
	cout << "Enter a positive number of sales for the West division for quarter 3: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.
	do
	{
	cout << "Enter a positive number of sales for the North division for quarter 3: " << endl;
	cin >> division[index].quarterlySales;
	} while (division[index].quarterlySales < 0);					// For loop for input.							
	do
	{
	cout << "Enter a positive number of sales for the South division for quarter 3: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.			

	do
	{
	cout << "Enter a positive number of sales for the East division for quarter 4: " << endl;
	cin >> division[index].quarterlySales;								
	} while (division[index].quarterlySales < 0);					// For loop for input.	
	do
	{
	cout << "Enter a positive number of sales for the West division for quarter 4: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.
	do
	{
	cout << "Enter a positive number of sales for the North division for quarter 4: " << endl;
	cin >> division[index].quarterlySales;
	} while (division[index].quarterlySales < 0);					// For loop for input.							
	do
	{
	cout << "Enter a positive number of sales for the South division for quarter 4: " << endl;
	cin >> division[index].quarterlySales;							
	} while (division[index].quarterlySales < 0);					// For loop for input.	
	Quarters.write("quarters.txt", division[index].quarterlySales);
}

