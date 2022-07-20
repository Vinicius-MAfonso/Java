package initmultiarray;

public class InitMultiArray {
  
    public static void main(String[] args) {
       int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
       int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
       System.out.println("Valores no array1 por linha são: ");
       outputArray(array1);
       System.out.println("Valores no array2 por linha são: ");
       outputArray(array2);
    }
    public static void outputArray(int[][] array){
        for(int row = 0;row < array.length;row++){
            for(int column = 0; column < array[row].length/*Determina a quantidade de colunas*/;column++){
                System.out.printf("%4d",array[row][column]);
            }
            System.out.println();
        }
    }
    
}
