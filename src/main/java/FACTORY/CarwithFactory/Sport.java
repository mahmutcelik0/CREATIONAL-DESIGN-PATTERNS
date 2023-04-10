package FACTORY.CarwithFactory;

import java.math.BigDecimal;

public class Sport extends Car{
    public Sport(String model, String name, BigDecimal price) {
        super(model, name, price);
    }


    @Override
    public void drive() {
        System.out.println("Sport's "+getName()+ " "+getModel() + " IS DRIVING");
    }

    public void print() {
        super.print(getClass().getSimpleName());
    }
}
