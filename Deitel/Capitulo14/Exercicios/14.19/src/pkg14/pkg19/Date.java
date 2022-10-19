package pkg14.pkg19;
//As datas são impressas em vários formatos comuns. Dois dos formatos mais comuns em inglês
//são 04/25/1955 e April 25, 1955
//Elabore um aplicativo que lê uma data no primeiro formato e imprime no segundo formato
public class Date {
    public static String getRecursiveFormat(String date){
        date = date.trim().toUpperCase();
        String[] arrayDate = date.split("/");
        String month;
        month = switch(arrayDate[1]){
            case "1" -> {
                yield "Janeiro";
            }
            case "2" -> {
                yield "Fevereiro";
            }
            case "3" -> {
                yield "Março";
            }
            case "4" -> {
                yield "Abril";
            }
            case "5" -> {
                yield "Maio";
            }
            case "6" -> {
                yield "Junho";
            }
            case "7" -> {
                yield "Julho";
            }
            case "8" -> {
                yield "Agosto";
            }
            case "9" -> {
                yield "Setembro";
            }
            case "10" ->{
                yield "Outubro";
            }
            case "11" ->{
                yield "Novembro";
            }
            case "12" ->{
                yield "Dezembro";
            }
            default -> null;
                
        };
        return String.format("%s %s, %s", month,arrayDate[0],arrayDate[2]);
    }
    public static String getDateFormat(String date){
        date = date.trim().toUpperCase();
        String[] arrayDate = date.split(" |,");
        String month;
        month = switch(arrayDate[0]){
            case "JANEIRO" -> {
                yield "1";
            }
            case "FEVEREIRO" -> {
                yield "2";
            }
            case "MARÇO" -> {
                yield "3";
            }
            case "ABRIL" -> {
                yield "4";
            }
            case "MAIO" -> {
                yield "5";
            }
            case "JUNHO" -> {
                yield "6";
            }
            case "JULHO" -> {
                yield "7";
            }
            case "AGOSTO" -> {
                yield "8";
            }
            case "SETEMBRO" -> {
                yield "9";
            }
            case "OUTUBRO" ->{
                yield "10";
            }
            case "NOVEMBRO" ->{
                yield "11";
            }
            case "DEZEMBRO" ->{
                yield "12";
            }
            default -> null;
                
        };
        return String.format("%s/%s/%s", arrayDate[1],month,arrayDate[3]);
            
    }
}
