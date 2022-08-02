package pkg6.pkg4;

public class Main {
 
    public static void main(String[] args) {
       
    }
    private static double hypotenuse(double side1, double side2){
        double result = Math.pow(side1,2)+Math.pow(side2,2);
        return result;
    }
    private static int smallest(int x,int y,int z){
        return Math.min(x, Math.min(y, z));
    }
    private static void instructions(){
        System.out.println("Instruções");
    }
    private static float intToFloat(int a){
        return (float) a;
    }
    
}
