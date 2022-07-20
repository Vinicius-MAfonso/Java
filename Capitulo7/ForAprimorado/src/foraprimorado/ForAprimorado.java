package foraprimorado;

public class ForAprimorado {

    public static void main(String[] args) {
       int[] array = {87,50,45,65,32,12,45};
       int somaTotal = 0;
       for(int position : array){
           somaTotal += position;
       }
       System.out.println("A soma total do array é de " + somaTotal);
    }
    
}
