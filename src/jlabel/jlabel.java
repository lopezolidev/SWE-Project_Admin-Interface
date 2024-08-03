import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;


public class jlabel {

    public static void main(String[] args) {
        
        // JLabel = a GUI display area for a string of text, an image or both 
    
        Border border = BorderFactory.createLineBorder(Color.gray, 3); // creating a border
        ImageIcon image = new ImageIcon("/media/sjlo/_backup/General/Information/UCV/COMPUTACIÓN/information/3rd_semester/subjects/SWE/project/swe_interface_project/computer-science.png");
        JLabel label = new JLabel(); //creating the label
        label.setText("Bro, do you even code?"); // inserting text in the label
        label.setIcon(image); // inserting an icon into the label

        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of an icon of the text
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER or BOTTOM of icon
        
        label.setForeground(new Color(0x123456)); //set text color
        label.setFont(new Font("Roboto",Font.PLAIN,56)); // set text font
        // label.setIconTextGap(-25); // this sets the distance between the test and an icon
        
        label.setBackground(new Color(217, 217, 217)); // set background color
        label.setOpaque(true); // display background color

        label.setBorder(border); // sets the border of the label within the frame
        label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label

        //label.setBounds(0 , 0, 350, 350); // sets x, y positions within frame as well as dimensions

        //creating the JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(1240, 840);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label); 
        // make sure you add all of your components to the frame before using .pack() method
        frame.pack(); // accommodates the elements inside the frame acording to its size and dimensions automatically
    }
   
    
    
}
