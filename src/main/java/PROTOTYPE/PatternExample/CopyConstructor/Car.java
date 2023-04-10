package PROTOTYPE.PatternExample.CopyConstructor;

public class Car{
    private Part body;
    private Part engine;
    private Part wheels;

    public Car(Part body, Part engine, Part wheels) {
        this.body = body;
        this.engine = engine;
        this.wheels = wheels;
    }

    public Car(Car car){
        this.body = new Body((Body) car.getBody());
        this.engine = new Engine((Engine) car.getEngine());
        this.wheels = new Wheels((Wheels) car.getWheels());
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", engine=" + engine +
                ", wheels=" + wheels +
                "}";
    }

    public Part getBody() {
        return body;
    }

    public void setBody(Part body) {
        this.body = body;
    }

    public Part getEngine() {
        return engine;
    }

    public void setEngine(Part engine) {
        this.engine = engine;
    }

    public Part getWheels() {
        return wheels;
    }

    public void setWheels(Part wheels) {
        this.wheels = wheels;
    }
}
