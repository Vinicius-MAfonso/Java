package pkg8.pkg15;

import java.math.BigDecimal;

public class Rational {
    private int numerator;
    private int denominator;
    private double result;
    
    public Rational(){
        this(1,1);
    }
    public Rational(int numerator, int denominator){
        if (denominator == 0) {
            throw new ArithmeticException("Denominador zero");
        }
        
        int g = greatestCommonDivisor(numerator, denominator);
        numerator = numerator/g;
        denominator = denominator/g;
        
        if (denominator < 0){ 
            denominator = -denominator;
            numerator = -numerator; 
        }
        
        this.numerator = numerator;
        this.denominator = denominator;
        this.result = numerator/denominator;
        
    }
    
    public static int greatestCommonDivisor(int a, int b){
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    
    public static Rational sum(Rational n1, Rational n2){
        int deno;
        int mmc = Rational.greatestCommonDivisor(n1.getDenominator(),n2.getDenominator());
        System.out.println(mmc);
        int numeN1 = mmc/n1.getDenominator()*n1.getNumerator();
        
        int numeN2 = (mmc/n2.getDenominator())*n2.getNumerator();
       
        
        int nume = numeN1 + numeN2;
        
        deno = mmc;
        Rational result = new Rational(nume, deno);
        return result;
    }
    public static Rational sub(Rational n1, Rational n2){
        int nume;
        int deno;
        if(n1.getDenominator() == n2.getDenominator()){
            nume = n1.getNumerator() + n2.getNumerator();
            deno = n1.getDenominator();
        }else{
            int mmc = Rational.greatestCommonDivisor(n1.getDenominator(),n2.getDenominator());
            nume = ((mmc/n1.getDenominator())*n1.getNumerator()) - 
                    ((mmc/n2.getDenominator())*n2.getNumerator());
            deno = mmc;
        }
        Rational result = new Rational(nume, deno);
        return result;
    }
    
    
    
    public static Rational multi(Rational n1, Rational n2){
        int nume = n1.getNumerator() * n2.getNumerator();
        int deno = n1.getDenominator() * n2.getDenominator();
        Rational result = new Rational(nume, deno);
        return result;
    }
    public static Rational div(Rational n1, Rational n2){
        int auxiliar = n2.getNumerator();
        n2.setNumerator(n2.getDenominator());
        n2.setDenominator(auxiliar);
        
        Rational result = Rational.multi(n1, n2);
        return result;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public BigDecimal toStringDecimal(){
        return new BigDecimal(String.valueOf(result));      
    }
    @Override
    public String toString(){
        return String.format(" %d%n---%n %d", numerator, denominator);
    }
}
