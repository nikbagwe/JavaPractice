package CWN.Methods;

public class MethodsInJava {
    /*
    Methods means functions
    methods -> class data members
     */

    //1. no input no return
    //return type is void here and not input anything in ();
    //void and return cant be together
    //return should be last statement and single function can have only one return.
    public void test(){
        System.out.println("This is test function");
    }

    //2. No input but some return
    //return type is int here
    public int totalAmount(){
        int i = 10;
        int tax = 5;
        int finalPayment = i+tax;
        System.out.println(finalPayment);
        return finalPayment;
        //return tax;
    }

    //3. Some input some return

    public int add (int x,int y) // int x and y are method parameters

            //interview -> Different between method params and arguments
            //-> method parameters are called while creating methods
            //-> arguments are called while calling the methods
    {
        System.out.println("Adding two numbers");
        int sum = x+y;
        return sum;
    }

    public static void main(String[] args) {

        //create object as test() is non static method so we have to create object to call test method

        MethodsInJava m1 = new MethodsInJava();
        // calling 1st function
        m1.test();

        // calling second function , do not directly call method in sout statement(bad practice)
        int value =m1.totalAmount();
        System.out.println("value is " +value);
        if(value>10){
            System.out.println("You are taxable");
        }else {
            System.out.println("you are not taxable");
        }

        //calling 3rd function
        int s1 = m1.add(10,20); // 10 and 20 are method arguments
        System.out.println(s1);

        int s2 = m1.add(20,88);
        System.out.println(s2-10);
    }
}
