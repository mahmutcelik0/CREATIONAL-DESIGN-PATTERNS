package ABSTRACTFACTORY.BuildInSet.factory;

import ABSTRACTFACTORY.BuildInSet.cooker.Cooker;
import ABSTRACTFACTORY.BuildInSet.cooker.SiemensCooker;
import ABSTRACTFACTORY.BuildInSet.oven.Oven;
import ABSTRACTFACTORY.BuildInSet.oven.SiemensOven;
import ABSTRACTFACTORY.BuildInSet.rangehood.RangeHood;
import ABSTRACTFACTORY.BuildInSet.rangehood.SiemensRangeHood;

public class SiemensFactory implements BuildInSetFactory{
    public SiemensFactory() {
        System.out.println("SIEMENS FACTORY IS WORKING");
    }

    @Override
    public Cooker getCooker() {
        return new SiemensCooker();
    }

    @Override
    public Oven getOven() {
        return new SiemensOven();
    }

    @Override
    public RangeHood getRangeHood() {
        return new SiemensRangeHood();
    }
}
