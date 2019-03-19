// Name:       Max Voisard
// Class:      Java Programming CIT230S
// Date:       5/2/17
// Assignment: Chapter 17 Programming Challenge

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPasswordC extends JApplet implements KeyListener
{
  JLabel prompt = new JLabel("Please enter a password:");  // Label asking user for password
  JTextField password = new JTextField(10);                // Text field for entering in password
  JLabel ifCorrect = new JLabel("");                       // Label with text set to null
  Container con = getContentPane();                        // Container to hold contents
  private static final long serialVersionUID = 7526472295622776147L;
  public void init()                                       // init() method
  {
    con.setLayout(new FlowLayout());                       // Setting the components apart
    con.add(prompt);                                       // Adding label
    con.add(password);                                     // Adding text field
    con.add(ifCorrect);                                    // Adding label
    password.addKeyListener(this);                         // Implementing event-handler when key is pressed
  }
  public void keyPressed(KeyEvent e)               // Event-handling method for button
  {
    String Password = password.getText();         // Assigning text field's text to string variable
    if(e.getKeyCode() == KeyEvent.VK_ENTER)       // If statement testing if key pressed is Enter key
    {
       if ((Password.equalsIgnoreCase("Rosebud")) || (Password.equalsIgnoreCase("Redrum")) ||  (Password.equalsIgnoreCase ("Jason")) ||
          (Password.equalsIgnoreCase("Surrender")) || (Password.equalsIgnoreCase("Dorothy")))  // If statement testing if text field equals qualified passwords
             ifCorrect.setText("Access Granted.");   // Telling user access is granted
       else
             ifCorrect.setText("Access Denied.");    // Telling user access is denied
    }
  }
  public void keyReleased(KeyEvent e)             // Overriding keyReleased method
  {}
  public void keyTyped(KeyEvent e)                // Overriding keyTyped method
  {}
}