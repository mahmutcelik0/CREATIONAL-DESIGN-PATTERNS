package PROTOTYPE.PatternExample.CopyConstructor;

public class Body implements Part{
    private String color;
    private String style;

    public Body(String color, String style) {
        this.color = color;
        this.style = style;
    }

    public Body (Body body) {
        this.color = body.getColor();
        this.style = body.getStyle();
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
