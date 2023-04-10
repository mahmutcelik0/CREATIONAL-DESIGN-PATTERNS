package FACTORY.CarwithoutFactory;

import java.math.BigDecimal;

public class Sport {
    private String model;
    private String name;
    private BigDecimal price;

    public Sport(String model, String name, BigDecimal price) {
        this.model = model;
        this.name = name;
        this.price = price;
    }

    public void drive(){
        System.out.println("Sport's "+getName()+ " "+getModel() + " IS DRIVING");
    }

    @Override
    public String toString() {
        return "Sport{" +
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
