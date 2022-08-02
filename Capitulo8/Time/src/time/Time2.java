package time;

public class Time2 {
    private int hour;
    private int minute;
    private int second;
    //Construtor sem argumento:
    //Inicializa cada variável de instância para zero
    public Time2(){
        this(0,0,0);//Invoca o construtor com três argumentos
    }
    //Construtor hora fornecida, minuto e segundo padronizados para 0
    public Time2(int hour){
        this(hour,0,0);
    }
    //Construtor hora e minuto fornecidos, segundo padronizado para 0
    public Time2(int hour,int minute){
        this(hour,minute,0);
    }
    //Construtor hora, minuto e segundo fornecidos
    public Time2(int hour, int minute, int second){
        if(hour < 0 || hour >= 24){ 
            throw new IllegalArgumentException();
        }
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException();
        }
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time2(Time2 time){
        this(time.getHour(),time.getMinute(),time.getSecond());
    }
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException();
        }
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException();
        }
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException();
        }
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException();
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException();
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException();
        }
        this.second = second;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }
    @Override
    public String toString(){
        return String.format("%d:%02d:%02d %s",
        ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
        getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
