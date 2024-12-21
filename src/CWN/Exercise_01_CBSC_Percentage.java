package CWN;

import java.util.Scanner;

public class Exercise_01_CBSC_Percentage {
    public static void main(String[] args) {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println("Thank you " + Name);
        System.out.println("Enter your marks for Marathi");
        int m1 = sc.nextInt();
        System.out.println("Enter your marks for Hindi");
        int m2 = sc.nextInt();
        System.out.println("Enter your marks for English");
        int m3 = sc.nextInt();
        System.out.println("Enter your marks for Science");
        int m4 = sc.nextInt();
        System.out.println("Enter your marks for Maths");
        int m5 = sc.nextInt();
        System.out.println("Thank you please wait for percentage");
        int sum = m1+m2+m3+m4+m5;
        System.out.println(sum);
        int total = 500;
        float percent;
        percent = (float) sum/total*100;
        System.out.println("hello " +Name+ " , your percentage for this year is " +percent);
    }
}