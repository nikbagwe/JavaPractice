package CWN.PracticePrograms;

public class ReverseString {

    public static String reverse(String st){

        int len = st.length();

        String rev = "";
        for(int i = len-1; i>=0;i--){
            rev = rev + st.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {

        String str = "Selenium";
        String reverseString =reverse(str);
        System.out.println(reverseString);
    }
}

