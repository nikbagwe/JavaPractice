package CWN;

//example of method chaining

//Note: m1 m2 and m3 can be called directly as there are part of same object
public class StackOverflow {
    // below are the non-static methods which will be stored in Heap memory
    public void m1(){
        System.out.println("m1 method");
        m2();
        /*t1 is static method from StaticMethodsCalling.java file, so we are calling it via classname.method,
        these static methods will be stored in CMA (Common memory allocation) */

         // StaticMethodsCalling.t1();
    }
    public void m2(){
        System.out.println("m2 method");
        m3();
    }
    public void m3(){
        System.out.println("m3 method");
        m1();
    }

    //
    public static void main(String[] args) {

        StackOverflow s1 = new StackOverflow();
        s1.m1();
    }
}
