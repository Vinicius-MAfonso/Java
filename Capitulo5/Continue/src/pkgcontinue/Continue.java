package pkgcontinue;

public class Continue {


    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++){
            if(count == 5){
                continue;
            }
            System.out.printf("%d\t", count);
        }
    }
    
}
