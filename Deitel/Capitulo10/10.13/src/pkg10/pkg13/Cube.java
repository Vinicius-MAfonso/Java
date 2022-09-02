package pkg10.pkg13;

public class Cube extends ThreeDimensionalShape{
    private final double tamAresta;
    
    public Cube(double tamAresta){
        sizeValidation(tamAresta);
        this.tamAresta = tamAresta;
    }
    public double getTamAresta() {
        return tamAresta;
    }
    @Override
    public double getVolume(){
        return Math.pow(getTamAresta(), 2)*getTamAresta();
    }
    @Override
    public double getArea(){
        return 6*Math.pow(getTamAresta(), 2);
    }
    @Override 
    public String toString(){
        return String.format(super.toString()+"%ntem tamanho do lado de %.2f cm%n e volume %.2f cm³%ne área de %.2f cm²"
                ,getTamAresta(),getVolume(),getArea());
    }
}
