#include <cstdlib>
#include <iostream>
#include <ctime>
using namespace std;

int main()
{
	srand((int)time(NULL));
	int d = rand()%100000;
	cout << d << "\n";
	
	srand((int)time(NULL));
	int s = rand()%10000;
	cout << s << "\n";
	
	srand((int)time(NULL));
	int z = rand()%1000;
	cout << z << "\n";
	
	srand((int)time(NULL));
	int r = rand()%100;
	cout << r << "\n";	

	srand((int)time(NULL));
	int f = rand()%1000;
	cout << f << "\n";
	
	srand((int)time(NULL));
	int h = rand()%10000;
	cout << h << "\n";
	
	srand((int)time(NULL));
	int k = rand()%100000;
	cout << k << "\n";
	
	srand((int)time(NULL));
	int m = rand()%10000;
	cout << m << "\n";	
	
	srand((int)time(NULL));
	int p = rand()%1000;
	cout << p << "\n";
	
	srand((int)time(NULL));
	int t = rand()%100;
	cout << t << "\n";	
}
