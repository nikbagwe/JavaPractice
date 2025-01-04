package CWN.PracticePrograms;

public class CopyArrayElements {

    public static void main(String[] args) {


        int a[] = {1, 34, 56, 99, 33, 34};

        int b[] = new int[a.length];

        int count = 0;

        for (int e : a) {
            b[count] = e;
            count++;
        }

        for (int element:
             b) {
            System.out.println(element);

        }
    }
}
