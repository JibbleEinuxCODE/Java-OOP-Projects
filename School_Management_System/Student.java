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

    public void updateFeesPaid(int fees) {
        feesPaid = fees;
    }

}
