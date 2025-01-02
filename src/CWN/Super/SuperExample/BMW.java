package CWN.Super.SuperExample;

public class BMW extends Car{

    int topSpeed = 200;

    public BMW() {
        //this();    // super and this cant be called together as both must be 1st statement of constructor
        super(33, "BMW X1" ); // super keyword will call constructor of parent class depending on
        // the parmeters passed in super () and this keyword is used for calling constructor of same class.


        //Super keyword can also call variables from parent class , here topSpeed is declared as 100. if we call
        //topspeed from CarRunner class it will fetch the value from parent class, provided there is no variable
        // with same name defined in child BMW class.
        //In our case I have added topspeed variable in both Car and BMW(cchild) class, so value of BMW will be
        // preferred value so output will give 200
        // u do not need to create object of car class to inherit the properties u can use super keyword


    }

    //super keyword use cases
    // 1. to call parent class constructor
    // 2. to call parent class properties (variables and methods)

    public  void speedCalc(){
        System.out.println("BMW topseepd"+ " " +topSpeed); // it will class topspeed of BMW
        int diffspeed = topSpeed - super.topSpeed; // super.topspeed will fetch value from parent car class
        System.out.println("Difference between cars" + "  " + diffspeed);
    }

    @Override
    public void display(){
        System.out.println("BMW Display");
        super.display(); // car class method which is overriden

        //note: if u r accessing methods or variables using super keywords then it need not to be on
        // first line like when we are calling parent constructor
    }


}
