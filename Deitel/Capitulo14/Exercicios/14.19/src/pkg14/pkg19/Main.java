package pkg14.pkg19;
//As datas são impressas em vários formatos comuns. Dois dos formatos mais comuns em inglês
//são 04/25/1955 e April 25, 1955
//Elabore um aplicativo que lê uma data no primeiro formato e imprime no segundo formato

public class Main {

    public static void main(String[] args) {
        System.out.println(Date.getDateFormat("Abril 23, 1995"));
        System.out.println(Date.getRecursiveFormat("23/10/2002"));
    }
    
}
