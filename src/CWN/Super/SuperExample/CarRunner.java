package CWN.Super.SuperExample;

public class CarRunner {

    public static void main(String[] args) {

        BMW b1 = new BMW();

        b1.speedCalc();

        int BMWTopspeed = b1.topSpeed;
        System.out.println(BMWTopspeed);
    }

}
