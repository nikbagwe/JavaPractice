package CWN.StringConcept;

public class StringConcept {

    public static void main(String[] args) {

        //String literals
        String s = "Hello"; //s and S1 is stored in SCP and points to same object,as both has "Hello"
        String s1 = "Hello";
        String s2 = "hello";// it will create new String object as it has hello, JAVA is case-sensitive

      /*  String d= "122121";
        int a= 10;
        int b =20;
        System.out.println(s+d+a+b);*/

        //Strings are stored in SCP (String Constant pool) in the heap memory.
        //After JDK 1.7 , SCP is part of Heap memory only.
        //String S and S1 will point to same String oBject; it wont create new object in SCP, both has "Hello"
        //String Constant pool cant have duplicate valu

        //equals and == difference

        //String creation as an object
        String Str1 = new String("Hello"); //stored as a object
        System.out.println(Str1);
        System.out.println(s);
        System.out.println(Str1==s); //false
        System.out.println(Str1.equals(s)); //true

        //Below statement will again create another object though it has same data Hello as str1.
        //so it is always better to create Strings is by using String Literals for better memory management.

        String str2 = new String("Hello"); //stored as object

        String test = new String("Selenium"); // it will create object in heap memory

        test.intern(); //intern() will create same string object entry in String constant pool also
                       // but it will be no reference value in SCP

        String t1 = "Selenium"; //as we already have Selenium value in SCP,
                                // t1 will be used as reference value for Selenium in SCP
                                //as we cant have duplicate values in constant pool.


        /*
        Interview Question***

        String test = new String("Selenium");
        test.intern();
        String t1 = "Selenium";

        How many objects will be created in above 3 lines?

        In above 3 lines only 2 objects will be created , 1 in heap and 1 in SCP,
        second line will not have reference to object created it will just create object in SCP,
        so after 3rd line t1 will work as object reference variable for "Selenium" (object created in line 3)

        So overall only 2 objects are created in above code.
        */


    }
}
