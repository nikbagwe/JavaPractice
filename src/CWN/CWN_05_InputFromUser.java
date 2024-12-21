package CWN;

import javax.script.ScriptEngine;
import java.util.Scanner;

public class CWN_05_InputFromUser {
    public static void main(String[] args) {
        System.out.println("Welcome Back Nikhil");
        Scanner sc = new Scanner(System.in);
        // sytem.in means taking input from keyboard
        // Scanner sc => reference to the object created on the right i.e. new Scanner();

        System.out.println("please enter number 1 ");
        int num1 = sc.nextInt();
        //taking input for number 1 - > sc.nextInt() => object reference created
        //for scanner class which is using methods available in scanner class i.e. nextInt()

        System.out.println("please enter number 2 ");
        int num2 = sc.nextInt();
        int sum;
        sum = num1 + num2;
        System.out.println("Sum is " +sum);
    }
}
