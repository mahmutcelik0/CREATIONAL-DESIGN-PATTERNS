package ABSTRACTFACTORY.OperatingSystemExample;

import ABSTRACTFACTORY.OperatingSystemExample.factory.OperatingSystemFactory;
import java.util.*;

public class OperatingSystemMainClass {
    public static void main(String[] args) {
        //~~~~~~~~~~~~~~~~~~~~~~ OPERATING SYSTEM ABSTRACT FACTORY TEST ~~~~~~~~~~~~~~~~~~~~~~
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER VALUE: ");
            String userInput = input.next();

            OperatingSystemFactory factory = OperatingSystemCatalog.getFactory(userInput);
            assert factory != null;
            factory.getButton().press();
            factory.getCheckBox().click();

        }catch (NullPointerException | InputMismatchException e){
            System.out.println("ENTER MAC OR WINDOWS");
            e.printStackTrace();
            System.exit(0);

        }catch (Exception e){
            System.out.println("EXCEPTION THROWN");
            e.printStackTrace();
        }
    }
}
