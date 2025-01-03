package CWN.ExceptionHandling;

public class BrowserTest {

    public static void main(String[] args) {

        String browser = "opera";

        if (browser.equals("Chrome"))
        {
            System.out.println("Open chrome");
        }

        else if (browser.equals("firefox"))
        {
            System.out.println("Open chrome");
        }

        else if (browser.equals("safari"))
        {
            System.out.println("Open chrome");
        }

        else // if browser not found then we can add our customized exception which is extending Run time
        //exception (RTE) predefined class in JAVA
        //to do this we have to create object using new keyword for MyException class
        //in real project we handle cutomize exception like this instead of writing try catch blocks
        // for cutom exception. Create a Saperate class extending RTE class and create constructor calling
        // parent class property
        {
                throw new MyException("Browser not found"); // this new will create object and while creating
                                                            // the object it will invoke constrctor which has
                                                            // super keyword refering parent class RTE
        }
    }
}
