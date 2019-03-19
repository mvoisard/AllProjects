// Name:       Max Voisard
// Class:      Java Programming CIT223S
// Date:       4/20/17
// Assignment: Chapter 15 Programming Challenge

import javax.swing.*;      // For the GUI frame
import java.awt.*;         // For the controls, like labels and buttons
import java.awt.event.*;   // To do the event handling
public class JEmail2 extends JFrame implements ActionListener  // JFrame base class for frame and ActionListener for event
{    
  private static final long serialVersionUID = 7526472295622776147L;  // Declaring static final long variable so compiler doesn't yell
  JLabel toLabel = new JLabel("To:");            // Making label saying "To:" using JLabel
  JLabel subjectLabel = new JLabel("Subject:");  // Making label saying "Subject:"
  JLabel messageLabel = new JLabel("Message:");  // Making label saying "Message:"
  JButton sendButton = new JButton("Send");      // Making button saying "Send" using JButton
  JButton clearButton = new JButton("Clear");    // Making button saying "Clear"
  JTextField to = new JTextField(20);            // Making text field for a single line for recipient using JTextField
  JTextField subject  = new JTextField(20);      // Making text field next to subject label to enter in subject
  JTextArea message = new JTextArea(10, 20);     // Making text area for multiple lines of a message using JTextField
  JScrollPane scroll = new JScrollPane(message); // Making the text area a scroll pane so scroll bars can be navigated
  public JEmail2()     // Constructor
  {
    super("Email");                      // Making the frame's title "Email" by using super to call base class
    setSize(250, 360);                   // Setting frame to specified size
    setLayout(new FlowLayout());         // Making the labels and buttons all spread out
    add(toLabel);                        // Adding label to frame
    add(to);                             // Adding text field to frame
    add(subjectLabel);                   // Adding label to frame
    add(subject);                        // Adding text field to frame
    add(messageLabel);                   // Adding label to frame
    add(scroll);                         // Adding scroll pane to frame
    add(sendButton);                     // Adding send button to frame
    add(clearButton);                    // Adding clear button to frame
    sendButton.addActionListener(this);  // Activating the action event for handling the button
    clearButton.addActionListener(this); // Using the action listener to do event after click of clear button
  }
  public void actionPerformed(ActionEvent e)  // Event-handling method when button is clicked
  {
    Object source = e.getSource();         // Object variable using the getSource method of object e
    if(source == sendButton)               // If statement for when send button is clicked
    {
       String msg = "Mail has been sent!"; // A message saying the mail has been sent
       message.append("\n" + msg);         // Appending text to text area/scroll pane and adding a new line
    }
    else if(source == clearButton)         // Else if for when the clear button is clicked
    {
      to.setText("");                      // Using setText method to make text field's string literal have nothing
      subject.setText("");                 // Setting subject text field to null
      message.setText("");                 // Clearing the message text area
    }
  }
  public static void main(String[] args)
  {
    JEmail2 frame = new JEmail2();         // Creating the frame in the main method
    frame.setVisible(true);                // Making frame visible
  }
}