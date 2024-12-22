package CWN.Encapsulation_getter_setter;

import javax.swing.*;

public class LoginPage {

    //declaring private variables
    private String userName;
    private String password;


    //Adding the constructor


    public LoginPage(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    //creating the private method to check if user is active
    //we will access this private method from public method dologin

    private boolean isUserActive(String un)
    {
        System.out.println("Checking the user status " +un);
        return true;
    }
    //adding the login method

    public void doLogin(String un, String pwd) {
        System.out.println("Enter Username " + un);
        System.out.println("Enter Password " + pwd);
        System.out.println("Click on Login Button");

        if (isUserActive(un))
        {
            System.out.println("User is logged in");
        }
        else
        {
            System.out.println("User is inactive");
        }

    }

    //getter and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
