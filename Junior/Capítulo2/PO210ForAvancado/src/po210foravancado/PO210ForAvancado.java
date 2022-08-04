package po210foravancado;

public class PO210ForAvancado {
    
    public static void main(String[] args) {
        double arranjo[] = {1.123,6.543,3.464,3412.42};
        System.out.println("For comum");
        for(int i = 0;i < arranjo.length;i++){
            System.out.print(arranjo[i] + " ");
        }
        System.out.println("Fim");
        System.out.println("For avançado");
        for(double valor : arranjo){
            System.out.print(valor+" ");
        }
        System.out.println("Fim");
    }
    
}
