package pkg11.pkg21;

public class Main {
    
    public static void main(String[] args) {
        try{     
            try{
                throw new IndexOutOfBoundsException();
            }catch(IllegalArgumentException e){
                System.out.println("Loucura meu");
            }finally{
                System.out.println("Saindo do bloco 1º try...");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
