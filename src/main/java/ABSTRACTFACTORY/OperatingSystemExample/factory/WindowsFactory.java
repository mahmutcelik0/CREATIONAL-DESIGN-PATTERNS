package ABSTRACTFACTORY.OperatingSystemExample.factory;

import ABSTRACTFACTORY.OperatingSystemExample.button.Button;
import ABSTRACTFACTORY.OperatingSystemExample.button.WindowsButton;
import ABSTRACTFACTORY.OperatingSystemExample.checkbox.CheckBox;
import ABSTRACTFACTORY.OperatingSystemExample.checkbox.WindowsCheckBox;

public class WindowsFactory implements OperatingSystemFactory{

    public WindowsFactory() {
        System.out.println("WINDOWS FACTORY IS WORKING");
    }

    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new WindowsCheckBox();
    }
}
