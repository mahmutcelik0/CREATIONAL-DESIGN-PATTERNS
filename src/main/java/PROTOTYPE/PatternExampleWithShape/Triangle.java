package PROTOTYPE.PatternExampleWithShape;

public class Triangle implements Shape,Cloneable{
    private Long firstEdge;
    private Long secondEdge;
    private Long thirdEdge;

    public Triangle(Long firstEdge, Long secondEdge, Long thirdEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstEdge=" + firstEdge +
                ", secondEdge=" + secondEdge +
                ", thirdEdge=" + thirdEdge +
                '}';
    }

    public Long getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(Long firstEdge) {
        this.firstEdge = firstEdge;
    }

    public Long getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(Long secondEdge) {
        this.secondEdge = secondEdge;
    }

    public Long getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(Long thirdEdge) {
        this.thirdEdge = thirdEdge;
    }
}
