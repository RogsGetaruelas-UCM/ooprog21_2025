import javax.swing.JOptionPane;

public class NameConfirmation {
    public static void main(String[] args) {
        while (true) {
            // Ask the user to input their name
            String name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);
            
            // If user cancels the input dialog (name == null), exit the program
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Program terminated.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            
            // Ask for confirmation
            int choice = JOptionPane.showConfirmDialog(null, "Do you want your name to be displayed?", 
                                                       "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
            
            // If user chooses YES, display their name and exit the loop
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name, "Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            } 
            // If user chooses CANCEL or NO, loop back to name input
            else {
                JOptionPane.showMessageDialog(null, "Returning to name input...", "Retry", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
