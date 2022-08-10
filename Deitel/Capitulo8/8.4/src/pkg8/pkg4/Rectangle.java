package pkg8.pkg4;

public class Rectangle {
   private double length = 1;
   private double width = 1;
   
    public Rectangle(double length, double width){
        if((length < 1 || width < 1) || (length > 20 || width > 20)){
            throw new IllegalArgumentException("O número não pode ser negativo"
                    + "nem maior que 20");
        }else{
            this.length = length;
            this.width = width;
        }
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter(){
        return getWidth()*2 + getLength()*2;
    }
    public double getArea(){
        return getWidth()*getLength();
    }
   
}
