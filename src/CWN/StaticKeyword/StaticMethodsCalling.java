package CWN.StaticKeyword;

//1. Non-Static method -> Calling -> Non-Static method => No need to create Object as all the methods are in the same
// object

//2. Static method -> calling -> Static method => No need of object as both are in CMA they can directly call each other
// or by classname.

//3. Non-static method -> Calling -> Static method => No need of object , never use object while calling Static object.

//4. Static -> calling -> Non-Static => Need to create object

//Stack -> LIFO
//Queue -> FIFO
//Stack-> Out of memory -> Stack Overflow


public class StaticMethodsCalling {
    public  static void t1(){
        System.out.println("t1 method");

    }
    public  static void t2(){
        System.out.println("t2 method");
    }

    public  static void t3(){
        System.out.println("t3 method");
    }

    public static void main(String[] args) {

    }
}
