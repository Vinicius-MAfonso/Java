package pkg10.pkg13;

public class Tetrahedron extends ThreeDimensionalShape{
    private final double tamAresta;
    
    public Tetrahedron(double tamAresta){
        sizeValidation(tamAresta);
        this.tamAresta = tamAresta;
    }
    public double getTamAresta() {
        return tamAresta;
    }
    @Override 
    public double getArea(){
        return Math.pow(getTamAresta(), 2)*Math.sqrt(3);
    }
    @Override
    public double getVolume() {
        return (Math.pow(getTamAresta(), 3)*Math.sqrt(2))/12;
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"%no tamanho do lado é %.2f cm%ne área de %.2f cm²%no volume é de %.2f cm³",
                getTamAresta(),getArea(),getVolume());
    }
}
