// Name:         Max Voisard
// Class:        Java Programming CIT230S
// Date:         3/28/17
// Assignment:   Chapter 11 Programming Challenge

public abstract class Alien     // Making Alien an abstract class
{
  protected int numberOfEyes;   // Protected integer for number of eyes
  protected String color;       // Protected string for alien's color
  protected int teeth;          // Protected integer for number of teeth
  
  public Alien(int eyes, String theColor, int theTeeth)  // Constructor for Alien class with arguments for fields
  {
    // Setting class variables equal to data members
    numberOfEyes = eyes;
    color = theColor;      
    teeth = theTeeth;
  }
}