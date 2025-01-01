package CWN.Inheritance;

public class BMW extends Car {

    @Override
    public void start() {
        System.out.println("BMW Start");
    }

    public void autoparking() {
        System.out.println("BMW Autoparking");
    }

    //cant override or make individual mrthod 'service()' as it is declared as 'final' in Car parent class.
   /* public void service(){
        System.out.println("Car Service");
    }

    public final void service(){
        System.out.println("Car Service");*/
    //}


    //declared as static method in Car parent class so cant be overriden

//  public void methodOverriding(){
//
//    }

    //method hiding - > same static method as parent class
    public static void methodOverriding() {

    }


  private void pickColor(){
      System.out.println("BMW Pickcolor");
    }
}