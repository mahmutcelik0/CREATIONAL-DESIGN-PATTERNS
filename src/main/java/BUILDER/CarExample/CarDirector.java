package BUILDER.CarExample;

public class CarDirector {
    private Builder builder;

    public CarDirector(Builder builder) {
        this.builder = builder;
    }

    public void buildSportCar(){
        builder.setPrice(49999999.99);
        builder.setBrand("MASERATI");
        builder.setModel("4.7s");
        builder.setYear(2010);
    }

    public void buildClassicCar(){
        builder.setPrice(999999999999999.99);
        builder.setBrand("Aston Martin");
        builder.setModel("DB5");
        builder.setYear(1964);
    }

    public Car getCar(){
        return builder.getCar();
    }
}
