import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;

public class CarsAndVans extends JFrame implements ActionListener {


    final JButton carBtn = new JButton("Car");
    final JButton vanBtn = new JButton("Van");
    final JButton reset = new JButton("Reset");
    JTextField carTex = new JTextField(10);
    JTextField vanTex = new JTextField(10);
    int cars = 0, vans = 0;

    CarsAndVans() {
        setLayout(new FlowLayout());
        setSize(400, 300);
        setTitle("Cars and Vans Applet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

//        JButton carBtn = new JButton("Car");   //shadowing problem
//        JButton vanBtn = new JButton("Van");
//        JButton reset = new JButton("Reset");
//        JTextField carTex = new JTextField(10);
        carTex.setEditable(false);
//        JTextField vanTex = new JTextField(10);
        vanTex.setEditable(false);
        int cars = 0, vans = 0;

        carTex.setEditable(false);
        vanTex.setEditable(false);

        add(new Label("Cars:"));
        add(carTex);
        add(new Label("Vans:"));
        add(vanTex);
        add(carBtn);
        add(vanBtn);
        add(reset);

        carBtn.addActionListener(this);
        vanBtn.addActionListener(this);
        reset.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
//        JOptionPane.showMessageDialog(null,"Hey");
        if(actionEvent.getSource() == carBtn){
            cars++;
//            JOptionPane.showMessageDialog(null,"Hey");
        } else if(actionEvent.getSource() == vanBtn) {
            vans++;
        } else if((actionEvent.getSource() == reset)) {
            vans = 0;
            cars = 0;
        }
        carTex.setText(""+cars);
        vanTex.setText(""+vans);
    }
}
