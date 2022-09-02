package pkg10.pkg13;

public class Square extends TwoDimensionalShape{
    private final double tamLados;
    
    public Square(double tamLados){
        sizeValidation(tamLados);
        this.tamLados = tamLados;
    }
    public double getTamLados() {
        return tamLados;
    }
    @Override 
    public double getArea(){
        return Math.pow(tamLados, 2);
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"%no tamanho do lado é %.2f cm%ne área de %.2f²",
                getTamLados(),getArea());
    }
}
