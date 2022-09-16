package pkg12.pkg2;
import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {
        String firstNumber = 
                JOptionPane.showInputDialog("Digite o primeiro número:");
        String secondNumber = 
                JOptionPane.showInputDialog("Digite o segundo número:");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "A soma é " + sum,
                "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
    }
    
}
