
package sobrecargademetodos;


public class SobrecargaDeMetodos {


    public static void main(String[] args) {
        System.out.printf("O quadrada de x flutuante é %f%n",square(7.0));
        System.out.printf("O quadrada de x inteiro é %d%n",square(7));
        
    }
    public static double square(double x){
        System.out.printf("Quadrado flutuante");
        return x*x;
    }
    public static int square(int x){
        System.out.printf("Quadrado inteiro");
        return x*x;
    }
    
}
