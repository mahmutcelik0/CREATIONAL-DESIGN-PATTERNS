package BUILDER.CarExample;

public interface Builder {
    void setBrand(String brand);
    void setModel(String model);
    void setYear(int year);
    void setPrice(double price);
    Car getCar();
}
