package pkg8.pkg15;

public class Main {

    public static void main(String[] args) {
        Rational n1 = new Rational(1, 2);
        Rational n2 = new Rational(3, 9);
        System.out.println("Operações:");
         System.out.println("");
        System.out.println("Multiplicação");
        System.out.println(Rational.multi(n1, n2));
         System.out.println("");
        System.out.println("Divisão");
        System.out.println(Rational.div(n1, n2));
         System.out.println("");
        System.out.println("Soma");
        System.out.println(Rational.sum(n1, n2));
         System.out.println("");
        System.out.println("Subtração");
        System.out.println(Rational.sub(n1, n2));
    }
    
}
