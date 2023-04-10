package ABSTRACTFACTORY.OperatingSystemExample.checkbox;

public class MacCheckBox implements CheckBox{
    @Override
    public void click() {
        System.out.println("CLICKED MAC CHECKBOX");
    }
}
