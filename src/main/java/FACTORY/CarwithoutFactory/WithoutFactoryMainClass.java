package FACTORY.CarwithoutFactory;

import java.math.BigDecimal;

public class WithoutFactoryMainClass {
    public static void main(String[] args) {
        /*
        * SEDAN IS BROKEN
        * WHEN I WANT TO ADD NEW CAR TYPE -> I NEED TO CHANGE AND ADD LOTS OF THINGS
        * */

        Sport sport = new Sport("2023","LAMBORGHINI", BigDecimal.valueOf(29999999999.99));
        sport.drive();

        SUV suv = new SUV("2020","FIAT",BigDecimal.valueOf(19999999.99));
        suv.drive();

        //Sedan sedan = new Sedan("2021","RENAULT",??); //DAMN BRO I SHOULDN'T WRITE THAT AT 3 A.M.
    }
}
