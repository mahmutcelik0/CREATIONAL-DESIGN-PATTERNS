package PROTOTYPE.PatternExample.Clonable;

public class PatternMainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        //~~~~~~~~~~~~~~~~~~~~~~ DEEP COPY VIA CLONABLE INTERFACE TEST ~~~~~~~~~~~~~~~~~~~~~~
        Car car1 = new Car(new Body("RED","SPORT"),new Engine("MERCEDES V3",200),new Wheels(4,15.5));
        Car car2 = (Car)car1.clone();

        System.out.println(car1);   //PROTOTYPE.PatternExample.Clonable.Car@378bf509
        System.out.println(car2);   //PROTOTYPE.PatternExample.Clonable.Car@5fd0d5ae
        //Car{body=Body{color='RED', style='SPORT'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}
        //Car{body=Body{color='RED', style='SPORT'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}

        car1.setBody(new Body("BLUE","AA"));

        System.out.println(car1);   //PROTOTYPE.PatternExample.Clonable.Car@378bf509
        System.out.println(car2);   //PROTOTYPE.PatternExample.Clonable.Car@5fd0d5ae
        //Car{body=Body{color='BLUE', style='AA'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}
        //Car{body=Body{color='RED', style='SPORT'}, engine=Engine{type='MERCEDES V3', horsePower=200}, wheels=Wheels{count=4, size=15.5}}
    }
}
