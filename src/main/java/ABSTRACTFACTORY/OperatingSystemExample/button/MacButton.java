package ABSTRACTFACTORY.OperatingSystemExample.button;

public class MacButton implements Button{
    @Override
    public void press() {
        System.out.println("PRESSED MAC BUTTON");
    }
}
