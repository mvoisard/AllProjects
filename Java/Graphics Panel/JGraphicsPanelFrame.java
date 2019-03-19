import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class JGraphicsPanelFrame extends JFrame
{
  Container con = null;
  JGraphicsPanel p1 = new JGraphicsPanel(Color.BLUE);
  JGraphicsPanel p2 = new JGraphicsPanel(Color.RED);
  private static final long serialVersionUID = 7526472295622776147L;
  
  public JGraphicsPanelFrame()
  {
    con = this.getContentPane();
    con.setLayout(new GridLayout(2,1));
    con.add(p1);
    con.add(p2);
    setSize(380, 490);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[] args)
  {
    JGraphicsPanelFrame app = new JGraphicsPanelFrame();
    app.setVisible(true);
    app.setSize(380, 490);
  }
}