package CWN.Interface;


//interface
//No methods body can be added here , only method can be declared / no method prototype/ no business logic
//cant create object for interface.

//Class to Class -> Extends
//Interface to Interface -> Extends
//Class to Interface -> Implements

public interface USMedical extends WHO{

    //variables declared in interface are final and Static by default
    // It cant be changed as its a final
    // it can be access by interface name directly as they are static in nature

    int min_fee = 100; // it cant be changed


//abstract methods
    public void US1();
    public void US2();
    public void US3();

    public void emergencyServies(); //common methods in all the interfaces


    //After JDK 1.8 there are 2 changes added wrt to methods in Interfaces
    //1. we can have static methods with Body
    //this can be called by direct interfaceName.billing();
    public  static void billing(){
        System.out.println("US Medical Billing");
    }

    //2. We can have default methods with method body

    default void medicalReport(){
        System.out.println("US medical report");
    }
}
