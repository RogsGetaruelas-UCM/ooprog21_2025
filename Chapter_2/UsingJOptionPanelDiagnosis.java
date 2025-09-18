import javax.swing.JOptionPane;

public class NameConfirmation {
    public static void main(String[] args) {
        while (true) {
            
            String name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);
            
            
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Program terminated.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            
            
            int choice = JOptionPane.showConfirmDialog(null, "Do you want your name to be displayed?", 
                                                       "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
            
            
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name, "Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            } 
            
            else {
                JOptionPane.showMessageDialog(null, "Returning to name input...", "Retry", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
