package pkg10.pkg13;

public class Sphere extends ThreeDimensionalShape{
    private final double raio;
    public Sphere(double raio){
        sizeValidation(raio);
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }
    @Override
    public double getVolume(){
        return 4*Math.PI*Math.pow(getRaio(), 3)/3;
    }
    @Override
    public double getArea(){
        return 4*Math.PI*Math.pow(raio, 2);
    }
    @Override 
    public String toString(){
        return String.format(super.toString()+"%ntem raio %.2f cm%nvolume %.2f cm³%ne área de %.2f cm²"
                ,getRaio(),getVolume(),getArea());
    }
}
