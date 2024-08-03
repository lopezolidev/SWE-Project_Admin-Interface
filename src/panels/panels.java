package src.panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class panels {
    
    public static void main(String[] args){

        // JPanel a GUI component that functions as a container to hold other components

        ImageIcon image = new ImageIcon("/media/sjlo/_backup/General/Information/UCV/COMPUTACIÓN/information/3rd_semester/subjects/SWE/project/swe_interface_project/thumbs-up.png"); //creating an icon

        JLabel label = new JLabel();
        label.setText("!!!");
        label.setForeground(Color.white);
        label.setFont(new Font("Roboto",Font.PLAIN,56));
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redPanel = new JPanel(); //creating a panel
        redPanel.setBackground(new Color(0x9697FF)); // setting color of the panel
        redPanel.setBounds(0, 0, 250, 250); // setting size of the panel


        JPanel bluePanel = new JPanel(); //creating a panel
        bluePanel.setBackground(new Color(0x5354FF)); // setting color of the panel
        bluePanel.setBounds(250, 0, 250, 250); // setting size of the panel
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel(); //creating a panel
        greenPanel.setBackground(new Color(0x0203A4)); // setting color of the panel
        greenPanel.setBounds(0, 250, 500, 250); // setting size of the panel
        greenPanel.setLayout(new BorderLayout());

        //implementing JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        bluePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
