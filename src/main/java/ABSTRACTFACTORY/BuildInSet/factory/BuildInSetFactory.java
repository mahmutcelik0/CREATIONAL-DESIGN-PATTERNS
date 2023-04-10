package ABSTRACTFACTORY.BuildInSet.factory;

import ABSTRACTFACTORY.BuildInSet.cooker.Cooker;
import ABSTRACTFACTORY.BuildInSet.oven.Oven;
import ABSTRACTFACTORY.BuildInSet.rangehood.RangeHood;

public interface BuildInSetFactory {
    Cooker getCooker();
    Oven getOven();
    RangeHood getRangeHood();
}
