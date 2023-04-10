package ABSTRACTFACTORY.OperatingSystemExample;

import ABSTRACTFACTORY.OperatingSystemExample.factory.MacFactory;
import ABSTRACTFACTORY.OperatingSystemExample.factory.OperatingSystemFactory;
import ABSTRACTFACTORY.OperatingSystemExample.factory.WindowsFactory;

//OR CONFIGURATOR
public class OperatingSystemCatalog {
    public static OperatingSystemFactory getFactory(String name){
        if(name.equalsIgnoreCase("WINDOWS")){
            return new WindowsFactory();
        }
        else if(name.equalsIgnoreCase("MAC")){
            return new MacFactory();
        }
        return null;
    }
}
