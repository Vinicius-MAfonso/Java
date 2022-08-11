package pkg8.pkg10;

public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight1 = TrafficLight.GREEN;
        for(TrafficLight trafficLight : TrafficLight.values()){
            System.out.println(trafficLight);
        }
        System.out.println(trafficLight1);
    }
    
}
