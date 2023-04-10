package BUILDER.CarExample;

public class CarMainClass {
    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        CarDirector director = new CarDirector(builder);

        director.buildClassicCar();
        System.out.println(director.getCar().toString());
        //Car{brand='Aston Martin', model='DB5', year=1964, price=1.0E15}

        director.buildSportCar();
        System.out.println(director.getCar().toString());
        //Car{brand='MASERATI', model='4.7s', year=2010, price=4.999999999E7}

    }
}

