package CWN.ExceptionHandling;

public class ThrowKeyword {

    //throw is used for customize exception

    public static void main(String[] args) {


        //this is custom exception usiung throw keyword and it must be done in try catch block
        try {
            throw new Exception("User not found exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //example 2 of customized exception
        String data = null;
        if (data == null) {
            try {
                throw new Exception("Data not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println(data.length()); // this is NPE not customized exception
        }
        catch(NullPointerException e){
            System.out.println("cannot calc length");
        }
        System.out.println("bye");
    }
}