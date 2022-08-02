package additiongui;
import javax.swing.JOptionPane;

public class AdditionGUI {

    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String number2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        int result = Integer.parseInt(number1) + Integer.parseInt(number2);
        String message = String.format("O resultado da soma é %d", result);
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}
