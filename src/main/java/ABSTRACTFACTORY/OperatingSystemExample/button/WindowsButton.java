package ABSTRACTFACTORY.OperatingSystemExample.button;

public class WindowsButton implements Button{
    @Override
    public void press() {
        System.out.println("PRESSED WINDOWS BUTTON");
    }
}
