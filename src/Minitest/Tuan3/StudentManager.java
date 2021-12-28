package Minitest.Tuan3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    Scanner scanner = new Scanner(System.in);

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
        System.out.println("Nhập điểm Toán: ");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        double physic = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa: ");
        double chemistry = scanner.nextDouble();
        double average = (math + physic + chemistry) / 3;
        return new Student(name, age, math, physic, chemistry, average);
    }

    public void add(Student student) {
        students.add(student);
    }

    public Student deleteById(int id) {
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

    public Student editStudent (int id) {
        Student student = null;
        for (Student std: students) {
            if (std.getId() == id) {
                student = std;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            scanner.nextLine();
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("Nhập tuổi: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Nhập điểm Toán: ");
            double math = scanner.nextDouble();
            student.setMath(math);
            System.out.println("Nhập điểm Lý: ");
            double physic = scanner.nextDouble();
            student.setPhysic(physic);
            System.out.println("Nhập điểm Hóa: ");
            double chemistry = scanner.nextDouble();
            student.setChemistry(chemistry);
            students.set(index,student);
        }
        return student;
    }

    public void sortByAveragePoint() {
        students.sort((o1, o2) -> {
            if(o1.getAveragePoint() < o2.getAveragePoint()) {
                return 1;
            } else if (o1.getAveragePoint() > o2.getAveragePoint()) {
                return -1;
            } else {
                return 0;
            }
        });
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
