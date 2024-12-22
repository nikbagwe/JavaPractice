package CWN.StaticKeyword;

public class CarStaticPractice {
    String brand;
    int price;
     static final int wheels = 4;
    /*
    When we have the same property value for example wheels will be always be 4, so we can mark it is static
    Rule of Static -> It is not added in Java objects memory (heap memory) , it saves the memory as it wont be created with every object
    Static variables are added in CMA (common memory allocation -> metaspace)
    Static variables should be called by classname -> CarStaticPractice.wheels;
    Normal variables should be called by object reference -> c1.name;
    static is only for class variables , it cant be used for main function (local) variables.
     */

    public static void main(String[] args) {
        CarStaticPractice c1 = new CarStaticPractice();
        c1.brand = "BMW";
        c1.price = 200000;
        // c1.wheels = 4; this is not a valid way to call static variables
        // CarStaticPractice.wheels = 5; can not change the final variable it will throw error.
        System.out.println(CarStaticPractice.wheels);

        CarStaticPractice c2 = new CarStaticPractice();
        c2.brand = "BMW";
        c2.price = 200000;

        CarStaticPractice c3 = new CarStaticPractice();
        c3.brand = "BMW";
        c3.price = 200000;
    }
}
