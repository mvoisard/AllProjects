// This program uses precision functions.
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	double month5, month6, month7, total, average;
	
	cout << "How much did you earn month 5? ";
	cin >> month5;
	cout << "How much did you earn month 6? ";
	cin >> month6;
	cout << "How much did you earn month 7? ";
	cin >> month7;
	
	// Calculate the sales.
	total = month5 + month6 + month7;
	average = total / 3;
	
	// Display the sales figures.
	cout << "\nSalesFigures\n";
	cout << setprecision(4) << fixed << showpoint;
	cout << "------------\n";
	cout << "Month 5: \t" << setw(8) << month5 << endl;
	cout << "Month 6: \t" << setw(8) << month6 << endl;
	cout << "Month 7: \t" << setw(8) << month7 << endl;
	cout << "Total: \t\t" << setw(8) << total << endl;
	cout << "Average: \t" << setw(8) << average << endl;
	return 0;
}
