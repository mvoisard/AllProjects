import java.nio.file.*;
import java.io.*;
import java.util.InputMismatchException;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class WritingAndReadingFiles
{
  public static void main(String[] args)
  {
    int id = 0;
    double payRate = 0.0;
    final int QUIT = 999;
    WriteAndRead(id, payRate, QUIT);
  }
  public static void WriteAndRead(int id, double payRate, final int QUIT)
  {
    Scanner input = new Scanner(System.in);
    Path file = Paths.get("C:\\Documents and Settings\\ericv\\Desktop\\file.txt");
    String s = "", delimiter = ",", name;
    try
    {
      OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
      System.out.print("Enter employee ID number: ");
      id = input.nextInt();
      while (id != QUIT)
      {
        System.out.print("Enter name for employee #" + id + ": ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("Enter pay rate: ");
        payRate = input.nextDouble();
        s = id + delimiter + name + delimiter + payRate;
        writer.write(s, 0, s.length());
        writer.newLine();
        System.out.print("Enter next ID number or " + QUIT + " to quit.");
        id = input.nextInt();
      }
      writer.close();
      input.close();
    }
    catch (InputMismatchException error)
    {
      System.out.print("Error: " + error + "\n");
      WriteAndRead(id, payRate, QUIT);
    }
    catch (Exception e)
    {
      e.printStackTrace();
      WriteAndRead(id, payRate, QUIT);
    }
    System.out.print("Data records for employees:\n");
    try
    {
      InputStream keyboard = new BufferedInputStream(Files.newInputStream(file));
      BufferedReader reader = new BufferedReader(new InputStreamReader(keyboard));
      s = reader.readLine();
      while (s != null)
      {
        System.out.println(s);
        s = reader.readLine();
      }
      reader.close();
    }
    catch (Exception e)
    {
      System.out.println("Error:" + e + "\n");
      WriteAndRead(id, payRate, QUIT);
    }
  }
}