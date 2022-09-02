package pkg10.pkg13;

public class Shape {
    protected static void sizeValidation(double tam){
        if(tam <= 0.0f){
            throw new IllegalArgumentException("Tamanho não pode ser menor ou igual a 0");
        }
    }
}
