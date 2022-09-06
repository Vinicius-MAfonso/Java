package pkg10.pkg17;

public class Bicycle implements CarbonFootprint{
    private final int rimSize;
    private final String brand;
    public Bicycle(int rimSize, String brand){
        this.rimSize = rimSize;
        this.brand = brand;
    }

    public int getRimSize() {
        return rimSize;
    }

    public String getBrand() {
        return brand;
    }
    @Override
    public String toString(){
        return String.format("O tamanho do aro da bicicleta é %d e a marca é %s",
                getRimSize(), getBrand());
    }

    @Override
    public String getCarbonFootprint() {
        return String.format("Bicicletas não emitem carbono!");
    }
}
