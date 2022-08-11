package pkg8.pkg10;

public enum TrafficLight {
    RED(60),
    GREEN(30),
    YELLOW(3);
    
    private final int time;

    private TrafficLight(int time) {
        this.time = time;
    }
    public int getTime() {
        return time;
    }
}
