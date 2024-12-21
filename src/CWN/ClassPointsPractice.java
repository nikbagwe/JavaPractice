package CWN;

public class ClassPointsPractice {
    int id;
    String name;
    String city;

    public static void main(String[] args) {
        ClassPointsPractice c1 = new ClassPointsPractice();
        ClassPointsPractice c2 = new ClassPointsPractice();
        ClassPointsPractice c3 = new ClassPointsPractice();
        ClassPointsPractice c4 = new ClassPointsPractice();

        c1.city = "mumbai";
        c2.city = "Delhi";
        c3.city = "Pune";
        c4.city = "KKR";

        c1.name = "Sachin";
        c2.name = "Sehwag";
        c3.name = "Dhone";
        c4.name = "SRK";

        c1.id = 11;
        c2.id = 22;
        c3.id = 33;
        c4.id = 44;

        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);

        c1=c2;

        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);

        c2= c3;
        System.out.println("-----------------");
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);

        c3=c4;
        System.out.println("-----------------");
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);

        c4=c1;
        System.out.println("-----------------");
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(c4.name);

    }
}

