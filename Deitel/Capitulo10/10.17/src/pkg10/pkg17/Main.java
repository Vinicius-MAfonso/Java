package pkg10.pkg17;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CarbonFootprint> vehicles = new ArrayList<>();
        Car car = new Car(Car.fuelType.FLEX, "Renault Kwid");
        car.fuelIncrease(50);
        vehicles.add(car);
        CarbonFootprint bicycle = new Bicycle(15, "Caloi");
        vehicles.add(car);
        vehicles.add(bicycle);
        for(CarbonFootprint vehicle : vehicles){
            System.out.println(vehicle);
            System.out.println(vehicle.getCarbonFootprint());
        }
        
    }
    
}
