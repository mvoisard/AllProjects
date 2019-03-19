import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;

public class JGraphicsPanel extends JPanel
{
  private static final long serialVersionUID = 7526472295622776147L;
  public JGraphicsPanel(Color color)
  {
    setBackground(color);
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.PINK);
    g.fillOval(10, 5, 40, 40);
    g.fillOval(60, 5, 40, 40);
    g.setColor(Color.GREEN);
    g.fillRect(140, 15, 120, 120);
    g.setColor(Color.ORANGE);
    g.fillRect(180, 55, 160, 160);
    g.clearRect(150, 35, 50, 50);
    int x = 200, y = 75, size = 120;
    Graphics2D g2D = (Graphics2D)g;
    g2D.setPaint(new GradientPaint(x, y, Color.LIGHT_GRAY, size, size, Color.DARK_GRAY, true));
    g2D.fill(new Rectangle2D.Double(x, y, size, size));
    int xPoints[] = {49, 59, 79, 59, 67, 47, 22, 35, 16, 39, 49};
    int yPoints[] = {47, 69, 75, 87, 112, 92, 109, 82, 65, 67, 45};
    g.setColor(Color.CYAN);
    g.fillPolygon(xPoints, yPoints, xPoints.length);
    g.setColor(Color.YELLOW);
    g.fillArc(10, 120, 100, 100, 20, 320);
    g.fillArc(50, 120, 100, 100, 340, 40);
  }
}