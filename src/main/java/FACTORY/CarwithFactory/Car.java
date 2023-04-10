package FACTORY.CarwithFactory;

import java.math.BigDecimal;

public abstract class Car {
    private String model;
    private String name;
    private BigDecimal price;

    public Car(String model, String name, BigDecimal price) {
        this.model = model;
        this.name = name;
        this.price = price;
    }

    public abstract void drive();

    protected void print(String className){
        System.out.println(className + this);
    }
    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
