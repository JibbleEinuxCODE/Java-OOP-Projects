package SuperShop;

public class Worker extends Employee {
    private double Salary;
    private String DutyShift;
    private int WorkHour;

    public Worker(int iD, String dressCode, String number, double salary, String dutyShift, int workHour) {
        super(iD, dressCode, number);
        Salary = salary;
        DutyShift = dutyShift;
        WorkHour = workHour;
    }

    public Worker(String name, int age, String gender, int iD, String dressCode, String number, double salary,
            String dutyShift, int workHour) {
        super(name, age, gender, iD, dressCode, number);
        Salary = salary;
        DutyShift = dutyShift;
        WorkHour = workHour;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDutyShift() {
        return DutyShift;
    }

    public void setDutyShift(String dutyShift) {
        DutyShift = dutyShift;
    }

    public int getWorkHour() {
        return WorkHour;
    }

    public void setWorkHour(int workHour) {
        WorkHour = workHour;
    }

    void displayWorker() {
        displayEmployee();
        System.out.println("Salary: " + Salary + "tk");
        System.out.println("Shift: " + DutyShift);
        System.out.println("Work Hour: : " + WorkHour + "h");
    }

}
