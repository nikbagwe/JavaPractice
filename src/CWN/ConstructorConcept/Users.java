package CWN.ConstructorConcept;

public class Users {

    String firstName;
    String lastName;
    String emailID;
    String phone;
    String password;
    String city;

    //AC
    //1. User can only be created if you have firstName and Lastname
    //2. User can only be created if you have firstName, Lastname and Email
    //3. User can be created only have FN, LS ,Phone, Password
    //4. User can be created if all the fields are added.

    //1. User can only be created if you have firstName and Lastname

    //Creating constructor automatically => right click -> Generate -> Constructor -> Select the variables and create
    public Users(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //2. User can only be created if you have firstName, Lastname and Email

    public Users(String firstName, String lastName, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
    }
    //3. User can be created only have FN, LS ,Phone, Password

    public Users(String firstName, String lastName, String emailID, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.phone = phone;
    }


    //4. User can be created if all the fields are added.

    public Users(String firstName, String lastName, String emailID, String phone, String password, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.phone = phone;
        this.password = password;
        this.city = city;
    }

    public static void main(String[] args) {

        Users u1 = new Users("Nikhil", "Bagwe");
        System.out.println(u1.firstName);

        Users u2 = new Users("Nikhil", "Bagwe", "nikhil/@y.com","9870818883","nikhil123","Mumbai");
        System.out.println(u2.firstName + " "+ u2.lastName + " "+u2.emailID + "  " + u2.city);

        u2.emailID = "nik@yahoo.com";
        System.out.println(u2.emailID);
    }

}
