#include <iostream>
using namespace std;

class Rectangle {                                   // Creating a Rectangle class...you could declare and define this class in a Rectangle.h header file for global implementation/reference/exportation to .cpp files
    int width, height;								// Two PRIVATE variables, because private is default
  public:											// public access specifier/modifier with colon after it
    Rectangle();									// Default constructor declared but not defined
    Rectangle(int,int);							    // Overloaded constructor declared but not defined
    int area(void) {return (width*height);}		    // Method/member function of type integer and "void" of arguments but returning private variables
};

Rectangle::Rectangle() {                            // Declaring a constructor's content involves doing class::constructor() and then putting in class's variables
  width = 5;
  height = 5;
}

Rectangle::Rectangle(int a, int b) {				// Overloaded constructor set equal to whatever parameters are initialized to it in main()
  width = a;										// Could also use this keyword by doing this.a = a;
  height = b;
}

class Circle {
    double radius;								  	  // Private variable, also known as an attribute
  public:										      // public access specifier
    Circle(double r) : radius(r) { }                  // This is member initialization, or declaring constructor variables inside the class instead out outside its scope, is like saying "Circle::Circle(double r) { radius=r;}" - as normal, you could initialize the r variable, like Circle(double r = 10)
    double area() {return radius*radius*3.14159265;}  // Method/member function, also known as a behavior
};

class Cylinder {
    Circle base;										   // Declaring Circle object within Cylinder class
    double height;
  public:
    Cylinder(double r, double h) : base (r), height(h) {}  // Is same as Cylinder::Cylinder(double r, double h) { base=r; height=h; }
    double volume() {return base.area() * height;}
};

class Shape
{
// protected member variables should be available for derived classes
protected:
char* Color;
public:
Shape()
{
cout<<"In base class Shape's constructor"<<endl;
Color = "No Color!";
}
~Shape()  // Destructor - destroys all of object's data (or deallocates memory) when outside scope of function, so when ending curly brace comes
{
cout<<"In base class Shape's destructor"<<endl;
};
virtual char* GetColor()  // Virtual base member function, return the object's data. A virtual function is basically an "underriding" function; in method overloading, a method of its same name overrides the virtual function between base and sub classes
{
return Color;
}
};  // Object is destroyed from destructor

class Aaa {
private:
   // A private variable named xxx of type T
   T xxx;
public:
   // Constructor
   Aaa(T x) { xxx = x; }
   // OR
   Aaa(T xxx) { this->xxx = xxx; }
   // OR using member initializer list, as done earlier
   Aaa(T xxx) : xxx(xxx) { }
 
   // A getter for variable xxx of type T receives no argument and return a value of type T
   T getXxx() const { return xxx; }
 
   // A setter for variable xxx of type T receives a parameter of type T and return void
   void setXxx(T x) { xxx = x; }
   // OR
   void setXxx(T xxx) { this->xxx = xxx; }
}

int main() {
  Rectangle rect(3,4);
  Rectangle rectb;
  Rectangle * foo, * bar, * baz;     // Assigning pointers, so the values are literally the memory address numbers of the Rectangle objects. Not to be confused with the dereference operator * (which sets variable back equal to original value, not address), where there is no space between the asterisk and variable, unlike a pointer
  foo = &rect;                                        // Assign-of operator, where the address of the object is reassigned from the original pointer's memory address to a different one
  bar = new Rectangle(5, 6);						  // The memory address of any Rectangle object for arguments of a width of 3 and height of 4 is set equal to a new memory address, this time for 5 and 6
  baz = new Rectangle[2] { {2,5}, {3,6} };			  // Setting pointer to new memory address, this one for an array of two Rectangle objects with specified parameters
  cout << "rect area: " << rect.area() << endl;		  // Do object.method() to apply a method from a class, as per any programming language
  cout << "rectb area: " << rectb.area() << endl;
  cout << "obj's area: " << obj.area() << '\n';
  cout << "*foo's area: " << foo->area() << '\n';     // Arrow operator is used to access a method or data member from a POINTER, keep in mind this an unconventional way of referencing methods in object-oriented programming
  cout << "*bar's area: " << bar->area() << '\n';
  cout << "baz[0]'s area:" << baz[0].area() << '\n';
  cout << "baz[1]'s area:" << baz[1].area() << '\n';       
  delete bar;										  // The delete keyword deallocates the memory block pointed to by ptr (if not null)
  delete[] baz;
  Cylinder foo(10,20);								  // The first argument of 10 is what the Circle class inherits for its radius variable from its base object in Cylinder
  cout << "foo's volume: " << foo.volume() << '\n';
  return 0;
}
