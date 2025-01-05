package CWN.PracticePrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {


            int fact = 1;
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        System.out.println("input is " +u);

        if(u<10)
        {
            System.out.println("Enter number more than 10");
        }else
        {
            for (int i = 1; i <= u; i++)
            {
                fact = fact * i;

            }
                System.out.println(fact);
            }
        }
        }
