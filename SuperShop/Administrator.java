package SuperShop;

public class Administrator extends Manager {
    private double Salary;
    private String DayShift;
    private int WorkHour;

    public Administrator(int iD, String dressCode, String number, String department, String qualification,
            double salary, String dayShift, int workHour) {
        super(iD, dressCode, number, department, qualification);
        Salary = salary;
        DayShift = dayShift;
        WorkHour = workHour;
    }

    public Administrator(String name, int age, String gender, int iD, String dressCode, String number,
            String department, String qualification, double salary, String dayShift, int workHour) {
        super(name, age, gender, iD, dressCode, number, department, qualification);
        Salary = salary;
        DayShift = dayShift;
        WorkHour = workHour;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDayShift() {
        return DayShift;
    }

    public void setDayShift(String dayShift) {
        DayShift = dayShift;
    }

    public int getWorkHour() {
        return WorkHour;
    }

    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

    void displayAdministrator() {
        displayManager();
        System.out.println("Salary: " + Salary + "tk");
        System.out.println("Shift: " + DayShift);
        System.out.println("Work Hour: " + WorkHour + "h");
    }
}
