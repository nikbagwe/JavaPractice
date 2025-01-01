package CWN.Super;

public class TestEmp {
    public static void main(String[] args) {
        Employee emp = new Employee("nikhil");
        //this will call employee constructor with only name
        //check in employee class


        System.out.println(emp.name);
        System.out.println(emp.salary);
        System.out.println(emp.city);
    }
}
