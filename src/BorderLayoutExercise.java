import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutExercise extends JFrame implements ActionListener {

    JLabel label1 = new JLabel("North");
    JLabel label2 = new JLabel("South");
    JLabel label3 = new JLabel("East");
    JLabel label4 = new JLabel("West");
    JLabel label5 = new JLabel("Center");

    public BorderLayoutExercise() {

        setLayout(new BorderLayout());
        setSize(500, 500);
        setTitle("Arranging Layouts");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        styleComponent(label1,Color.BLUE);
        styleComponent(label2,Color.GREEN);
        styleComponent(label3,Color.RED);
        styleComponent(label4,Color.YELLOW);
        styleComponent(label5,Color.DARK_GRAY);


        add("North",label1);
        add("South",label2);
        add("East" ,label3);
        add("West" ,label4);
        add(label5);
    }

    public void styleComponent(JLabel o, Color color) {

        o.setFont(new Font("Verdana",Font.BOLD,22));
        o.setForeground(color);
        o.setHorizontalAlignment(JLabel.CENTER);
        o.setVerticalAlignment(JLabel.CENTER);
    }

    public void actionPerformed(ActionEvent event){

    }
}