// Name:         Max Voisard
// Class:        Java Programming C230S
// Date:         1/31/17
// Assignment:   Chapter 4 Programming Challenge

import java.lang.Math;
import java.util.Scanner;

public class Trigonometry
{
  enum Level
  {
    LOW(1), MEDIUM(2), HIGH(3), EXTRAHIGH(4);
    private int value;
    private Level(int value) 
    {
      this.value = value;
    }
    public int getValue() 
    { 
      return value; 
    }
  }
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int factorial = 1;
    System.out.print("Enter height of triangle: ");
    int c = input.nextInt();
    boolean ifEven = NumberEntered(c);
    if (ifEven == true)
    {
      String even = "The height you entered was even.";
      System.out.println(even);
      byte[] byteArray = even.getBytes();
      System.out.println("Text in byte format: " + byteArray);
    }
    else
    {
      String odd = "The height you entered was odd.";
      System.out.println(odd);
      byte[] bytes = odd.getBytes();
      System.out.println("Text in byte format: " + bytes);
    }
    System.out.print("Enter length of triangle: ");
    int x = input.nextInt();
    input.close();
    System.out.println("Logarithm of first number: " + Math.log(c));
    for (int index = c; index > 0; index--)
        factorial *= index;
    System.out.println("Factorial of first number: " + factorial);
    System.out.println("Maximum of two numbers: " + Math.max(c, x));
    System.out.println("Minimum of two numbers: " + Math.min(c, x));
    System.out.println("Random number from 0 to 20: " + (1 + (int)(Math.random() * 20)));
    Trigonometry(c, x);
  }
  private static void Trigonometry(double num1, double num2)
  {
    double hypotenuse = Math.pow(num1, 2) + Math.pow(num2, 2);
    double hypotenuse1 = Math.sqrt(hypotenuse);
    System.out.println("The hypotenuse is: " + hypotenuse1);
    double sine = num1 / hypotenuse1;
    double cosine = num2 / hypotenuse1;
    double tangent = sine / cosine;
    System.out.println("The sine is: " + Math.sin(sine));
    System.out.println("The cosine is: " + Math.cos(cosine));
    System.out.println("The tangent is: " + Math.tan(tangent));
    double sineMeasure = Math.toDegrees(Math.asin(sine));
    System.out.println("The sine angle measure is: " + sineMeasure);
    System.out.println("The cosine angle measure is: " + (90 - sineMeasure));
    System.out.println("The right angle measure is: 90");  
  }
  private static boolean NumberEntered(int num)
  {
    Level extra = Level.EXTRAHIGH;
    Level high = Level.HIGH;
    Level medium = Level.MEDIUM;
    Level low = Level.LOW;
    boolean ifEven;
    switch(num)
    {
      case 1:
        System.out.print("You entered (" + low + ") for the height of the triangle.\n");
        break;
      case 2:
        System.out.print("You entered 2 (" + medium + ") for the height of the triangle.\n");
        break;
      case 3:
        System.out.print("You entered 3 (" + high + ") for the height of the triangle.\n");
        break;
      case 4:
        System.out.print("You entered 4 (" + extra + ") for the height of the triangle.\n");
        break;
      default:
        System.out.print("You did not enter a number from 1 to 4.\n");
    }
    if (num%2 == 0)
    {
      ifEven = true;
    }
    else
    {
      ifEven = false;
    }
    return ifEven;
  }
}