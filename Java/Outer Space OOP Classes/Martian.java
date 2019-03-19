public class Martian extends Alien
{
  public Martian(int eyes, String theColor, int theTeeth)
  {
    super(eyes, theColor, theTeeth);
  }
  public void toStrings()
  {
    System.out.print("The Martian has " + numberOfEyes + " eyes, is " + color + " and has " + teeth + " teeth.");
  }
}