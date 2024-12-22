package CWN.Encapsulation_getter_setter;

public class EmpTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();


        e1.setAge(20);
        int age = e1.getAge();
        System.out.println(age + " age");
        String s1 = e1.getCity();
        System.out.println(s1); // calling getcity before setting up the value it will give default value Null.

        //another way of accessing the variables is adding parameterized constructor so while adding
        //the variable values those can directly initialize private variables of the class i.e setting up the
        //values (setter)

        Employee e2 = new Employee("Nikhil", 30); // this will set the emp name and salary in private variables
        // using constructor we created in emp class.

        System.out.println(e2.getName());
        System.out.println(e2.getAge());



    }
}
