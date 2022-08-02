package time;

public class Main {

    public static void main(String[] args) {
//        //Cria e inicializa um objeto time
//        Time time1 = new Time();
//        displayTime("After time object is created", time1);
//        System.out.println();
//        //Altera a data/hora e gera a saída da data/hora atualizada
//        time1.setTime(13, 27, 6);
//        displayTime("After calling setTime", time1);
//        System.out.println();
//        //Tenta definir data/hora com valores inválidos
//        try{
//            time1.setTime(99, 99, 99);//Valores fora do intervalo aceito pela classe
//        }
//        catch(IllegalArgumentException e){
//            System.out.printf("Exception %s%n%n", e.getMessage());
//        }
//        displayTime("After calling setTime with invalid values", time1);
    Time2 t1 = new Time2();//00:00:00
    Time2 t2 = new Time2(2);//02:00:00
    Time2 t3 = new Time2(21,34);//21:34:00
    Time2 t4 = new Time2(12,25,42);//12:25:42
    Time2 t5 = new Time2(t4);//12:25:42
    
    System.out.println("Contruido com: ");
    displayTime("t1: todos argumentos padrões", t1);
    displayTime("t2: hora especificada; minuto e segundo padrões", t2);
    displayTime("t3: hora e minuto especificados; segundo padrão", t3);
    displayTime("t4: hora, minuto e segundo especificados", t4);
    displayTime("t5: Objeto Time2 t4 especificado", t5);
    //Tenta inicializar t6 com valores inválidos
    try{
        Time2 t6 = new Time2(27,74,99); //Valores inválidos
    }catch(IllegalArgumentException e){
        System.out.printf("%nException while initializing t6: %s%n",
                e.getMessage());
    }

    }
    private static void displayTime(String header, Time2 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
        header, t.toUniversalString(),t.toString());
    }
    
}
