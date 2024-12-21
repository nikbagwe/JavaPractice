package CWN;

public class CWN_12_PS2_problem2 {
    public static void main(String[] args) {

        //encrypt the grade
        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //decrypt the grade
        grade = (char) (grade - 8);
        System.out.println(grade);


    }
}
