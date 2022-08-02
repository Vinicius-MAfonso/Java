package pkg7.pkg14;

public class Main {

    public static void main(String[] args) {
       System.out.println(product(1,2,5,4,3));
    }
    private static int product(int...numbers){
        int result = 1;
        for(int number : numbers){
            result *= number;
        }
        return result;
    }
}
