package BaiThem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;

        while (true) {
            choice = scanner.nextInt();
            System.out.println("Menu chọn");
            System.out.println("1. Hiện thị toàn bộ sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Hiện thị toàn bộ sinh viên có điểm trung bình trên 7.5");
            System.out.println("6. Hiện thị toàn bộ sinh viên theo xếp loại");
            System.out.println("7. Ghi vào file CSV");
            System.out.println("0. Thoát");

            switch (choice) {
                case 1:
                    studentManager.show();
                    break;
                case 2:
                    Student student = studentManager.createStudent();
                    studentManager.addStudent(student);
                    break;
                case 3:
                    System.out.println("Nhập ID sinh viên muốn sửa: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.editStudent(idEdit));
                    break;
                case 4:
                    System.out.println("Nhập ID sinh viên cần xóa: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    Student student1 = studentManager.deleteStudent(idDelete);
                    if (student1 == null) {
                        System.out.println("Không có id tương ứng!!!");
                    } else {
                        System.out.println(student1);
                    }
                    break;
                case 5:
                    studentManager.searchByPoint();
                    break;
                case 6:
                    break;
                case 7:
                    studentManager.exportCsv();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
