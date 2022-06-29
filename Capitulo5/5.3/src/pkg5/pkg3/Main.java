package pkg5.pkg3;

public class Main {

    public static void main(String[] args) {
        //Letra A
        int soma = 0;
        for(int i = 1;i<=99;i++){
            if(i%2 == 0){
                continue;
            }
            soma += i; 
        }
        System.out.printf("A soma dos números impares de 1 a 99 é %d%n", soma);
        //Letra B
        System.out.printf("A potência do 2.5 por 3 é %.2f%n", Math.pow(2.5, 3));
        //Letra C
        int count = 1;
        int i = 0;
        while (count <= 20){
            if(i >= 5){
                System.out.println();
                i = 0;
            }
            System.out.printf("%d\t",count);
            count++;
            i++;
        }
        System.out.println();
        //Letra D
        int y = 0;
        for(int countFor = 1; countFor<=20;countFor++){
            if(y >= 5){
                System.out.println();
                y = 0;
            }
            System.out.printf("%d\t",countFor);
            y++;
        }
        
        
    }
    
}
