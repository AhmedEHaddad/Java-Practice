import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;


public class Wages {
     Wages() {
        DecimalFormat pounds = new DecimalFormat("$###,##0.00");
        //read in hours
        String hurString = showInputDialog("How many hours?");
        int hours = Integer.parseInt(hurString);
        //calculate wages
        double wages = hours * 5.73;
        //output
        showMessageDialog(null, "your wages are  " + pounds.format(wages));
    }
    
}
