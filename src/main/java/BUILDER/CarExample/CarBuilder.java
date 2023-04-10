package BUILDER.CarExample;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public void setBrand(String brand) {
        this.car.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
        this.car.setModel(model);
    }

    @Override
    public void setYear(int year) {
        this.car.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        this.car.setPrice(price);
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
