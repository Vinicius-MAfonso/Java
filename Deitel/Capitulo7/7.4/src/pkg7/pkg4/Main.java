package pkg7.pkg4;

public class Main {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 3;
        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];
        //O array contém 9 elementos;
        for(int x = 0; x < ARRAY_SIZE; x++){
            for(int y = 0;y < table[x].length;y++){
                table[x][y] = x + y;
            }
        }
        for(int[] linha : table){
            for(int coluna: linha){
                System.out.printf("%d ",coluna);
            }
            System.out.println();
        }
    }
    
}
