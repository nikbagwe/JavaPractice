package CWN;

public class Employee {
   //class/global variables
    String name;
    String city;
    int id;
    float salary;

    public static void main(String[] args) {
        String name = "Naveen"; //local variables
        System.out.println(name); // it will print the local variable as first preference is given to local variables

        //Object 1
        Employee emp1 = new Employee();
        // new Employee(); is the object
        // emp1 is name of the object - Object reference variable
        //this statement create copy of all the variables and methods in class body
        // for example name, city , id salary and method if any created
        //once the object is created u can use object reference variable to access the object and use its variables and methods from main method


        emp1.name = "Nikhil Bagwe";
        emp1.id= 10071371;
        emp1.salary = 40f;
        emp1.city = "Mumbai";

        System.out.println(emp1.name + "  " + emp1.city);

        //Object 2
        Employee emp2 = new Employee();
        emp2.name = "Aparna";
        System.out.println(emp1.name + "   " + emp2.name);

        //3rd Object
        new Employee().name = "Peter"; // not adding Object reference variable but object is created
        //4th Object
        new Employee().city = "Mumbai";

        //Good practice is to not create object without reference variables , these are called no reference objects.
        //these objects will be deleted by garbage collector.


    }

}
