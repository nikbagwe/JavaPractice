package CWN.Interface;

public class FortisHospital extends  Medical implements USMedical, UKMedical, IndianMedical{

    //fortis hospital is extending Medical  -> Medical is the Parent class of FortisHospital
    //fortis hopstial is implementing USMedical, UKMedical, IndianMedical  -> fortis is child of USMedical, UKMedical, IndianMedical
    // class can have multiple interfaces bt can have only one parent class


    @Override
    public void IM1() {
        System.out.println("Indian Medical one");

    }

    @Override
    public void IM2() {
        System.out.println("Indian Medical two");
    }

    @Override
    public void IM3() {
        System.out.println("Indian Medical three");
    }

    @Override
    public void UK1() {
        System.out.println("UK Medical one ");

    }

    @Override
    public void UK2() {
        System.out.println("UK Medical two ");

    }

    @Override
    public void UK3() {
        System.out.println("UK Medical three ");

    }

    @Override
    public void US1() {
        System.out.println("US Medical one");

    }

    @Override
    public void US2() {
        System.out.println("US Medical two");

    }

    @Override
    public void US3() {
        System.out.println("US Medical three");

    }

    @Override // common methods across all the interfaces so need to be defined only once in class
    public void emergencyServies() {
        System.out.println("Emergency");

    }

    @Override // overriden from grandparent interface
    public void WHOOne() {
        System.out.println("WHO ONE");

    }
}
