package ABSTRACTFACTORY.BuildInSet;

import ABSTRACTFACTORY.BuildInSet.factory.ArcelikFactory;
import ABSTRACTFACTORY.BuildInSet.factory.BekoFactory;
import ABSTRACTFACTORY.BuildInSet.factory.BuildInSetFactory;
import ABSTRACTFACTORY.BuildInSet.factory.SiemensFactory;

public class BuildInSetConfig {
    public static BuildInSetFactory getFactory(String manufacturer){
        return switch (manufacturer.toUpperCase()) {
            case "ARCELIK" -> new ArcelikFactory();
            case "BEKO" -> new BekoFactory();
            case "SIEMENS" -> new SiemensFactory();
            default -> null;
        };
    }
}
