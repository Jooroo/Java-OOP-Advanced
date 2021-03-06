package p02_CarShopExtended;

public class Audi implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.model, this.countryProduced, Car.TYRES);
    }
}
