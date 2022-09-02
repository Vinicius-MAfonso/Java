package pkg10.pkg13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(new Circle(2.5));
        shapes.add(new Square(5));
        shapes.add(new Triangle(2.5, 6));
        shapes.add(new Sphere(5.5));
        shapes.add(new Cube(10));
        shapes.add(new Tetrahedron(10.5));
        for(Shape currentShape : shapes){
            System.out.println(currentShape);
            if(currentShape instanceof ThreeDimensionalShape)
                System.out.println("Essa forma é tridimensional!");
            else if(currentShape instanceof TwoDimensionalShape)
                System.out.println("Essa forma é bidimensional!");
            System.out.println("");
        }
    }
    
}
