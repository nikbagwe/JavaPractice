package CWN.Super.SuperExample;

public class Car {
    int price;
    String name;

    int topSpeed = 100;

    public Car(int price, String name) {
        System.out.println(name + "   "+price);
        this.price = price;
        this.name = name;
    }

    public Car() {
        System.out.println("Car Constructor");
    }

    public void display(){
        System.out.println("Car Display");
    }
}
