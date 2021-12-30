package Minitest.Tuan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        while (true) {
            choice = scanner.nextInt();
            System.out.println("1. Hiện toàn bộ sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên theo ID");
            System.out.println("4. Xóa sinh viên theo ID");
            System.out.println("5. Sắp xếp sinh viên theo danh sách điểm trung bình tăng dần");
            System.out.println("6. Sắp xếp sinh viên theo danh sách điểm trung bình giảm dần");
            System.out.println("7. Hiện sinh viên có điểm trung bình cao nhất");
            System.out.println("8. Ghi file CSV");
            System.out.println("9. Đọc file CSV");
            System.out.println("0. Exit");
            switch (choice) {
                case 1:
                    studentManager.show();
                    break;
                case 2:
                    studentManager.createStudent();
                    break;
                case 3:
                    System.out.println("Nhập ID: ");
                    scanner.nextLine();
                    int editID = scanner.nextInt();
                    System.out.println(studentManager.editStudent(editID));
                    break;
                case 4:
                    System.out.println("Nhập ID: ");
                    scanner.nextLine();
                    int deleteID = scanner.nextInt();
                    System.out.println(studentManager.deleteStudent(deleteID));
                    break;
                case 5:
                    studentManager.sortByAveragePointUp().forEach(System.out::println);
                    break;
                case 6:
                    studentManager.sortByAveragePointDown().forEach(System.out::println);
                    break;
                case 7:
                    studentManager.searchByHighestAvg();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
