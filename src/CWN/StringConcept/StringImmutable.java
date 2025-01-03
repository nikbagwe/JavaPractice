package CWN.StringConcept;

public class StringImmutable {
    //Immutable -> value of the strings cant be changed
    //example

    public static void main(String[] args) {


        String s = "Selenium";
        String t = "Java" + s;

        System.out.println(s);
        System.out.println(t); //JavaSelenium -> new entry will be created with t as reference.

        String st = "JAVA";
        System.out.println(st+"Python"); //JAVAPython
        System.out.println(st); //JAVA

        st = st + "Automation"; //it will create new object entry in SCP and delink st = JAVA and
                                // start pointing st to JAVAAutomation (newly created String object)
                                //so u cant change the value of existing object everytime even
                                // if u concatenate the existing string it will create new entry in SCP
                                // and if u assign it to new reference like we did here for st
                                // then it will delink the existing object reference value which was JAVA
                                //now in SCP "JAVA" will not have any reference and st will point to  "JAVAAutomation"
                                //hence string are immutable as it does not change the current value and creates new entry

        System.out.println(st); // JAVAAutomation


        // now in SCP JAVA do not have any reference but with the next line it wont create new value in SCP
        //JVM will look for same value in SCP if there is value "JAVA" then t2 will start pointing to JAVA

        String t2 = "JAVA";
    }
}
