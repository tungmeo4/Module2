package BaiTapThem;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("------------------------------Menu--------------------------");
        System.out.println("---1. Hiển thị tất cả sinh viên");
        System.out.println("---2. Thêm sinh viên");
        System.out.println("---3. Hiển thị sinh viên có điểm cao nhất");
        System.out.println("---4. Tìm kiếm sinh viên theo tên");
        System.out.println("---5. Hiển thị tất cả sinh viên theo giới tính");
        System.out.println("---6. Xóa một sinh viên theo tên");
        System.out.println("---7. Sắp xếp điểm trung bình theo thứ tự tăng dần");
        System.out.println("---0. Exit");
        System.out.println("-------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        students[0] = new Student(1,"Số 1", 20, "Nam", "Hà Nội", 7.9);
        students[1] = new Student(2,"Số 2", 21, "Nữ", "Hà Lội", 9.7);
        students[2] = new Student(3,"Số 3", 22, "Nam", "Hà Nam", 7.8);
        students[3] = new Student(4,"Số 4", 19, "Nữ", "Hà Tĩnh", 8.7);
        students[4] = new Student(5,"Số 5", 18, "Nam", "Hà Động", 7.7);

        StudentManager studentManager = new StudentManager(students);
        while (true) {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sinh viên hiện tại:");
                    for (Student std: students) {
                        boolean compareNull = std != null;
                        if (compareNull)
                        System.out.println(std);
                    }
                    break;
                case 2:
                    System.out.println("Nhập tên sinh viên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giới tính");
                    String gender = scanner.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    System.out.println("Nhập điểm trung bình");
                    double avg = Double.parseDouble(scanner.nextLine());
                    studentManager.addStudent(name,age,gender,address,avg);
                    break;
                case 3:
                    double maxAvg = students[0].getAvg();
                    for (Student student : students) {
                        boolean compareAvg = student.getAvg() > maxAvg;
                        if (compareAvg) {
                            maxAvg = student.getAvg();
                        }
                    }
                    System.out.println("Sinh viên có điểm trung bình cao nhất là: ");
                    for (Student std : students) {
                        if (std.getAvg() == maxAvg){
                            System.out.println(std);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên sinh viên cần tìm: ");
                    String names = scanner.nextLine();
                    int check = -1;
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getName().equals(names)) {
                            check = i;
                        }
                        if (check < 0) {
                            System.out.println("Không tìm thấy tên sinh viên");
                        } else {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("1. Các sinh viên nam");
                    System.out.println("2. Các sinh viên nữ");
                    scanner.nextLine();
                    int choice1 = 0;
                    switch (choice1) {
                        case 1:
                            for (Student std : students) {
                                    if (std != null && std.getGender().equals("Nam")) {
                                        System.out.println(std);
                                    }
                            }
                            break;
                        case 2:
                            for (Student std : students) {
                                if (std != null && std.getGender().equals("Nữ")) {
                                    System.out.println(std);
                                }
                            }
                            break;
                    }
                    break;
                case 6:

                    break;
                case 7:
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
