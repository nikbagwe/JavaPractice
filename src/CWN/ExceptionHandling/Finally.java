package CWN.ExceptionHandling;

public class Finally {
    //finally should be used with try catch block only
    //finally block will always be executed no matter if you get exception or not.

    public static int getMarks(String name) {

        if (name.equalsIgnoreCase("Suchi"))
        {
            try {
                int a = 10 / 3;
             //   System.exit(1); // this statement will shut down the JVM
                return 85;

            }catch(ArithmeticException e){
                System.out.println("AE is coming");
                e.printStackTrace();
                return 90;
            }
            finally{
                return 95;

                // finally will be executed if jvm gets exception or Not
                // so it will always print 95 only after replacing either 90(if there is exception)
                // or 85 (if no exception) but in the end it will always print 95 as its in finally
                //Interview ->
                //1.can we write finally without try and catch => No
                //2.can we write finally block above catch block=> No
                //3.can we write multiple catch blocks and then finally => yes , without finally also
                                                                        //we can write multiple catch blocks
                //4.is there any way when finally code wont be executed => usually no, but if we do "System.exit(1)"
                //5.it will stop the JVM and further code wont be exeucted.
                //6.can we write try without catch block -> yes , we can use finally block after try block, but
                // its not a good practice as we cant catch the exception.
                //7.can we write mutliple finally back to back -> No , but we can write multiple finally in the code
                // if we are using try-catch block again after previous finally
                //Finally Block real time usecase ->
                //https://www.geeksforgeeks.org/java-program-to-use-finally-block-for-catching-exceptions/
                //
            }
        } else {
            return 110;
        }
    }

    public static void main(String[] args) {

    int marks = Finally.getMarks("riya");
    System.out.println(marks);

    }

}
