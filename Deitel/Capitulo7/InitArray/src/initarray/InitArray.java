package initarray;

public class InitArray {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;//Declara a constante que será o tamanho do array
        int[] array = new int[ARRAY_LENGTH]; //cria o array com o tamanho da constante
        //Calcula o valor de cada elemento do array e atribui para a posição

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
            System.out.printf("%5d%8d%n",i,array[i]);
        }
        //Gera a saída do array
        System.out.printf("%s%8s%n","Index","Value");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n",i,array[i]);
        }
        
    }
    
}
