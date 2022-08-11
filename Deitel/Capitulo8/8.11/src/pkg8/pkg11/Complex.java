package pkg8.pkg11;

public class Complex {
    private double parteReal;
    private double parteImaginaria;
    public double result = parteReal + parteImaginaria * I;
    public static final double I = Math.sqrt(-1);
    
    public Complex(){
        this(1,1);
        System.out.println("Número complexo criado, com valor padrão(1,1)");
    }
    
    public Complex(double parteReal, double parteImaginaria){
        try{
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        }catch(IllegalArgumentException e){
            System.out.printf("Erro!, tipos errados");
        }
        System.out.printf("Número complexo criado%nParte real = %f%n"
                + "Parte imaginária = %f%n",parteReal,parteImaginaria);
    }
    public static double sumComplex(Complex n1, Complex n2){
        return n1.result + n2.result;
    }
    public static double subComplex(Complex n1, Complex n2){
        return (n2.parteReal - n1.parteReal) - (n2.parteImaginaria - n1.parteImaginaria);
    }
    public static String getComplex(Complex n1){
        return String.format("Parte real: %f%nParte Imaginária: %f%n",
                n1.parteReal, n1.parteImaginaria);
                
    }
    
}
