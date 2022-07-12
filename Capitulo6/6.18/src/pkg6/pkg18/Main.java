package pkg6.pkg18;

public class Main {

    public static void main(String[] args) {
        squareOfAsterisks(5);
    }
    public static void squareOfAsterisks(int tam){
        for(int i = 0;i < tam; i++){
            for(int j = 0;j <= 4;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
