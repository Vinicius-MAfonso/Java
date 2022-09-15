package pkg11.pkg18b;

public class Main {

    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        }catch(Exception e){
            e.printStackTrace();
        }catch(NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }
    }
}
