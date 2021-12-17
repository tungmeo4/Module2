package minitest.main;

import BaiTapThem.Student;
import BaiTapThem.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("Menu chọn :");
        System.out.println("1. Hiển thị tất cả học viên ");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Tìm học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Sửa thông tin của học viên");
        System.out.println("6. Sắp xếp học viên theo điểm trung bình");
        System.out.println("7. Tổng điểm trung bình");
        System.out.println("0. Exit");
        System.out.println("Nhập lựa chọn: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentManager studentManager = new StudentManager(students);

        while (true) {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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
