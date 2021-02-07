package School_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher kabir = new Teacher(1, "Kabir", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher ratul = new Teacher(3, "Ratul", 800);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(kabir);
        teachersList.add(mellisa);
        teachersList.add(ratul);

        Student jahid = new Student(1, "Jahid", 4);
        Student likhon = new Student(2, "Likhon", 12);
        Student nirob = new Student(3, "Nirob", 5);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(jahid);
        studentsList.add(likhon);
        studentsList.add(nirob);

        School DIU = new School(teachersList, studentsList);

        jahid.payFees(5000);
        likhon.payFees(6000);
        System.out.println("DIU has Earned $" + DIU.getTotalMoneyEarned());

        System.out.println("---------Making DIU Pay Salary----------");
        kabir.receiveSalary(kabir.getSalary());
        System.out.println(
                "DIU has Spent for salary to " + kabir.getName() + " and now has $" + DIU.getTotalMoneyEarned());
    }
}
