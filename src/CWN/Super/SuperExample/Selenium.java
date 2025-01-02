package CWN.Super.SuperExample;

public class Selenium implements Google{

    @Override
    public void search() {
        System.out.println("Selenium Search");
        //super.   // not applicable as we dont have constrsuctor in interface
                   //also variables cant be accessed via super as they are static
        System.out.println(Google.RESULTS_COUNT); // we can directly access Interface variables we can
        // directly call by interface_name.variable_name
    }
}
