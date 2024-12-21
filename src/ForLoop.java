public class ForLoop {
    public static void main(String[] args)
    /*{
        for(int i= 1;i<=10;i++)
        {
            System.out.println("value of i is "+i);
        }
    }*/ {
        int[] numbers = {10, 20, 39};
/*
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("value of index " +i+ " is " +numbers[i]);
        }
*/

        for(int a: numbers)
            System.out.println(a);

    }



}