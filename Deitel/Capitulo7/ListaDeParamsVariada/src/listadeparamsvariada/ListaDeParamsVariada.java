package listadeparamsvariada;

public class ListaDeParamsVariada {

    public static void main(String[] args) {
        System.out.println(average(6.0,4.0,3.5));
        System.out.println(average(6.0,10,5));
    }
    public static double average(double...args){
        double soma = 0;
        for(double valor : args){
            soma += valor;
        }
        return soma/args.length;
        
    }
}
