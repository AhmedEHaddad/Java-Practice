
//package arrayofobjects;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class NumPad extends JFrame implements ActionListener {

    int i=0;
    Integer op1, op2, total;
    String number="";
    JButton [] myButtons = new JButton[10]; //array of Buttons
    JButton  addBtn = new JButton("+");
    JButton  eqBtn = new JButton("=");

    JTextField numText = new JTextField(10);
    JPanel panel = new JPanel(new GridLayout(0,3));
    JPanel panel2 = new JPanel(new FlowLayout());
    JButton btnClear = new JButton("Clear");

    public NumPad() {

        setLayout(new FlowLayout());
        setSize(500, 600);
        setTitle("Numpad App");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        styleTextField(numText);
        styleClearButton(btnClear);

        add (numText);

        for(JButton eachButton : myButtons){

            eachButton = new JButton(""+i);
            styleButton(eachButton);
            eachButton.addActionListener(this);
            panel.add(eachButton);
            i++;
        }
        //addBtn
        styleButton(addBtn);
        addBtn.addActionListener(this);
        panel.add(addBtn);
        styleButton(eqBtn);
        eqBtn.addActionListener(this);
        panel.add(eqBtn);
        panel2.add(btnClear);
        panel2.setPreferredSize(new Dimension(450,100));
        add(panel);
        add(panel2);

        btnClear.addActionListener(this);
    }

    private void styleTextField(JTextField t){
        t.setFont(new Font("Calibri",Font.BOLD,40));
        t.setBackground(Color.DARK_GRAY);
        t.setForeground(Color.WHITE);
        t.setPreferredSize(new Dimension(450,75));
    }
    private void styleClearButton(JButton b){

        b.setFont(new Font("Calibri",Font.BOLD,44));
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.WHITE);
        b.setPreferredSize(new Dimension(300,100));
    }

    private void styleButton(JButton b){

        b.setFont(new Font("Calibri",Font.BOLD,44));
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.WHITE);
        b.setPreferredSize(new Dimension(100,100));
    }

    public void actionPerformed(ActionEvent event){

        if (event.getSource() == btnClear)
        {
            number="";
            numText.setText(number);
        } else if (event.getSource() == addBtn) {
            op1 = Integer.parseInt(number);
            number="";
            numText.setText(number);
        } else if (event.getSource() == eqBtn) {
            if (op1 != null) {
                op2 = Integer.parseInt(number);
                total = op1 + op2;
                number="";
                numText.setText(""+total);
            }
        } else {
            number += event.getActionCommand().toString();
            numText.setText(number);
        }




    }


}
