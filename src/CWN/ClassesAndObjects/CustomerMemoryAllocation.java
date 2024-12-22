package CWN.ClassesAndObjects;

public class CustomerMemoryAllocation {
    String name;
    int age;
    int id;
    char gender;
    String dob;
    boolean flag;

    public static void main(String[] args) {
        CustomerMemoryAllocation c1 = new CustomerMemoryAllocation();

        //java gives default values when variables are not initialized
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.gender);
        System.out.println(c1.flag);

        c1.name = "Nikhil";
        System.out.println(c1.name);


        /*memory allocation concepts
        Stack Memory -> Object reference variable is stroed in stack memory
        Heap Memory -> Objects (variables and methods) stroed in heap memory
        No reference object will stroed in heap memory -> new customer();
        Only reference variable added will be stored in stack memory -> Customer c4

         */
        //Null reference object concept

        CustomerMemoryAllocation c5 = new CustomerMemoryAllocation();
        c5 = null; //Null reference object
        /*
        Garbage collector

        ->Once the memory allocated to java is getting full JVM activates the GC
        ->GC will delete all the Null reference objects and No reference objects from heap memory.
        ->There is no guarantee that any of the above two methods will run Garbage Collector.
        ->The call System.gc() is effectively equivalent to the call : Runtime.getRuntime().gc()

         */

        //calling GC
        System.gc();

    }
}
