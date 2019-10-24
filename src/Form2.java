import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Form2 extends JFrame {
//    JButton submitBtn = new JButton("Submit");
    JTextField name = new JTextField(10);
    Form2(String namee) {
        //constructor
        setLayout(new FlowLayout());
        setSize(400, 300);
        setTitle("Form 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        name.setEditable(false);
        add(new Label("Name:"));
        add(name);
        name.setText(namee);
    }

}
