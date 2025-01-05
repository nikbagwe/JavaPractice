package CWN.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        //List(Interface) -> ArrayList (Child class of List interface)

      //topcasting
      List<String> broswerList = new ArrayList<String>();

      broswerList.add("chrome");
      broswerList.add("Firefox");

      System.out.println(broswerList.toString());

    }
}
