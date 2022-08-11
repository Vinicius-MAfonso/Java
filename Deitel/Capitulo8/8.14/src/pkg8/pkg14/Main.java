package pkg8.pkg14;

public class Main {
    
    public static void main(String[] args) {
       Date date1 = new Date(23, "Janeiro", 1998);
       Date date2 = new Date(24,12,2005);
       System.out.println(date1.format1());
       System.out.println(date1.format2());
       
       System.out.println(date2.format1());
       System.out.println(date2.format2());
    }
    
}
