package pkg10.pkg13;

public class Circle extends TwoDimensionalShape{
    private final double raio;
    public Circle(double raio){
        sizeValidation(raio);
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    @Override
    public double getArea(){
        return Math.PI * Math.pow(getRaio(), 2);
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"%ntem raio %.2f cm%ne área de %.2f cm²",
                getRaio(),getArea());
    }
}
