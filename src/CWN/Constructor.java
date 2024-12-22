package CWN;

public class Constructor {

    String name;
    int age;
    int salary;
    public Constructor(int salary, int age, String name){
        System.out.println("constructor is called while creating object");

        //when we user this keyword this.age -> means class variable age , so it will assign the local age value to
        //class variable which was passed during creation of object
        // this.age -> here age is class variable age hence the local value of age will be assigned to class variable age.


        this.age = age;
        this.name = name;
        this.salary = salary;
    }



    public static void main(String[] args) {

        Constructor c1 = new Constructor(34,20,"Nikhil");

        //if you print the age name and salary now then it wil give u default values like 0 or null depending on datatype
        //Constructor c1 = new Constructor(34,20,"Nikhil"); -> it only gives these values to constructor while object creation
        //but unless we gave it class variables it wont be shown for  c1.age , c1.name ,c1.salary
        //to do this we need to add this keywords in constructor to assign these argument values to class variables

        System.out.println(c1.age);
        System.out.println(c1.name);
        System.out.println(c1.salary);

        //Now let's add this keyword in constructor and access these class variables in object and assign these constructor args
        // note: about sout statement will also print the correct values now as we have used this keyword.
        System.out.println("Printing values after using this keywords"); // note: about sout statement will also print the correct values now
        System.out.println(c1.age);
        System.out.println(c1.name);
        System.out.println(c1.salary);

    }
}
