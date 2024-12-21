import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        System.out.println("enter a marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        System.out.println("your marks are " +marks);
        String grade;
        if(marks > 90)
        {
           grade = "A";
            System.out.println("your grade is " +grade);
        } else if (marks >70) {
            grade = "B";
            System.out.println("your grade is " +grade);
        }else
        {
            System.out.println("you are failed");
        }
    }
}
