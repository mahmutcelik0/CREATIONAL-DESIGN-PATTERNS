package ABSTRACTFACTORY.OperatingSystemExample.checkbox;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void click() {
        System.out.println("CLICKED WINDOWS CHECKBOX");
    }
}
