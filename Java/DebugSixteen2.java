
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class DebugSixteen2 extends JFrame implements MouseListener
{
   int x, y;
   int size;
   Container con = getContentPane();

   public DebugSixteen2()
   {
      setTitle("Debug Exercise");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      addMouseListener(this);
   }
   public static void main(String[] args)
   {
     DebugSixteen2 deFrame = new DebugSixteen2();
     deFrame.setVisible(true);
   }

   public void mousePressed(MouseEvent e)
   {
      x = e.getX();
      y = e.getY();
   }

   public void mouseClicked(MouseEvent e)
   {
     if(e.getClickCount() == 2)
       size = 10;
     else
       size = 20;
     repaint();
  }
  public void mouseEntered(MouseEvent e)
  {
    con.setBackground(Color.ORANGE);
  }
  public void mouseExited(MouseEvent e)
  {
    con.setBackground(Color.RED);
  }

  public void mouseReleased(MouseEvent e)
  {
  }
  public void paint(Graphics g)
  {
     super.paint(g);
     g.drawOval(x - size, y - size, size * 2, size * 2);
  }
}