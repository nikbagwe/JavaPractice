package CWN.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    //checked exception means compile time exception where user will get the error during compilation
    //unchecked exception means Run time exception
    //https://i0.wp.com/www.benchresources.net/wp-content/uploads/2017/02/exception-hierarchy-in-java.png?ssl=1

    public static void main(String[] args) {

        /* IMP*******
        Original program w/o exception

        System.out.println("System A");
        Thread.sleep(5000);                 //with this line jvm will wait for 5 seconds before printing
                                            //next line. but it wont allow Thread.sleep(5000); unless we
                                            //surround it with the try catch block as if someone adds - value
                                            //in milliseconds it will have interrupted exception
                                            //Thread.sleep(-5000);  => It will throw exception so jvm blocks
                                            //at the compile time only knowing the exception.
                                            //This is called checked exception
        System.out.println("System B");


        */

        System.out.println("System A");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("System B");

        //Example 2

        try {
            FileInputStream f1 = new FileInputStream("c://files");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Will i be printed, Yessss, as we have handled the exceptions ");
        //but if the timeout value is negative then we won't go further in the program,
        //try running by making sleep value to -5000
    }

}

