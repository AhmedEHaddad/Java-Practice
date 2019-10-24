import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutExercise extends JFrame implements ActionListener {

    JButton [] myButtons = new JButton[36];// array of JButton objects

    public GridLayoutExercise() {

        setLayout(new GridLayout(3,3));
        setSize(500, 500);
        setTitle("Grid Layouts");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int i=0;

        for(JButton eachButton : myButtons) {
            eachButton = new JButton("" + (i+1));
            styleButton(eachButton,Color.BLUE);
            eachButton.addActionListener(this);

            add (eachButton);
            ++i;
        }

    }

    public void styleButton(JButton o, Color color) {

        o.setFont(new Font("Verdana",Font.BOLD,22));
        o.setForeground(color);
        o.setHorizontalAlignment(JButton.CENTER);
        o.setVerticalAlignment(JButton.CENTER);
    }

    public void actionPerformed(ActionEvent event){

        JOptionPane.showMessageDialog(this, "You clicked on button : "+ event.getActionCommand());

    }
}