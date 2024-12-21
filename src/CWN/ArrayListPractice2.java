package CWN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(20);
        // we can define vc while initializing arraylist
        //vc = 20 ; pc = 0
        //vc = 0 ; pc = 20
        //LF = pc/2 =  10

        ArrayList<Integer> numlist = new ArrayList<Integer>();
        //vc = 10 pc =0
        numlist.add(100);
        numlist.add(400);
        numlist.add(300);
        numlist.add(255);

        //remove the list values

        System.out.println(numlist);
        System.out.println(numlist.size());
        numlist.remove(2);
        System.out.println(numlist);
        System.out.println(numlist.size());
        System.out.println(numlist.get(2));

        //
        numlist.add(2, 555);
        System.out.println(numlist);
        numlist.add(10000);
        System.out.println(numlist);

        //another way of creating list using asList method

        List<Integer> nums = Arrays.asList(100,888,444,20);
        System.out.println(nums);

        Collections.sort(nums); // we can use collection class for sorting arraylist
        System.out.println("Sorted list");
        System.out.println(nums);

        int a[] = new int[5];
        a[0] = 200;
        a[1] = 22;
        a[2] = 100;

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //collection ncopies to create same list elements multiple times
        ArrayList<String> myList  = new ArrayList<String>(Collections.nCopies(5,"iPhone"));
        System.out.println(myList.size());
        System.out.println(myList);

    }
}
