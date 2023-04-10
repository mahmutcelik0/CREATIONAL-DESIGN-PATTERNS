package ABSTRACTFACTORY.OperatingSystemExample.factory;

import ABSTRACTFACTORY.OperatingSystemExample.button.Button;
import ABSTRACTFACTORY.OperatingSystemExample.button.MacButton;
import ABSTRACTFACTORY.OperatingSystemExample.checkbox.CheckBox;
import ABSTRACTFACTORY.OperatingSystemExample.checkbox.MacCheckBox;

public class MacFactory implements OperatingSystemFactory{

    public MacFactory() {
        System.out.println("MAC FACTORY IS WORKING");
    }

    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new MacCheckBox();
    }
}
