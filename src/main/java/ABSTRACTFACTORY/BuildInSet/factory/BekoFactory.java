package ABSTRACTFACTORY.BuildInSet.factory;

import ABSTRACTFACTORY.BuildInSet.cooker.BekoCooker;
import ABSTRACTFACTORY.BuildInSet.cooker.Cooker;
import ABSTRACTFACTORY.BuildInSet.oven.BekoOven;
import ABSTRACTFACTORY.BuildInSet.oven.Oven;
import ABSTRACTFACTORY.BuildInSet.rangehood.BekoRangeHood;
import ABSTRACTFACTORY.BuildInSet.rangehood.RangeHood;

public class BekoFactory implements BuildInSetFactory{
    public BekoFactory() {
        System.out.println("BEKO FACTORY IS WORKING");
    }

    @Override
    public Cooker getCooker() {
        return new BekoCooker();
    }

    @Override
    public Oven getOven() {
        return new BekoOven();
    }

    @Override
    public RangeHood getRangeHood() {
        return new BekoRangeHood();
    }
}
