import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println("You have entered "+n+ "Below is list of numbers" );

        int a = 0;
        int b = 1;
        int count = 2;

        while(count >=2)
        {
            int temp = b;
            b = a+b;
            temp = a;
            count++;
        }
        System.out.println(b);
    }
}
