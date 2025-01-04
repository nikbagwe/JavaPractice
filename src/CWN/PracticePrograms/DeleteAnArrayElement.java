package CWN.PracticePrograms;

import java.util.Arrays;

public class DeleteAnArrayElement {

    public static void main(String[] args) {

        int p[] = {1, 22, 43, 60, 65, 99};

        int q[] = new int[p.length - 1];

        int count = 0;

        //2023 doubt session 29 first question
        for (int e : p) {
            if (!(e == 22)) {
                q[count] = e;
                count++;
            }
        }
        System.out.println(Arrays.toString(q));
    }
}
