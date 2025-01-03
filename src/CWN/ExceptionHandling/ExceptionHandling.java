package CWN.ExceptionHandling;

public class ExceptionHandling {

    public  void  m1() throws Exception {
        System.out.println("m1");
        m2(); //calling m2
    }

    public  void  m2() throws Exception // program will throw exception at int z = 9/0
    {


        int z = 9/0;  // program won't run after this statement
        System.out.println(z); //wnt print
        System.out.println("m2"); //wont print
        m3();
    }

    public  void  m3() throws Exception {
        System.out.println("m3");
        m1(); //calling m1
    }
}
