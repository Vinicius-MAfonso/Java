package hospitalunasp;

public class HospitalUnasp {

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
        
        Menu menuPrincipal = new Menu();
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(loginFrame);
    }
    
}
