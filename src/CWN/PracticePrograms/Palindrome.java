package CWN.PracticePrograms;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Kilogram";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
        if (str.equals(reverse)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}