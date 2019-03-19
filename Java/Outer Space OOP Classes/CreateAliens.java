public class CreateAliens
{
  public static void main(String[] args)
  {
    Martian alienFromMars = new Martian(8, "red", 43);
    Jupiterian alienFromJupiter = new Jupiterian(5, "blue", 20);
    alienFromMars.toStrings();
    alienFromJupiter.toStrings();
  }
}