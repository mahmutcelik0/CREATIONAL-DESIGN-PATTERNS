package ABSTRACTFACTORY.BuildInSet;

import ABSTRACTFACTORY.BuildInSet.factory.BuildInSetFactory;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuildInSetMainClass {
    public static void main(String[] args) {
        //~~~~~~~~~~~~~~~~~~~~~~ BUILDINSET ABSTRACT FACTORY TEST ~~~~~~~~~~~~~~~~~~~~~~
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER VALUE: ");
            String userInput = input.next();

            BuildInSetFactory factory = BuildInSetConfig.getFactory(userInput);
            assert factory != null;
            factory.getCooker().openCooker();
            factory.getOven().openOven();
            factory.getRangeHood().openRangeHood();

        }catch (NullPointerException | InputMismatchException e){
            System.out.println("ENTER ARCELIK, BEKO OR SIEMENS");
            e.printStackTrace();
            System.exit(0);

        }catch (Exception e){
            System.out.println("EXCEPTION THROWN");
            e.printStackTrace();
        }
    }
}