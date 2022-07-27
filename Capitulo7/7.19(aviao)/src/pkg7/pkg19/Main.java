package pkg7.pkg19;

public class Main {
    
    public static void main(String[] args) {
        Voo rioSp = new Voo("RIO - SP");
        
        while(rioSp.isDisponivel()){
            rioSp.showIntro();
        }
        System.out.println("O próximo voo é em 3 horas");
        
    }
    
}
