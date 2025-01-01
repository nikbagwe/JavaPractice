package CWN.Inheritance;

public  class Car {


    //Final keyword ->
    //1. Used to prevent inheritance - If we declare Car class as Final class, 'public  final class Car {}'
    // car cant be a parent class, BMW(child) class will throw an error.
    //2. To prevent method overriding -if a method is created with final keyword then it cant be overriden and we cant have same method
    // as individual method in child class - Example below service class below cant be overriden or use as individual method
    //in child class BMW.
    //3. Use for constant values in variables. "final int i =20;"



    //private, final and Static methods cant be overriden.

    public final void service(){
        System.out.println("Car Service");
    }

    public void color(){
        System.out.println("Car color");
    }

    public void engine(){
        System.out.println("Car Engine");
    }

    public void start(){
        System.out.println("Car Start");

    }


    public void autoparking()
    {
        System.out.println("Car Autoparking");
    }



    //Static method overriding is not allowed in JAVA.
    //static method overloading is allowed

    //static overloading
    public static void service(int i) {
    }

    //Static overriding , check in BMW Class  methodOverriding () cant be overidden
    public static void methodOverriding(){

    }

    //private method

    private void pickColor(){
        System.out.println("Car Pickcolor");

    }

}
