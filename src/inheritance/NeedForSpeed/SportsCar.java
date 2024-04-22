package NeedForSpeed;

public class SportsCar extends Car {

    private static final double DEFAULT_FUEL_CONSUMPTION = 10.00;

    public SportsCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
