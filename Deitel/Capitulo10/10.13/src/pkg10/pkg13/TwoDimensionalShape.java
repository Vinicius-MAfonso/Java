package pkg10.pkg13;

public abstract class TwoDimensionalShape extends Shape{
    public abstract double getArea();   
    @Override
    public String toString(){
        var forma = switch(String.valueOf(getClass())){
            case "class pkg10.pkg13.Circle" ->{
                yield "Circulo";
            }
            case "class pkg10.pkg13.Triangle" ->{
                yield "Triangulo";
            }
            case "class pkg10.pkg13.Square" ->{
                yield "Quadrado";
            }
            default ->{
                yield "Forma não identificada";
            }
        };
        
        return String.format("Essa forma é um %s",forma);
    }
}
