package CWN.Interface;

public class TestHospital {

    //Scenario->
    //grandparent Interface -> WHO (of US medical)
    //Parent Interface -> UK Medical,US Medical and Indian medical
    //Child Class is FortisHosptial


    public static void main(String[] args) {
        FortisHospital fh1 =new FortisHospital();
        fh1.IM1();
        fh1.UK1();
        fh1.US1();
        fh1.emergencyServies();
        fh1.WHOOne(); //grandparent interface methods
        //we can call all the methods from all the interfaces
        //we cant create object for Interface

        //topcasting -> Child class object can be referred by parent interface reference variable.

        UKMedical uk1= new FortisHospital();

        uk1.UK1(); // overridden from UK Medical
        uk1.emergencyServies(); // common methods
        //if we create the UK1 object for UK Hospital class we can only access methods in UK interface.
        //But if there are individual methods of UK Medical then we can access it here in topcasting

        //topcasting with grandparent WHO

        //Downcasting is not allowed in interfaces as we cant create objects for Interfaces



    }
}
