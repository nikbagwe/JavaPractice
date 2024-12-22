package CWN.Methods;

public class CallByValueCallByReference {

    String name;
    int age;
    public void add(int a, int b){
        System.out.println(a+b);
    }

    //Below is the call by reference -> reference here means object reference
    //we are calling Object c1 in main method by name c in getmethod
    // heap memory -> c1 and c is not pointing same objects now by reference.
    //Value assigned in getMethod will be assigned to object which is referenced by c1 and c.
    //    public void getMethod(CallByValueCallByReference c) -> 'CallByValueCallByReference' is the type of Object reference 'c'
    public void getMethod(CallByValueCallByReference c)
    {
        c.age =10;
        c.name="Nikhil";
        System.out.println("Printing values in referenced and assigned in c");
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {

        CallByValueCallByReference c1 = new CallByValueCallByReference();

        //call by value
        System.out.println("Call By Value");
        c1.add(20,30); //20 and 30 are arguments
        System.out.println("----------------");
        System.out.println("calling getMethod function Call by reference");

        c1.getMethod(c1); // this is call by reference
        
        System.out.println("----------------");
        System.out.println("Call by reference");
        System.out.println("Printing values in C1 object");
        System.out.println(c1.name);
        System.out.println(c1.age);
    }
}
