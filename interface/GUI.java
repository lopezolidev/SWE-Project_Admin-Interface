import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;  
//importaciones añadidas para el manejo del layout

public class GUI implements ActionListener{
    
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {

        frame = new JFrame();
        // creamos el frame principal

        panel = new JPanel();
        // el panel que tendrá sus opciones y demás 

        JButton button = new JButton("Click me!");
        button.addActionListener(this);
        
        label = new JLabel("Number of Clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        //tamaños iniciales
        panel.setLayout(new GridLayout(0, 1));
        // lo organizamos como una grilla
        panel.add(button);
        panel.add(label);
        //añadimos botones y una etiqueta

        frame.add(panel, BorderLayout.CENTER);
        //añadimos el panel al frame
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //le decimos con el método setDefaulCloseOperation con esta opción

        frame.setTitle("Our GUI");
        //le damos el título de nuestro frame
        frame.pack();
        frame.setVisible(true);
        // opciones de visibilidad

    }   

    public static void main(String args[]){
        new GUI(); //constructor for main method of our object GUI
    }

    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of Clicks: " + count);
    }
}