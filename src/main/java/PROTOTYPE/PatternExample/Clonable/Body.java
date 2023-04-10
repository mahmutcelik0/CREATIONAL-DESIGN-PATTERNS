package PROTOTYPE.PatternExample.Clonable;

public class Body implements Cloneable {
    private String color;
    private String style;

    public Body(String color, String style) {
        this.color = color;
        this.style = style;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Body{" +
                "color='" + color + '\'' +
                ", style='" + style + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
