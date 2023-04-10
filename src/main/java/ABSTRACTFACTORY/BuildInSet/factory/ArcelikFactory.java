package ABSTRACTFACTORY.BuildInSet.factory;

import ABSTRACTFACTORY.BuildInSet.cooker.ArcelikCooker;
import ABSTRACTFACTORY.BuildInSet.cooker.Cooker;
import ABSTRACTFACTORY.BuildInSet.oven.ArcelikOven;
import ABSTRACTFACTORY.BuildInSet.oven.Oven;
import ABSTRACTFACTORY.BuildInSet.rangehood.ArcelikRangeHood;
import ABSTRACTFACTORY.BuildInSet.rangehood.RangeHood;

public class ArcelikFactory implements BuildInSetFactory{
    public ArcelikFactory() {
        System.out.println("ARCELIK FACTORY IS WORKING");
    }

    @Override
    public Cooker getCooker() {
        return new ArcelikCooker();
    }

    @Override
    public Oven getOven() {
        return new ArcelikOven();
    }

    @Override
    public RangeHood getRangeHood() {
        return new ArcelikRangeHood();
    }
}
