package barchart;

public class BarChart {

    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Notas no gráfico");
        //Gera o rótulo
        for(int counter = 0; counter < array.length; counter++){
            if(counter == 10){
                System.out.printf("%5d", 100);
            }else{
                System.out.printf("%02d-%02d: ", counter*10,counter*10+9);
            }
            //Gera a barra
            for(int asteristicos = 0; asteristicos < array[counter];asteristicos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
