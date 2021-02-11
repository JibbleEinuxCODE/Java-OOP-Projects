package SuperShop;

public class Employee extends Person {
    private int ID;
    private String DressCode;
    private String number;

    public Employee(int iD, String dressCode, String number) {
        ID = iD;
        DressCode = dressCode;
        this.number = number;
    }

    public Employee(String name, int age, String gender, int iD, String dressCode, String number) {
        super(name, age, gender);
        ID = iD;
        DressCode = dressCode;
        this.number = number;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getDressCode() {
        return DressCode;
    }

    public void setDressCode(String dressCode) {
        DressCode = dressCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("ID: " + ID);
        System.out.println("Number: " + number);
        System.out.println("DressCode: " + DressCode);
    }

}
