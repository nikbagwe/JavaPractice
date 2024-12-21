package CWN;

public class UserClass {
    String name; // do not assign value here otherwise all the object created will have default value given here
    //for example: String name = "Aparna" -> it will assign Aparna name to all the object created for this class.
    int Salary;

    public static void main(String[] args) {

        UserClass u1 = new UserClass();
        u1.name = "Riya";
        u1.Salary = 10000;

        UserClass u2 = new UserClass();
        u2.name = "Priya";
        u2.Salary = 30000;

        UserClass u3 = new UserClass();
        u3.name = "Jiya";
        u3.Salary = 20000;

        System.out.println(u1.name + " " + u1.Salary);
        System.out.println(u2.name + " " + u2.Salary);
        System.out.println(u3.name + " " + u3.Salary);

        //imp concept
        u1 = u2; //we can directly point the values of one object to another object
        System.out.println(u1.name + " " + u1.Salary);
        System.out.println(u2.name + " " + u2.Salary);
        System.out.println(u3.name + " " + u3.Salary);

    }
}
