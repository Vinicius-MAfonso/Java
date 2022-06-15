package gui;
import javax.swing.JOptionPane;

public class GUI {


    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        String message = String.format("Olá %s, tudo bem?",nome);
        int good = JOptionPane.showConfirmDialog(null, message);
        System.out.println(good);
    }
    
}
