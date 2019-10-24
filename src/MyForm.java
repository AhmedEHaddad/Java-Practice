
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class MyForm extends JFrame implements ActionListener {

    ImageIcon dogImage = new ImageIcon("src//images//dog.png");
    ImageIcon catImage = new ImageIcon("src//images//cat.png");
    ImageIcon birdImage = new ImageIcon("src//images//bird.png");

    JButton btnDog = new JButton(dogImage);
    JButton btnCat = new JButton(catImage);
    JButton btnBird = new JButton(birdImage);

    MyForm(String title){
        //constructor#1
        setTitle(title);
        setSize(300,150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnDog.setSize(new Dimension(100,60));
        add(btnDog);
        setVisible(true);
        btnDog.addActionListener(this);
    }

    MyForm(int width, int height){
        //constructor#2
        setSize(width,height);
        setTitle("This is a cat Form");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnCat.setSize(new Dimension(100,78));
        add(btnCat);
        setVisible(true);

        btnCat.addActionListener(this);
    }

    MyForm(){
        setSize(300,150);
        setTitle("This is a bird Form");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnBird.setSize(new Dimension(100,100));
        add(btnBird);

        btnBird.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == btnDog){
            JOptionPane.showMessageDialog(this, "Woof! Woof!");
        }
        else if (e.getSource() == btnCat){
            JOptionPane.showMessageDialog(this, "Meow! Meow!");
        }
        else if (e.getSource() == btnBird){
            JOptionPane.showMessageDialog(this, "Chirp! Chirp!");
        }

    }

}