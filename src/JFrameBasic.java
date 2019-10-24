import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JFrameBasic extends JFrame implements ActionListener {
    JTextField myTex = new JTextField(10);
    JButton myBtn = new JButton("Press");

    public JFrameBasic() {
        //constructor
        setLayout(new FlowLayout());
        setSize(400, 300);
        setTitle("Form Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //
        myBtn.addActionListener(this);
        add(myBtn);



        add(myTex);
        myTex.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myBtn) {
            setTitle("pressed");
            myTex.setText("");
            JOptionPane.showMessageDialog(null, "OKY DOKY");

        } else if (e.getSource() == myTex) {
            myTex.setText("Hello");
            getContentPane().setBackground(Color.red);
        }
    }
}
