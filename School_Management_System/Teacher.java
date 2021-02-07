package School_Management_System;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new teacher object
     * 
     * @param id     teacher id: unique
     * @param name   teacher name
     * @param salary teacher salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    /**
     * return the id for current teacher
     * 
     * @return
     */
    public int getId() {
        return this.id;
    }

    /**
     * return name
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * return salary
     * 
     * @return
     */
    public int getSalary() {
        return this.salary;
    }

    // name and id could not be set

    /**
     * update the salary
     * 
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
