package CWN.StringConcept;

public class StringBuilder { //****INTERVIEW QUESTION**//

    public static void main(String[] args) {

        String t1 = "        hello World     ";
        System.out.println(t1.trim());
        System.out.println(t1);
        // here in above example t1 create 1 entry in SCP
        //t1.trim() will create another entry without any refernce variable and perfrom trim operation
        //if we print t1 again it wil show existing value of t1 i.e. with spaces around hello world nt the trimmed version
        //this is why strings are called immutable

        //when we want to manipulate the same string we can use StringBuilder class

        //StringBuilder -> class
        //note: this cant create String literals, we have to create String as objects

        java.lang.StringBuilder sb1 = new java.lang.StringBuilder("this is java");
        System.out.println(sb1);

        sb1.append(20);
        System.out.println(sb1);
        //here as we are using stringbuilder object sb1, the existing data will be overriden, means it will
        //20 after sb1 string and store in sb1 only
        //previously when we were adding string as literals it was creating sapearate entry
        //for any operation performed on string

        //StringBuffer -> class
        //note: this cant create String literals
        //String buffer is threadsafe , mutiple threads cant access it at the same time. (Sharepoint or JIRA page) where check in facility is there
        //only single user can access and modify file at a time.it will be locked unless he/she checksout.
        //hence it is slow
    }
}
