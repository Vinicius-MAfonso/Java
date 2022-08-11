// No segundo caso, deve receber uma String e dois valores inteiros. [Dica: para converter a representação de String do
//mês em um valor numérico, compare as Strings utilizando o método equals. Por exemplo, se s1 e s2 forem strings, a chamada
//de método s1.equals(s2) retornará true se as strings forem idênticas, caso contrário retornará false.]

package pkg8.pkg14;

import java.util.Arrays;

public class Date {
    private int month;//1-12
    private int day;//1-31
    private int year;//qualquer
    private int daysPerMonth;
    public static final String[] MONTHLIST = {"JANEIRO","FEVEREIRO","MARÇO","ABRIL","MAIO",
        "JUNHO","JULHO","AGOSTO","SETEMBRO","OUTUBRO","NOVEMBRO","DEZEMBRO"};
    
    public Date(int day, String month, int year){
        month = month.toUpperCase();
        
        int intMonth = Arrays.binarySearch(MONTHLIST,month);
        intMonth++;
        if(intMonth <= 0 || intMonth > 12){
            throw new IllegalArgumentException("Month must be in the range(1-12)");
        }
        this.month = intMonth;
        
        setDaysPerMonth();
        if(day < 1 || day > daysPerMonth){
            throw new IllegalArgumentException(String.format("Day must be in range 1 - %d", daysPerMonth));
        }
        this.day = day;
        this.year = year;  
    }
    
    public Date(int day,int month, int year){
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("Month must be in the range(1-12)");
        }
        this.month = month;
        setDaysPerMonth();
        if(day < 1 || day > daysPerMonth){
            throw new IllegalArgumentException(String.format("Day must be in range 1 - %d", daysPerMonth));
        }
        this.day = day;
        this.year = year;      
    }
    
    
    public void nextDay(){
        day++;
        if(day > daysPerMonth){
            month++;
            day = 1;
            setDaysPerMonth();
        }
        if(month > 12){
            year++;
            month = 1;
            setDaysPerMonth();
        }
    }
    private void setDaysPerMonth(){
        daysPerMonth = switch(month){
            case 1,3,5,7,8,10,12 ->{
                yield 31;
            }case 4,6,9,11 ->{
                yield 30;
            }default ->{
                yield 28;
            }
        };
    }
    public String format1(){
        return String.format("%d/%d/%d", day,month,year);
    }
    public String format2(){
        return String.format("%s %d, %d", MONTHLIST[month-1],day,year);
    }
    
    @Override
    public final String toString(){
      return String.format("%d/%d/%d", day,month,year);
    }
}

