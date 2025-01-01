package CWN.Super;

public class Employee {
    String name;
    int salary;
    String city;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, int salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public Employee() {
        System.out.println("I am Default constructor");
    }

    public Employee(String name) { //1. call from main will pass Nikhil here

        //we can call another constructor by using this(Arguments) , depending on the arguments it wil call
        //another constructor
        // Note: if we calling another constructor from constructor then "this(Arguments)" should be first line
        //before we are using this.name and so on. you can call constructor after these assignments.

        //1st line constructor calling to another constructor
        this("Naveen", 50, "Mumbai"); // 2. it wil call public
        // 2.1> Employee(String name, int salary, String city) constructor and assigned to class variables


        //this(); // it will call default constructor and print statement in it.
        //  marking this(); as commented as only one constructor can be called at a time.

        this.name = name; // 3. it will take nikhil here as we passed nikhil in step 1
        this.salary = 40; // this will replace 50 assigned in step 2.1
        this.city = "Pune"; // this will replace Mumbai in 2.1
        //so if we print the object values now then it will print values in step 3 i.e. Nikhil , 40 , Pune

    }
}
