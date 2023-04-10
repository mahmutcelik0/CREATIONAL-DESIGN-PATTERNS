package PROTOTYPE.PatternExampleWithShape;

public class ShapeMainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        //~~~~~~~~~~~~~~~~~~~~~~ TEST ~~~~~~~~~~~~~~~~~~~~~~
        TriangularPrism triangularPrism1 = new TriangularPrism(new Triangle(3L,4L,5L),new Rectangle(3L,4L));
        TriangularPrism triangularPrism2 = (TriangularPrism) triangularPrism1.clone();

        System.out.println(triangularPrism1);
        System.out.println(triangularPrism2);

        triangularPrism1.setTr(new Triangle(10L,10L,10L));

        System.out.println(triangularPrism1);
        System.out.println(triangularPrism2);
    }
}
