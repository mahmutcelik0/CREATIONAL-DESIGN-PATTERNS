package FACTORY.CarwithFactory;

import java.math.BigDecimal;

public class SUV extends Car{
    public SUV(String model, String name, BigDecimal price) {
        super(model, name, price);
    }

    @Override
    public void drive() {
        System.out.println("SUV's "+getName()+ " "+getModel() + " IS DRIVING");
    }

    public void print() {
        super.print(getClass().getSimpleName());
    }
}

