package pkg7.pkg27;
/*(Crivo de Eratóstenes) Um número primo é qualquer número inteiro maior que 1, 
que é uniformemente divisível apenas por ele mesmo e por 1. 
O Crivo de Eratóstenes é um método para encontrar números primos. Ele opera como segue:

a) Crie um array boolean de tipo primitivo com todos os elementos inicializados 
como true. Os elementos do array com índices primos
permanecerão true. Todos os outros elementos do array por fim são configurados 
como false.

b) Iniciando com o índice de array 2, determine se um dado elemento é true. 
Se for, faça um loop pelo restante do array e configure
como false cada elemento cujo índice é um múltiplo do índice para o elemento com 
valor true. 
Então, continue o processo com o próximo elemento com valor true. 

Para o índice de array 2, todos os elementos além do elemento 2 no array que tiverem índices
que são múltiplos de 2 (índices 4, 6, 8, 10 etc.) 
serão configurados como false; para o índice de array 3, todos os elementos além do
elemento 3 no array que tiverem índices que são múltiplos de 3 (índices 6, 9, 12, 15 etc.) 
serão configurados como false; e assim por
diante.

Quando esse processo for concluído, os elementos de array que ainda forem true 
indicam que o índice é um número primo. Esses índices podem ser exibidos. 
Escreva um aplicativo que utiliza um array de 1.000 elementos 
para determinar e exibir os números primos entre 2 e 999. 
Ignore elementos de array 0 e 1*/
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean[] array = new boolean[10];
        Arrays.fill(array, true);
        for(int i = 0;i < array.length;i++){
            if(i%i != 0 && i%1 != 0){
                array[i] == false;
            }
        }
        
    }
    
}
