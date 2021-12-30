package Minitest.Tuan4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void show() {
        if (students.isEmpty()) {
            System.out.println("Không có sinh viên nào tron danh sách!");
            return;
        }
        for (Student std : students) {
            System.out.println(std);
        }
    }

    public Student createStudent() {
        scanner.nextLine(); 
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm toán: ");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        double physic = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa: ");
        double chemistry = scanner.nextDouble();
        double averagePoint = scanner.nextDouble();
        return new Student(name, age, math, physic, chemistry, averagePoint);
    }

    public Student editStudent(int id) {
        Student editStudent = null;
        for (Student std : students) {
            if (std.getId() == id) {
                editStudent = std;
            }
        }

        if (editStudent != null) {
            int index = students.indexOf(editStudent);
            System.out.println("Nhập tên sinh viên: ");
            String name = scanner.nextLine();
            editStudent.setName(name);
            System.out.println("Nhập tuổi: ");
            int age = scanner.nextInt();
            editStudent.setAge(age);
            System.out.println("Nhập điểm toán: ");
            double math = scanner.nextDouble();
            editStudent.setMath(math);
            System.out.println("Nhập điểm Lý: ");
            double physic = scanner.nextDouble();
            editStudent.setPhysic(physic);
            System.out.println("Nhập điểm Hóa: ");
            double chemistry = scanner.nextDouble();
            editStudent.setChemistry(chemistry);
            double averagePoint = scanner.nextDouble();
            students.set(index, editStudent);
//            writeFile(students, PATH_NAME);
        } return editStudent;
    }

    public Student deleteStudent(int id) {
        Student deleteStudent = null;
        for (Student student : students) {
            if (student.getName().equals(id)) {
                deleteStudent = student;
            }
        }
        if (deleteStudent != null) {
            students.remove(deleteStudent);
//            writeFile(students, PATH_NAME);
            System.out.println("Xóa ID " + id + " thành công!");
        }
        return deleteStudent;
    }

    public ArrayList<Student> sortByAveragePointUp() {
        students.sort((o1, o2) -> Double.compare(o1.getAveragePoint(), o2.getAveragePoint()));
        return students;
    }

    public ArrayList<Student> sortByAveragePointDown() {
        students.sort((o1, o2) -> Double.compare(o2.getAveragePoint(), o1.getAveragePoint()));
        return students;
    }


    public void searchByHighestAvg() {
        double maxAvg = 0;
        for (Student std : students) {
            boolean compareMaxAvg = std.getAveragePoint() > maxAvg;
            if (compareMaxAvg) {
                maxAvg = std.getAveragePoint();
            }
        }
        System.out.println("Sinh viên có điểm cao nhất là: ");
        for (Student std1 : students) {
            if (std1.getAveragePoint() == maxAvg) {
                System.out.println(std1);
            }
        }
    }
}


