import javax.swing.JFrame;
import java.awt.Color;
import java.awt.color.*;


public class MyFrame extends JFrame {
    MyFrame()
    {   
        this.setTitle("JFrame title goes here"); // sets the JFrame title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit of application
        this.setSize(1280, 840); // sets the x-dimension and y-dimension of the frame 
        this.setResizable(false); // avoids resizing of our frame
        this.setVisible(true); // sets visibility to true
        this.getContentPane().setBackground(new Color(217, 217, 217)); // sets the color of the frame
    }
}
