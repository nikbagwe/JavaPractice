package CWN.ExceptionHandling;

public class LearnTryCatch {

    public void div(int a, int b){
        try
        {
            int div = a / b;
        }catch(ArithmeticException e){
            System.out.println("this is Arth exception");
            e.printStackTrace();
        }
        m2();
    }

    public void m2()
    {
        div(20,0);
    }
}
