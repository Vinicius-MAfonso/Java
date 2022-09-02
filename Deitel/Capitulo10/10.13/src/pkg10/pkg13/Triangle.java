package pkg10.pkg13;

public class Triangle extends TwoDimensionalShape{
    private final double altura;
    private final double base;
    
    public Triangle(double base, double altura){
        sizeValidation(altura);
        sizeValidation(base);
        this.altura = altura;
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    @Override 
    public double getArea(){
        return (getBase() * getAltura())/2;
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"%no tamanho da base é %.2f cm%na altura é %.2f cm%ne área de %.2f cm²",
                getBase(),getAltura(),getArea());
    }
}
