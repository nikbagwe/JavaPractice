package CWN.StringConcept;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String s = "This is my java code";

        //String can be called arrays of character or grup of chars. so in indexOf method if we ask for T, it will print 0.
        //Another example is charAt methos calc starts from 0 index.

        //
        System.out.println(s.length());

        //
        System.out.println(s.charAt(13));

        //
        System.out.println(s.indexOf('t')); // it will print -1 if character or string is not found in the given string
        System.out.println(s.indexOf('T'));//0
        System.out.println(s.indexOf("java"));

        //
        String test = "    Hello World    ";
        System.out.println(test.trim()); //removes the space from corners, it wont remove space between Hello and World
        //to do that we can use replace

        System.out.println(test.replace(" ", "")); // it will remove the corner spaces + space between two words
        //make sure we are adding it in "" bcoz '' cant be blank it will give error.


        //
        String t = "This is my Java practice CODE";
        System.out.println(t.toLowerCase());
        System.out.println(t.toUpperCase());

        //
        String dob = "01-01-1989";
        System.out.println(dob);
        System.out.println(dob.replace('-', '/'));

        //compare

        String st1 = "Hello World";
        String st2 = "Hello World"; //it will only create one entry in SCP and will be referred by both st1 and st2

        System.out.println(st1 == st2); //true
        System.out.println(st1.equals(st2)); //true

        //RULE : it is always a good practice to use .equals methos for comparing string.
        //Because when one of the string is created by new keyword then this == will fail as it does  start giving you memory address of memory address


        //
        String Str1 = "Hello WORLD";
        String Str2 = "Hello World";

        System.out.println(Str1.equals(Str2)); //false
        System.out.println(Str1.equalsIgnoreCase(Str2)); //true


        //
        String browser = "chrom e ";

        if (browser.trim().equalsIgnoreCase("chrome")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }


        //
        String p = "This is selenium testing";
        System.out.println(p.contains("selenium")); //true
        System.out.println(p.contains("Selenium")); //false as java is case-sensitive


        //Split
        String lang = "JAVA_PYTHON_DOTNET_RUBY";
        String lang1[] = lang.split("_");


        for (int i = 0; i < lang1.length; i++) {
            System.out.println(lang1[i]);
        }

        //OR
        System.out.println(Arrays.toString(lang1));

        //interview Question

        String s3 = "xXThisxXisXXXXxXMyXxXDataXxX";

        String d[] = s3.split("xX");
        System.out.println(Arrays.toString(d));

        //d[0] = will have blank string

        //
        String empInfo = "Nikhil;Bagwe;35;Mumbai;QAEngineer";

        String e[] = empInfo.split(";");
        System.out.println(Arrays.toString(e));


        //Another way of doing it using for each loop
        String empInfo1 = "Nikhil|Bagwe|35|Mumbai|QAEngineer";

        String f[] = empInfo1.split("\\|"); // ****for some chars we need to use //
        for (String i : f) {
            System.out.println(i);
        }

        //
        String x = "100";
        System.out.println(x + 20); //it will concatenate as data types are different
        // so no arithmatic operation will be done

        //to overcome this use data conversions

        //String to int
        //Note: value of the string you are passing to parseInt method should be integer value strictly
        // otherwise we will get an error.

        int y = Integer.parseInt(x); //convert string into int value 100
        System.out.println(y); //
        System.out.println(y + 20);

        //String to double

        String x1 = "114.55";
        double d1 = Double.parseDouble(x1);
        System.out.println(d1);


        //int to String
        int k = 200;
        System.out.println(k + 20); // can do arithmatice operation
        String k1 = String.valueOf(k); // this will change k into String value
        System.out.println(k1);
        System.out.println(k1 + 20); //it will concatenate here as its a string now

        //String to Boolean

        String flag = "true"; //here true is a string value
        // if(flag) -> it is giving error as true is string here
        boolean b1 = Boolean.parseBoolean(flag); //it will convert flag into actual boolean value
        System.out.println(b1); //b1 is boolean true here after conversion
        if (b1) {
            System.out.println("its a boolean value");
        }
    }
}