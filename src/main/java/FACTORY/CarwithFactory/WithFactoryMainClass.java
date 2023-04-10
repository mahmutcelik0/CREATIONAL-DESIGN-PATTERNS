package FACTORY.CarwithFactory;

import java.math.BigDecimal;

public class WithFactoryMainClass {
    public static void main(String[] args) {
        //~~~~~~~~~~~~~~~~~~~~~~ BEFORE FACTORY ~~~~~~~~~~~~~~~~~~~~~~
        /*
        Car car = new Sedan("2018", "FORD", BigDecimal.valueOf(1000000.00));
        System.out.println(car);
        car.drive();
        */

        //~~~~~~~~~~~~~~~~~~~~~~ AFTER FACTORY TEST ~~~~~~~~~~~~~~~~~~~~~~

        //WE CAN SIMPLY ADD A NEW CAR TYPE -> CREATE CLASS AND EXTEND CAR OVERRIDE METHODS. FINALLY ADD CARTYPE TO FACTORY
        Car car2 = CarFactory.createCar("SPORT", "2021", "BUGATTI", BigDecimal.valueOf(3999999999999.99));
        System.out.println(car2);
        car2.drive();

        Car car3 = CarFactory.createCar("SeDaN", "2020", "ASTON MARTIN", BigDecimal.valueOf(2999999999.99));
        System.out.println(car3);
        car3.drive();

        Car car4 = CarFactory.createCar("suv", "2020", "FIAT TRUCK", BigDecimal.valueOf(1999999999.99));
        System.out.println(car4);
        car4.drive();
    }
}
