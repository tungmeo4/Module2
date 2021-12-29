package BaiThem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void show() {
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
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        double avg = scanner.nextDouble();
        return new Student(name, age, gender, address, avg);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student editStudent(int id) {
        Student student = null;
        for (Student std : students) {
            if (std.getId() == id) {
                student = std;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            scanner.nextLine();
            System.out.println("Nhập lại tên sinh viên: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("Nhập lại tuổi: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Nhập lại giới tính: ");
            String gender = scanner.nextLine();
            student.setGender(gender);
            System.out.println("Nhập lại địa chỉ: ");
            String address = scanner.nextLine();
            student.setAddress(address);
            System.out.println("Nhập lại điểm trung bình");
            double avg = scanner.nextDouble();
            student.setAvg(avg);
            students.set(index, student);
        }
        return student;
    }

    public Student deleteStudent(int id) {
        Student student = null;
        for (Student std : students) {
            if (std.getId() == id) {
                student = std;
            }
        }
        int index = students.indexOf(student);
        if (index != -1) {
            student = students.remove(index);
        }
        return student;
    }

    public void searchByPoint() {
        double avgPoint = 0;
        for (Student std : students) {
            boolean compareMaxAvg = std.getAvg() > 7.5;
            if (compareMaxAvg) {
                avgPoint = std.getAvg();
            }
        }
        System.out.println("Những sinh viên có điểm trung bình trên 7.5 là: ");
        for (Student std1 : students) {
            if (std1.getAvg() == avgPoint) {
                System.out.println(std1);
            }
        }
    }

    public void exportCsv() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("D:\\HocLaiModule2\\Module2\\src\\BaiThem", new Date().getTime()))); {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Tên");
                stringBuilder.append("Tuổi");
                stringBuilder.append("Giới tính");
                stringBuilder.append("Địa chỉ");
                stringBuilder.append("Điểm trung bình");
                stringBuilder.append("\n");

                if (students.size() > 0) {
                    for (Student std : students) {
                        stringBuilder.append(std.getName());
                        stringBuilder.append(",");
                        stringBuilder.append(std.getAge());
                        stringBuilder.append(",");
                        stringBuilder.append(std.getGender());
                        stringBuilder.append(",");
                        stringBuilder.append(std.getAddress());
                        stringBuilder.append(",");
                        stringBuilder.append(std.getAvg());
                        stringBuilder.append(",");
                    }
                }
                bufferedWriter.write(stringBuilder.toString());
                System.out.println("Ghi thành công");
        }
    } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
