package CWN;

public class EmpAssignmentStatic {
    String name;
    double salary;
    int id;
    static String company_name = "Jio";
    String company_address;
    String bloodgroup;
    public static void main(String[] args) {

        EmpAssignmentStatic emp1 = new EmpAssignmentStatic();
        EmpAssignmentStatic emp2 = new EmpAssignmentStatic();
        EmpAssignmentStatic emp3 = new EmpAssignmentStatic();

        System.out.println(emp1.bloodgroup);
        System.out.println(emp1.id);
        System.out.println(emp1.company_address);
        System.out.println(emp1.name);
        System.out.println(emp1.salary);
        emp1.bloodgroup = "O+ve";
        emp1.company_address = "Mumbai";
        emp1.id = 123433;
        emp1.name = "Nikhil";
        emp1.salary = 340000;

        System.out.println("---------------------------------------");
        System.out.println(emp1.bloodgroup);
        System.out.println(emp1.id);
        System.out.println(emp1.company_address);
        System.out.println(emp1.name);
        System.out.println(emp1.salary);
        System.out.println(EmpAssignmentStatic.company_name);

    }
}
