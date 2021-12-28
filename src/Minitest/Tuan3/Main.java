package Minitest.Tuan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        while (true){
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.show();
                    break;
                case 2:
                    Student student = studentManager.createStudent();
                    studentManager.add(student);
                    break;
                case 3:
                    System.out.println("Nhập ID muốn bay màu: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    Student student1 = studentManager.deleteById(idDelete);
                    if (student1 == null) {
                        System.out.println("Không có id tương ứng!!!");
                    } else {
                        System.out.println(student1);
                    }
                    break;
                case 4:
                    System.out.println("Nhập ID muốn sửa: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.editStudent(idEdit));
                    break;
                case 5:
                    studentManager.sortByAveragePoint();
                    break;
                case 6:
                    studentManager.searchByHighestAvg();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Hiển thị toàn sinh viên");
        System.out.println("2. Thêm sinh viên");
        System.out.println("3. Xóa sinh viên theo ID");
        System.out.println("4. Sửa thông tin của sinh viên");
        System.out.println("5. Sắp xếp sinh viên theo điểm trung bình");
        System.out.println("6. Sinh viên có điểm cao nhất");
        System.out.println("0. Exit");
    }
}
