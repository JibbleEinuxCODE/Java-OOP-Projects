package SuperShop;

public class Manager extends Employee {
    private String Department;
    private String qualification;

    public Manager(int iD, String dressCode, String number, String department, String qualification) {
        super(iD, dressCode, number);
        Department = department;
        this.qualification = qualification;
    }

    public Manager(String name, int age, String gender, int iD, String dressCode, String number, String department,
            String qualification) {
        super(name, age, gender, iD, dressCode, number);
        Department = department;
        this.qualification = qualification;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + Department);
        System.out.println("Qualification : " + qualification);
    }

}
