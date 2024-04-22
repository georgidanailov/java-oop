package interfacesAndAbstraction.carshop;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private
    public Audi(String model, String color, Integer horsePower, String countryProduced) {
        super.(model, color, horsePower, countryProduced);
    }

    @Override
    public Integer getMinRentDay() {
        return 0;
    }

    @Override
    public Double getPricePerDay() {
        return 0.0;
    }
}
