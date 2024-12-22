package CWN.Methods;

public class StudentMethodsPractice {
    // WAF create a method -> get student marks
    //pass a parameter : studentName (string)
    //return the student marks -> int/byte

    public int getStudentMarks(String studentName){
        int marks=-1;
        if (studentName.equalsIgnoreCase("Naveen"))
        {
            marks = 90;
        } else if (studentName.equalsIgnoreCase("Nikhil")) {
            marks = 99;
        }else {
            System.out.println("Student Not found, please enter the correct name  : " +studentName);
        }
        return marks;
    }

    public static void main(String[] args) {

        StudentMethodsPractice student = new StudentMethodsPractice();
        int m1 = student.getStudentMarks("Nikhil");
        System.out.println(m1);
        int m2 = student.getStudentMarks("Nikhil");
        System.out.println(m2);
        int m3 = student.getStudentMarks("Naveen");
        System.out.println(m3);
        if(m1>=0)
        {
            System.out.println("print the marks");
        }
    }
}
