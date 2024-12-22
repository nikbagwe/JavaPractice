package CWN.Encapsulation_getter_setter;
/*
Encapsulation

'this' keyword can be used in methods as well.

-Encapsulation means accessing the private properties(variables) of class from another class using the getter and setter method
-Getter and setter are always public methods
-Instead of setter we can also initialize the private variable values using parameterized constructor but
 to update the values of private variables we would need setter method anyway.
-another way of accessing the variables is adding parameterized constructor so while adding
 the variable values those can directly initialize private variables of the class i.e. setting up the
 values (setter)
 */
public class Employee {

    private String name;
    private int salary;
    private int age;
    private String city;

    public  Employee(String name, int age){
    this.name = name;
    this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

