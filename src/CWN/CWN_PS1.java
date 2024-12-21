package CWN;

import java.util.Scanner;

public class CWN_PS1 {
    public static void main(String[] args) {

        //question 4
        float km;
        float miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter Kms ");
        km = sc.nextFloat();
        miles = (float) (km/1.609);
        System.out.println("Miles calculated is "+miles);
    }
}
