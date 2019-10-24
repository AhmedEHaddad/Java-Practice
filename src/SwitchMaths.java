import static javax.swing.JOptionPane.*;

public class SwitchMaths {
    SwitchMaths(){
        String gradeStr = showInputDialog("Enter your grade:");
        char grade = gradeStr.charAt(0);

        String opinion;
        switch (grade) {
            case'a': case 'A':
                opinion = "That's A";
                break;
            case'b': case 'B':
                opinion = "That's B";
                break;
            case'c': case 'C':
                opinion = "That's C";
                break;
            case'd': case 'D':
                opinion = "That's D";
                break;
            default:
                opinion = "perhaps u r that good";
        }
        showMessageDialog(null,"you go tthat"+opinion);
    }

}
