import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Form1 extends JFrame implements ActionListener {
    JButton submitBtn = new JButton("Submit");
    JTextField name = new JTextField(10);
    Form1() {
        //constructor
        setLayout(new FlowLayout());
        setSize(400, 300);
        setTitle("Form 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        add(new Label("Name:"));
        add(name);
        add(submitBtn);
        submitBtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            Form2 f2 = new Form2(name.getText());
            dispose();
        }

    }
}
