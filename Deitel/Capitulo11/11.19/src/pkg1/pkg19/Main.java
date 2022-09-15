package pkg1.pkg19;

public class Main {

    public static void main(String[] args) {
        try{
            SomeClass someClass = new SomeClass();
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
}
