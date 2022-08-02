package time;

public class Time {
    private int hour;// 00 - 23
    private int minute;// 00 - 59
    private int second;// 00 - 59
    //Configura o novo valor de tempo usando hora universal, e lança uma excessão
    //se os valores forem inválidos
    public void setTime(int hour, int minute, int second){
        //Valida a hora,minuto e segundo
        if(hour < 0 || hour >= 23||minute < 0 || minute >= 60 || 
                second < 0||second >=60){
            throw new IllegalArgumentException("Hora, minuto e/ou segundo estava fora do alcance");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //Converte em String no formato de data/hora universal(HH:MM:S\           S)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    @Override
    //Converte em String no formato padrão data/hora (H:MM:SS AM ou PM)
    public String toString(){
        return String.format("%02d:%02d:%02d", 
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));

    }
}
