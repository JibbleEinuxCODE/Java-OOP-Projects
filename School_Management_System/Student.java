package School_Management_System;

/**
 * this class created by jahid hasan this class keeping the track of students
 * fees, name,grade & fees paid or not
 */

public class Student {

    private int id;
    private String name;
    private int grade;

    private int feesPaid;
    private int feesTotal;

    /**
     * To Create a new Student by initializing. Fees for every student $30,000 per
     * year. Fees paid initally is 0.
     * 
     * @param id    id for the student : unique.
     * @param name  name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {

        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter students name,id.

    /**
     * Used to update the student's grade.
     * 
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * 
     * Add the fees to the fees paid. this school is going to recive the funds.
     * 
     * @param fees
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    // public void setId(int id) {
    // this.id = id;
    // }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    // public void setFeesPaid(int feesPaid) {
    // this.feesPaid = feesPaid;
    // }

    public int getFeesTotal() {
        return feesTotal;
    }

    // public void setFeesTotal(int feesTotal) {
    // this.feesTotal = feesTotal;
    // }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}
