package pkg10.pkg17;

public class Car implements CarbonFootprint{
    public enum fuelType{
        GAS,ALCOHOL,FLEX
    }
    private final fuelType fuel;
    private final String brandAndModel;
    private double fuelLevel = 0;
    
    public Car(fuelType fuel, String brandAndModel){
        this.fuel = fuel;
        this.brandAndModel = brandAndModel;
    }
    public void fuelIncrease(double liters){
        if(liters < 0.0)
            throw new IllegalArgumentException("Deve ser maior que 0");
        fuelLevel += liters;
    }
    public fuelType getFuel() {
        return fuel;
    }
    public String getBrandAndModel() {
        return brandAndModel;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }
    @Override
    public String toString(){
        return String.format("O carro é um: %s e é abastecido com %s",
                getBrandAndModel(),getFuel());
    }
    @Override
    public String getCarbonFootprint() {
        return String.format("A pegada de carbono desse carro é de  %f kg CO2", 
                getFuelLevel()*(0.75 * 3.7));
    }
    
}
