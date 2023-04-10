package PROTOTYPE.PatternExample.CopyConstructor;

public class Wheels implements Part{
    private int count;
    private Double size;

    public Wheels(int count, Double size) {
        this.count = count;
        this.size = size;
    }
    public Wheels(Wheels wheels){
        this.count = wheels.getCount();
        this.size = wheels.getSize();
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "count=" + count +
                ", size=" + size +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
