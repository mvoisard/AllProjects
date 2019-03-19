/*
    Assignment Number: Chapter 7 Programming Challenge #9
    Programmer Name: Max Voisard
    Class Information: Intro to Prog C++ (001SS)
    Date: 3/31/2016
*/
// This program uses four arrays to calculate pay.
#include <iostream>
#include <iomanip>

using namespace std;

int main ()
{
	const int EMPLOYEE_IDENTIFICATIONS = 7;																		// Set IDs as never-changing constant.
	int empId[EMPLOYEE_IDENTIFICATIONS] = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};		// List of array's IDs.
	int hours[EMPLOYEE_IDENTIFICATIONS];																		// Hours is part of array.
	double payRate[EMPLOYEE_IDENTIFICATIONS];																	// Pay rate is precise and in array.
	double wages[EMPLOYEE_IDENTIFICATIONS];																		// Wages is precise and in array.
	
	cout << "Enter hours and pay rate for the seven employees: \n" << endl;			// Tell user what the topic is about.
	for (int index = 0; index < EMPLOYEE_IDENTIFICATIONS; index++)					// Iterate through number of employees.
	{
		cout << "Hours worked by employee #" << empId[index] << ": ";				// Ask user for hours worked by employee.
		cin >> hours[index];														// Obtain user input on hours worked for each employee.
		while (hours[index] < 0)													// While loop so hours worked of array cannot be negative.
		{
			cout << "Invalid. Enter a positive number: ";							// Ask user for positive number of hours.		
			cin >> hours[index];													// Obtain user input again.
		}
		cout << "Pay rate for employee #" << empId[index] << ": ";					// Ask for hourly pay rate by each employee.
		cin >> payRate[index];														// Obtain user input for pay rate of each employee.
			while (payRate[index] < 15)												// If base pay is less than $15/hour, do again.
			{
			cout << "Please enter a base pay greater than $15.00: ";				// Ask user for correct pay rate.
			cin >> payRate[index];													// Obtain user input for pay rate.
			}
	}
	
	cout << "\nGross wages for each employee: \n" << endl;							// Display header for the employees' wages.
	
	for (int index = 0; index < EMPLOYEE_IDENTIFICATIONS; index++)					// Use for loop to display each employee's earnings.
				{
		wages[index] = hours[index] * payRate[index];								// Calculate wages by multiplying two arrays.
		cout << fixed << showpoint << setprecision(2);								// Set decimal place precise to two places, followed by zeros.
		cout << "Employee #" << empId[index] << ": $" << wages[index] << endl;		// Show employee ID and amount of wages earned.
				}
	return 0;
}
