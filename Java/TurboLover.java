import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.*;
import java.io.*;  
import javax.sound.sampled.*;
import java.net.*;
import sun.audio.*;

 public class TurboLover extends JApplet implements ActionListener
 {
   private JButton normalPlay = new JButton("Play");
   private JButton playButton = new JButton("Play with Volume");
   private JButton loopButton = new JButton("Loop with a Stop Button"); 
   private JButton loopVolume = new JButton("Loop with a Volume Control");
   private JButton stopButton = new JButton("Stop");     
   private JSlider slider = new JSlider(JSlider.VERTICAL, -80, 6, 0);
   private JProgressBar pb = new JProgressBar();
   private AudioClip audio;
   private Clip sound;
   private ImageIcon picture = new ImageIcon("C:\\Users\\Max Voisard\\Desktop\\turbo.jpg");
   private String fileName = "C:\\Users\\Max Voisard\\Desktop\\TurboLover.wav";
   private File file = new File(fileName);
   private int width, height;
   private Container con = getContentPane();
   private static final long serialVersionUID = 7526472295622776147L;
   
   public TurboLover() throws MalformedURLException
   {
      setLayout(new FlowLayout());
      normalPlay.addActionListener(this);
      playButton.addActionListener(this);
      loopButton.addActionListener(this); 
      loopVolume.addActionListener(this);
      stopButton.addActionListener(this);
      con.add(normalPlay);
      con.add(playButton);
      con.add(loopButton);
      con.add(loopVolume);
      con.add(stopButton);
      con.add(slider);
      con.add(pb);
      stopButton.setVisible(false);
      slider.setVisible(false);
      pb.setVisible(false);
      slider.setValue(0);
      slider.setPaintTicks(true);
      slider.setMajorTickSpacing(20);
      slider.setMinorTickSpacing(5);
      slider.setBorder(new TitledBorder("Volume"));
      slider.addChangeListener(new Volume());
      pb.setModel(slider.getModel());
      width = picture.getIconWidth();
      height = picture.getIconHeight();
      File file = new File(fileName);
      URI uri = file.toURI();
      URL url = uri.toURL();
      audio = Applet.newAudioClip(url);
   }
      
   public void actionPerformed(ActionEvent e)
   {
      repaint();
      try
      {
        sound = AudioSystem.getClip();
        AudioInputStream ais = AudioSystem.getAudioInputStream(file.toURI().toURL());
        sound.open(ais);
        InputStream input = new FileInputStream(fileName);
        AudioStream audioStream = new AudioStream(input);
        if (e.getSource() == normalPlay)
        {
          height *= 3;
          height /= 2;
          width *= 3;
          width /= 2;
          int value = 1 + (int)(Math.random() * 2);
          if (value == 1)
             AudioPlayer.player.start(audioStream);
          else if (value == 2)
             audio.play();
        }
        if (e.getSource() == playButton)
        {
          height *= 3;
          height /= 2;
          width *= 3;
          width /= 2;
          sound.start();
          slider.setVisible(true);
          pb.setVisible(true);
        }
        if (e.getSource() == loopButton)
        {
          height *= 3;
          height /= 2;
          width *= 3;
          width /= 2;
          audio.loop();
          stopButton.setVisible(true);
        }
        if (e.getSource() == loopVolume)
        {
          height *= 3;
          height /= 2;
          width *= 3;
          width /= 2;
          sound.loop(Clip.LOOP_CONTINUOUSLY);
          slider.setVisible(true);
          pb.setVisible(true);
        }
        if (e.getSource() == stopButton)
          audio.stop();
      }
      catch (LineUnavailableException error)
      {
        System.out.print("Error. " + error);
      }
      catch (IOException except)
      {
        System.out.print("Error. " + except);
      }
      catch (UnsupportedAudioFileException er)
      {
        System.out.print("Error. " + er);
      }
   }
   
   public void paint(Graphics g)
   {
     super.paint(g);
     g.drawImage(picture.getImage(), 0, 0, width, height, this);
   }
   
   public class Volume implements ChangeListener
   {   
     public void stateChanged(ChangeEvent e)
     {
       FloatControl control = (FloatControl) sound.getControl(FloatControl.Type.MASTER_GAIN);
       control.setValue(slider.getValue());
     }
   }
}