package PROTOTYPE.PatternExample.Clonable;

public class Car implements Cloneable{
    private Body body;
    private Engine engine;
    private Wheels wheels;

    public Car(Body body, Engine engine, Wheels wheels) {
        this.body = body;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car returnCar = (Car) super.clone(); //SHALLOW CLONE
        returnCar.body =(Body) this.body.clone();
        returnCar.engine = (Engine) this.engine.clone();
        returnCar.wheels = (Wheels) this.wheels.clone();
        return returnCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", engine=" + engine +
                ", wheels=" + wheels +
                "}";
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}
