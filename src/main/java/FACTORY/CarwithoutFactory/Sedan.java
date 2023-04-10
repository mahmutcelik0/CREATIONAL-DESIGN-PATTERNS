package FACTORY.CarwithoutFactory;

public class Sedan {
    private String model;
    private String name;

    public Sedan(String model, String name) {
        this.model = model;
        this.name = name;
    }

    public void drive(){
        System.out.println("Sedan's "+getName()+ " "+getModel() + " IS DRIVING");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
