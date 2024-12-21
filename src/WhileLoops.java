import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i <= n)
        {
            System.out.println(i);
            i++;
        }
    }
}
