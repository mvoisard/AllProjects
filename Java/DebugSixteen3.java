// Max Voisard and Dalton Leckey
// This program displays promotional messages
// with the click of a button
// The button is disabled when all messages are on screen
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class DebugSixteen3 extends JFrame implements ActionListener
{
   JLabel firstText = new JLabel("Our company is growing!");
   JLabel secText = new JLabel("What makes us better than most?");
   JButton findOutButton = new JButton("Find Out");
   FlowLayout flow = new FlowLayout();
   String[] reason = {"Our products", "Our people",
        "Our commitment", "Our service", "YOU!!"};
   Font boldFont = new Font("TimesRoman", Font.BOLD, 20);
   int x = 30, y = 80;
   int counter = 0;

   public DebugSixteen3()
   {
     Container con = getContentPane();
     con.setLayout(flow);
     setBackground(Color.PINK);
     con.add(firstText);
     con.add(secText);
     con.add(findOutButton);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     findOutButton.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e)
   {
      final int GAP = 25;
      Graphics gr = getGraphics();
      gr.setFont(boldFont);
      gr.setColor(Color.blue);
      if(counter >= reason.length)
         findOutButton.setEnabled(false);
      else
         gr.drawString(reason[counter], x, y += GAP);
         counter++;
   }
   public static void main(String[] args)
   {
      DebugSixteen3 frame = new DebugSixteen3();
      frame.setSize(350, 250);
      frame.setVisible(true);
   }
}