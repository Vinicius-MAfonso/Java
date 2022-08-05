package po227assert;

import java.util.Scanner;

public class PO227Assert {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inisira um valor inteiro maior que 9");
        int n = sc.nextInt();
        assert n > 9;
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += n;
            assert soma < 99:"soma("+soma+") >= 99;";//Espera a soma menor que 99
        }
        System.out.println("Soma[1.."+n+"] = "+soma);
        sc.close();
        
    }
    
}
