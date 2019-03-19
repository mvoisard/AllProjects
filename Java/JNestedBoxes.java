// Name:        Max Voisard
// Class:       Java Programming CIT230S
// Date:        4/25/17
// Assignment:  Chapter 16 Programming Challenge

import javax.swing.*;     // Importing swing for lightweight components
import java.awt.*;        // Importing awt for heavyweight components to interact with program

public class JNestedBoxes extends JFrame
{
  private static final long serialVersionUID = 7526472295622776147L;
  public void paint(Graphics gr)       // Calling built-in paint method, declaring Graphics object called gr
  {
    super.paint(gr);                            // Calling base class with super method
    for (int index = 0; index < 8; index++)     // For loop to make eight rectangles
       gr.drawRect(160 - (index * 15), 160 - (index * 15), (index + 1) * 30, (index + 1) * 30); // Specifying dimensions
  }
  public static void main(String[] args)
  {
    JNestedBoxes frame = new JNestedBoxes();   // Declaring the frame
    frame.setSize(340, 340);                   // Setting specified size parameters
    frame.setVisible(true);                    // Setting it visible
  }
}