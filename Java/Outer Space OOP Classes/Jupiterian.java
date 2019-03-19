public class Jupiterian extends Alien
{
  public Jupiterian(int eyes, String theColor, int theTeeth)
  {
    super(eyes, theColor, theTeeth);
  }
  public void toStrings()
  {
    System.out.print(" The Jupiterian has " + numberOfEyes + " eyes, is " + color + " and has " + teeth + " teeth.");
  }
}