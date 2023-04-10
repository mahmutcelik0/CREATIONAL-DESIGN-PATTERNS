package FACTORY.CarwithFactory;

import java.math.BigDecimal;

public class CarFactory {
    public static Car createCar(String carType, String model, String name, BigDecimal price) {
        Car returnCar = switch (carType.toUpperCase()) {
            case "SEDAN" -> new Sedan(model, name, price);
            case "SPORT" -> new Sport(model, name, price);
            case "SUV" -> new SUV(model, name, price);
            default -> null;
        };
        return returnCar;
    }
}
