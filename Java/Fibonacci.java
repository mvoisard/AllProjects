import java.util.Scanner;

public class Fibonacci
{
  public static void main(String[] args)
  {
    System.out.print("Please enter a number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    while (number <= 0)
    {
      System.out.print("Error. Numbers must be at least 1.");
      System.out.print("\nPlease enter a number: ");
      number = input.nextInt();
    }
    int[] array = new int[number + 2];
    int index = 0, count = 0, total = 0;
    GetTotal(number, array, index, count, total);
  }
  static void GetTotal(int number, int[] array, int index, int count, int total)
  {
     if (index <= number)
     {
        array[index] = index;
        index++;
        GetTotal(number, array, index, count, total);
     }
     else if (count <= number)
     {
       total += array[count];
       count++;
       GetTotal(number, array, index, count, total);
     }
     if (count == number + 1)
     {
       System.out.print("The sum of adding numbers 1 to " + number + " is: " + total);
       System.exit(0);
     }
   }
}