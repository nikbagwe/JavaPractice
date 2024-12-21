package CWN;

public class ConceptClass {

    //WAF to supply browser name -> String
    //Launch the browser
    // return true is browser is launched

    public boolean launchBrowser(String name){
        boolean flag = true;
        System.out.println("Browser name " +name);

        switch (name.toLowerCase().trim()){
            case "chrome":
                System.out.println("Launch Chrome");
                break;
            case "firefox":
                System.out.println("Launch firefox");
                break;
            case "safari":
                System.out.println("Launch safari");
                break;
            case "default":
                System.out.println("Pass the browser name correctly");
                flag = false;
                break;
        }
        return flag;
        }


    public static void main(String[] args) {

        ConceptClass c1 = new ConceptClass();
        boolean b1 = c1.launchBrowser("test");
        System.out.println(b1);
    }
}
