package pkg7.pkg13;

public class Main {
    
    public static void main(String[] args) {
        int[][] sales = new int[3][5];
        for (int[] row : sales){
            for (int col = 0; col < row.length; col++){
                row[col] = 0;
            }
        }
        for (int[] row : sales){
            for (int col : row){
                System.out.print(col + "    ");
            }
            System.out.println();
        }
    }
}
