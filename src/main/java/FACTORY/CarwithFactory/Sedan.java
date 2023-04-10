package FACTORY.CarwithFactory;

import java.math.BigDecimal;

public class Sedan extends Car{
    public Sedan(String model, String name, BigDecimal price) {
        super(model, name, price);
    }


    @Override
    public void drive() {
        System.out.println("Sedan's "+getName()+ " "+getModel() + " IS DRIVING");
    }


    public void print() {
        super.print(getClass().getSimpleName());
    }
}
