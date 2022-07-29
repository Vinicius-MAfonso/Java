package time;

public class Main {

    public static void main(String[] args) {
        //Cria e inicializa um objeto time
        Time time1 = new Time();
        displayTime("After time object is created", time1);
        System.out.println();
        //Altera a data/hora e gera a saída da data/hora atualizada
        time1.setTime(13, 27, 6);
        displayTime("After calling setTime", time1);
        System.out.println();
        //Tenta definir data/hora com valores inválidos
        try{
            time1.setTime(99, 99, 99);//Valores fora do intervalo aceito pela classe
        }
        catch(IllegalArgumentException e){
            System.out.printf("Exception %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time1);
    }
    private static void displayTime(String header, Time t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
        header, t.toUniversalString(),t.toString());
    }
    
}
