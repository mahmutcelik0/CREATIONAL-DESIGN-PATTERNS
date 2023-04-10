package PROTOTYPE.PatternExampleWithShape;

public class Rectangle implements Shape,Cloneable{
    private Long longSide;
    private Long shortSide;

    public Rectangle(Long longSide, Long shortSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longSide=" + longSide +
                ", shortSide=" + shortSide +
                '}';
    }

    public Long getLongSide() {
        return longSide;
    }

    public void setLongSide(Long longSide) {
        this.longSide = longSide;
    }

    public Long getShortSide() {
        return shortSide;
    }

    public void setShortSide(Long shortSide) {
        this.shortSide = shortSide;
    }
}
