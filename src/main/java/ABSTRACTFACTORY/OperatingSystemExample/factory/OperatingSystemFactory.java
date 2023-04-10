package ABSTRACTFACTORY.OperatingSystemExample.factory;

import ABSTRACTFACTORY.OperatingSystemExample.button.Button;
import ABSTRACTFACTORY.OperatingSystemExample.checkbox.CheckBox;

public interface OperatingSystemFactory {
    Button getButton();
    CheckBox getCheckBox();
}
