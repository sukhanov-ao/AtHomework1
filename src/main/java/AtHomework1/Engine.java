package AtHomework1;

public class Engine {
    boolean hybrid;
    private float engineCapacity;
    private int horsePower;
    private int fuelRate;

    public Engine(boolean hybrid, float engineCapacity, int horsePower, int fuelRate) {
        this.hybrid = hybrid;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.fuelRate = fuelRate;
    }

    public int getFuelRate() {
        return this.fuelRate;
    }
}


