package PROTOTYPE.PatternExampleWithShape;

public class TriangularPrism implements Shape,Cloneable{
    private Triangle tr;
    private Rectangle rt;

    public TriangularPrism(Triangle tr, Rectangle rt) {
        this.tr = tr;
        this.rt = rt;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        TriangularPrism clone = (TriangularPrism) super.clone();
        clone.setTr(this.tr);
        clone.setRt(this.rt);
        return clone;
    }

    @Override
    public String toString() {
        return "TriangularPrism{" +
                "tr=" + tr +
                ", rt=" + rt +
                '}';
    }

    public Triangle getTr() {
        return tr;
    }

    public void setTr(Triangle tr) {
        this.tr = tr;
    }

    public Rectangle getRt() {
        return rt;
    }

    public void setRt(Rectangle rt) {
        this.rt = rt;
    }
}
