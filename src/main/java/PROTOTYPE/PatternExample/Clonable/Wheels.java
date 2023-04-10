package PROTOTYPE.PatternExample.Clonable;

public class Wheels implements Cloneable {
    private int count;
    private Double size;

    public Wheels(int count, Double size) {
        this.count = count;
        this.size = size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
