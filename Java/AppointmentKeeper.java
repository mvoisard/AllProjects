import javax.swing.JOptionPane;
     
public class AppointmentKeeper
{
    static String[][] appointments = new String[7][24];  // 2-dimensional String array for whole program with 7 rows (days of week) and 24 columns (hours)
    static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; // String array for day names of week
    public static void main(String[] args)
    {
      for(int index = 0; index < 7; index++)        // For loop for the rows in first dimension of array
         for(int count = 0; count < 24; count++)      // Nested for loop for the columns in 2nd dimension of array
            appointments[index][count] = "";  // Putting nothing in each hour of each day
       DayNumber();      // Calling the DayNumber method
    }
    public static void DayNumber()
    {
         String day = JOptionPane.showInputDialog(null, "Choose day of week: ");  // Asking user for day of week
         for (int num = 0; num < daysOfWeek.length; num++)  // For loop to iterate through elements in daysOfWeek
         {
           if (day.equalsIgnoreCase(daysOfWeek[num])) // If statement to see if user's string matches array
           {
             HourAndDetails(num);   // Going to HourAndDetails method because it passed, passing num as argument
           }
           if (num == 6)    // If there hasn't been a match after the sixth element (Saturday), day of week doesn't exist
           {
             JOptionPane.showMessageDialog(null, "Error. Not a valid day of the week.");  // Telling user invalid
             DayNumber();    // Starting method over again
           }
         }
    }
         public static void HourAndDetails(int num)
         {
             String hour = JOptionPane.showInputDialog(null, "Enter military hour: "); // Asking for hour
           try
           {
           int hours = Integer.parseInt(hour);
           if (hours > 23 || hours < 0)              // If statement validating range check of 0-23
           {
             throw (new ArithmeticException());
           }
           String data = JOptionPane.showInputDialog(null, "Enter appointment details: "); // Asking user for appointment details
           appointments[num][hours] = data;    // Assigning description to user-determined location in array
           System.out.print("\t");  // Creating tab for top row of days of week in table
           for (int number = 0; number < 7; number++)  // For loop to go through daysOfWeek array elements
              System.out.print(daysOfWeek[number] + "\t");  // Displaying days of week, separated by tab
           System.out.print("\n");  // Once for loop is done, carriage return to next line for displaying hours of day
              for (int count = 0; count < 24; count++)  // For loop to go through hours of day
              {
               if (count == 0)   // For 12 a.m.
               {
                 System.out.print("12 a.m. >> ");   // Displaying 12 a.m., to be possibly followed with details
                   for (int index = 0; index < 7; index++)   // For loop going through days of week
                     System.out.print(appointments[index][count] + "\t"); // Displaying details, tabbed based on number of day of week
                 System.out.print("\n");  // Carriage return for new line in an hour
               }
               else if (count < 12)     // If statement for first 12 numbers for a.m. part of day
               {
                 System.out.print(count + " a.m. >> ");   // Displaying time of day
                   for (int index1 = 0; index1 < 7; index1++)  // For loop going through days of week
                     System.out.print(appointments[index1][count] + "\t"); // Displaying details, tabbed based on number of day of week
                 System.out.print("\n");  // Carriage return for new line in an hour 
               }
               else if (count == 12)   // For 12 p.m.
               {
                 System.out.print("12 p.m. >> ");
                   for (int index2 = 0; index2 < 7; index2++)  // For loop going through days of week
                     System.out.print(appointments[index2][count] + "\t"); // Displaying details, tabbed based on number of day of week
                 System.out.print("\n");  // Carriage return for new line in an hour
               }
               else if (count > 12)  // Second 12 numbers for p.m. part of day
               {
                 System.out.print(count - 12 + " p.m. >> ");
                 for (int index3 = 0; index3 < 7; index3++)   // For loop going through days of week
                     System.out.print(appointments[index3][count] + "\t"); // Displaying details, tabbed based on number of day of week
                 System.out.print("\n");  // Carriage return for new line in an hour
               }
              }
           }
              catch (NumberFormatException e)
              {
                JOptionPane.showMessageDialog(null, "Error. Hour must have numbers, no letters.");
                HourAndDetails(num);
              }
              catch (ArithmeticException error)
              {
                JOptionPane.showMessageDialog(null, "Error. Hour # must be positive and 23 or less.");
                HourAndDetails(num);
              }
              DayNumber();  // Calling DayNumber method again for user to enter in more data until Cancel is pressed
            }
}