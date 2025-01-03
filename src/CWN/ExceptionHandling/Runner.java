package CWN.ExceptionHandling;

public class Runner {
    public static void main(String[] args)  {
/*
        LearnTryCatch obj = new LearnTryCatch();
        obj.div(9,0);
        System.out.println("Statement after exception");
*/

        ExceptionHandling e1 = new ExceptionHandling();

        //IMP****
        //just showing example when all the methods in exception handling class have throw the exception
        //then it is handled by main method, but it is not a good practice
        //main method is like user(runner class) who use the appilcation
        //m1 m3 m2 are like fetures of appln like search , add to cart and pay. So ideally exception should be
        //handled by the class which is having exception. in real we should not use throws keyword
        //Exceptions are always handled by try catch block. not the throws , it only passes the exception to next method.


        try{
            e1.m3(); // calling m3 from here
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Exception handled by main");

    }
}
