package pkg10.pkg13;

public abstract class ThreeDimensionalShape extends Shape{
    public abstract double getArea(); 
    public abstract double getVolume();
    @Override
    public String toString(){
        var forma = switch(String.valueOf(getClass())){
            case "class pkg10.pkg13.Sphere" ->{
                yield "Esfera";
            }
            case "class pkg10.pkg13.Tetrahedron" ->{
                yield "Tetraedro";
            }
            case "class pkg10.pkg13.Cube" ->{
                yield "Cubo";
            }
            default ->{
                yield "Forma não identificada";
            }
        };
        
        return String.format("Essa forma é um %s",forma);
    }
}
