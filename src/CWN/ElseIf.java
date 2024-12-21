package CWN;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age > 56)
        {
            System.out.println("you are experienced");
        } else if (age > 46)
        {
            System.out.println("you are semi exp");
        } else if (age >30)
        {
            System.out.println("you are naive");
        }else
        {
            System.out.println("you are fresher");
        }
    }
}
