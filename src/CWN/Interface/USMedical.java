package CWN.Interface;


//interface
//No methods body can be added here , only method can be declared / no method prototype/ no business logic
//cant create object for interface.

//Class to Class -> Extends
//Interface to Interface -> Extends
//Class to Interface -> Implements

public interface USMedical extends WHO{
    public void US1();
    public void US2();
    public void US3();

    public void emergencyServies(); //common methods in all the interfaces

}
