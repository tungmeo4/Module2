package BaiTapThem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager  {
    private Student[] students;
    static private int id = 6;
    static private int index = 5;

    public StudentManager(ArrayList<Student> students) {
    }

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(String name, int age, String address, String gender, double avg) {
        Student student = new Student(id,name,age,address,gender,avg);
        students[index] = student;
        index++;
        id++;
        System.out.println("Đã thêm sinh viên!!!!");
    }

    public void deleteStudent(String name) {
        int index = 0;
        for (Student std : students) {
            if (std != null && std.getGender().equals(name)) {
                students[index] = std;
                index--;
            }
        }
    }



}
