package arraymanipulations;
import java.util.Arrays;
public class ArrayManipulations {
    
    public static void main(String[] args) {
       double[] doubleArray = {8.4,5.5,8.6,3.4};
       Arrays.sort(doubleArray);
       System.out.println("Double array: ");
       for(double valores : doubleArray){
           System.out.printf("%.1f ",valores);
       }
       
       int[] filledIntArray = new int[10];
       Arrays.fill(filledIntArray, 7);
       displayArray(filledIntArray, "Filled Array:");
       
       int[] intArray = {1,2,3,4,5,6,7};
       int[] intArrayCopy = new int[intArray.length];
       System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
       displayArray(intArray, "Int Array:");
       displayArray(intArrayCopy, "IntArrayCopy:");
       System.out.println(Arrays.equals(intArray, intArrayCopy));
       
       int location = Arrays.binarySearch(intArray, 5);
       if(location >= 0){
           System.out.printf("%nEncontrei o número 5 na posição %d%n",location);
       }
       else{
           System.out.println("%nO número 5 não foi encontrado%n");
       }
       location = Arrays.binarySearch(intArray, 8654);
       if(location >= 0){
           System.out.printf("%nEncontrei o número 8654 na posição %d%n",location);
       }
       else{
           System.out.println("%nO número 8654 não foi encontrado%n");
       }
       
       
    }
    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s%n",description);
        for(int valor : array){
            System.out.printf("%d", valor);
        }
        System.out.println();
    }
    
}
