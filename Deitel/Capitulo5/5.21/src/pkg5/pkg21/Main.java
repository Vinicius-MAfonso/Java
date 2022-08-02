package pkg5.pkg21;

public class Main {

    public static void main(String[] args) {
        //h² = lado1² + lado²
        //fazer a condição para todos números abaixo de 500
        for (int h = 1; h < 500; h++) {
            for (int lado1 = 1; lado1 < 500; lado1++) {
                for (int lado2 = 1; lado2 < 500; lado2++) {
                    if(Math.pow(h, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)){
                        System.out.printf("O triângulo com a relação %d² = %d² + %d² satisfaz a relação%n",h,lado1,lado2);
                    }
                }
            }
        }
        
        
    }
    
}
