package pkg7.pkg17;

import java.security.SecureRandom;

public class Dado {
    private static final SecureRandom randomNumber = new SecureRandom();
    private int face;
    
    public Dado(){
        face = 1;
    }
    public void roll(){
        face = randomNumber.nextInt(6)+1;
        
    }
  
    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }
    
}

