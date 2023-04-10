package PROTOTYPE.PatternExample.CopyConstructor;

public class PatternMainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        //~~~~~~~~~~~~~~~~~~~~~~ DEEP COPY VIA COPY CONSTRUCTOR TEST ~~~~~~~~~~~~~~~~~~~~~~
        Car car1 = new Car(new Body("RED","SPORT"),new Engine("MERCEDES V3",200),new Wheels(4,15.5));
        Car car2 = new Car(car1);

        System.out.println(car1);   //PROTOTYPE.PatternExample.CopyConstructor.Car@378bf509
        System.out.println(car2);   //PROTOTYPE.PatternExample.CopyConstructor.Car@5fd0d5ae
        //Car{body=Body{color='RED', style='SPORT'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}
        //Car{body=Body{color='RED', style='SPORT'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}

        car1.setBody(new Body("BLUE","AA"));

        System.out.println(car1);   //PROTOTYPE.PatternExample.CopyConstructor.Car@378bf509
        System.out.println(car2);   //PROTOTYPE.PatternExample.CopyConstructor.Car@5fd0d5ae
        //Car{body=Body{color='BLUE', style='AA'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}
        //Car{body=Body{color='RED', style='SPORT'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}

        car2.setWheels(new Wheels(4,20.25));

        System.out.println(car1);   //PROTOTYPE.PatternExample.CopyConstructor.Car@378bf509
        System.out.println(car2);   //PROTOTYPE.PatternExample.CopyConstructor.Car@5fd0d5ae
        //Car{body=Body{color='BLUE', style='AA'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}
        //Car{body=Body{color='RED', style='SPORT'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=20.25}}
    }
}
