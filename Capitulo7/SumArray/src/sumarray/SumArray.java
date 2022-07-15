package sumarray;

public class SumArray {

    public static void main(String[] args) {
      int[] array = {10,20,30,40,50,60,70,80,90,100};
      int total = 0;
      
      for(int i = 0;i < array.length;i++){
        total += array[i];
      }
      System.out.println("A soma é de " + total);
    }
    
}
