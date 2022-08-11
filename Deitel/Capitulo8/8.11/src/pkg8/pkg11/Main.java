package pkg8.pkg11;

public class Main {

    public static void main(String[] args) {
        Complex c1 = new Complex(50, 100);
        Complex c2 = new Complex(35, 25);
        
        System.out.println(Complex.getComplex(c1));
        System.out.println(Complex.subComplex(c1, c2));
        System.out.println(Complex.sumComplex(c1, c2));
    }
    
}
