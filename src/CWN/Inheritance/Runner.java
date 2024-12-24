package CWN.Inheritance;

public class Runner {
    public static void main(String[] args) {
        BMW b1 = new BMW();
        b1.start();

        //top casting OR upcasting
        //reference type check
        Car c1 = new BMW();
        c1.autoparking(); // it is calling car class method though BMW has same method

        // I have added  autoparking() in car class as well for check else if its individual method of BMW
        //it cant be accessed by car class reference variable.

        /*-> Child class objects can be referred by parent(grand parent and great grand parentn level of parents class) class reference variable,
        this is called top casting or upcasting.
        TOP casting can only access Inherited and overriden method of reference type class.

        Example
        BWM (child) -> Car (parent)

        Car c1 = new BMW();

        Object is of BMW, so all the methods of BMW will be given to object
        So when we call any method for c1 refernce variables it will call methods inherited and overriden methods
        in BMW objects. It can not access BMW individual methods.

                Reason:
        Java does reference type check, whenever we are doing the typecasting, it checks if its overridden or inherited from
        reference class in this case CAR class if reference type (Car c1)

        so if only BMW has autoparking() method which is individual method then it can not be accessed by object created by
        Car c1 = new BMW();

        it will only allow to access methods inherited or overriden from Car class.*/

        //VERY IMP
        //DownCasting is not allowed in java
        //parent class object can be referred by child class reference variable

        // BMW b5 = new Car();    -> this line is giving error

        //BMW b5 = (BMW)new Car(); // No error on compile time but it will give run time classcast exception.




    }
}
