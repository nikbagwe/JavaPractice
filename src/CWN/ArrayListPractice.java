package CWN;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListPractice {
    public static void main(String[] args) {

        //array literals
        String a[] = {"google", "mozilla","Edge","Safari"};
        System.out.println(Arrays.toString(a));

        for(int i = 0; i<a.length;i++)
        {
            System.out.println("Item on " +i+ " is " +a[i]);
        }

        //foreach
        System.out.println("using for each loop ");
        for(String e:a) {
            System.out.println(e);
        }
        //normal Static array

        int b[] = new int[10];
        b[0] = 20;




        ArrayList ar = new ArrayList();

        ar.add(10);
        System.out.println(ar.get(0));
        ar.add(20);
        System.out.println(ar.get(1));

        ArrayList str = new ArrayList();
        str.add("Safari");
        str.add("Fireefoxx");

        //emp info list saving name, id, salary, location

        ArrayList<Object> empInfolist = new ArrayList<Object>(); //vc = 10 and pc = 0

        empInfolist.add(10071371);
        empInfolist.add("Nikhil Bagwe");
        empInfolist.add("1000000");
        empInfolist.add("Mumbai RCP");
        //vc = 6 pc =4

        System.out.println(empInfolist.size());

        for(Object emp: empInfolist )
        {
            System.out.println(emp);
        }
        System.out.println("---------------");
        System.out.println(empInfolist);

        empInfolist.remove(1);
        System.out.println(empInfolist);
        System.out.println("------------------");
        System.out.println(empInfolist.get(1));

        /* ArrayList internal Structure in JAVA */
        //vc = virtual capacity (by default it 10 when we declare arraylist)
        //pc = physical capacity (actual capacity of arraylist)
        //LF -> Load Factor , once PC is 10, java will allocate 5 more VC for arraylist
        //Calculation of LF -> pc/2
        //Example : vc 10 ; pc = 0
        // vc = 0 ; pc 10 (Array list is full now)
        //LF = 10/2  = 5
        //once that is also full i.e. PC = 15
        //LF = 15/2 = 7.5 = 7
        // now VC = 15+7 = 22 and pc = 15

        //code pushed
    }
}
