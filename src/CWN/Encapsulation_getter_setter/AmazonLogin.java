package CWN.Encapsulation_getter_setter;

public class AmazonLogin {
    public static void main(String[] args) {

        //acts as Registration for new user
        LoginPage lp = new LoginPage("nikbagwe","nikhil@123");

        //Login
        lp.doLogin(lp.getUserName(), lp.getPassword());

        System.out.println("------------------------");

        //change or reset password and login
        lp.setPassword("Nikhil@567");
        lp.doLogin(lp.getUserName(), lp.getPassword());

        System.out.println("------------------------");

        //new user is trying to login , so we need to create another object
        LoginPage lp1 = new LoginPage("abhi123","abhi@000");
        lp1.doLogin(lp1.getUserName(), lp1.getPassword());


    }
}
