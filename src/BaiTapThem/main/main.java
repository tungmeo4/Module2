package BaiTapThem.main;

import BaiTapThem.Manage.AnimalManager;
import BaiTapThem.model.Animal;
import BaiTapThem.model.Cat;
import BaiTapThem.model.Dog;
import BaiTapThem.model.Mouse;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalManager animalManager = new AnimalManager();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm một con vật vào team");
            System.out.println("2. Xóa một con vật trong team");
            System.out.println("3. Sửa một con vật");
            System.out.println("4. Hiển thị thông tin một con vật theo tên");
            System.out.println("5. Hiện thị tất cả các con vật trong team");
            System.out.println("6. Trả về tất cả các con DOG trong tập hợp");
            System.out.println("7. Trả về tất cả các con vật trong khoảng cân nặng");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1. Team DOG");
                        System.out.println("2. Team CAT");
                        System.out.println("3. Team MOUSE");
                        System.out.println("Nhập lựa chọn: ");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                Dog dog = (Dog) animalManager.createAnimal(scanner,choice1);
                                animalManager.addAnimal(dog);
                                break;
                            case 2:
                                Cat cat = (Cat) animalManager.createAnimal(scanner,choice1);
                                animalManager.addAnimal(cat);
                                break;
                            case 3:
                                Mouse mouse = (Mouse) animalManager.createAnimal(scanner,choice1);
                                animalManager.addAnimal(mouse);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    System.out.println("Nhập tên con vật muốn bay màu: ");
                    String nameDelete = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(animalManager.delete(nameDelete));
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Bạn muốn tìm con pet nào: ");
                    String nameSearch = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(animalManager.searchByName(nameSearch));
                    break;
                case 5:
                    animalManager.display();
                    break;
                case 6:
                    break;
                case 7:
                    break;

            }
        } while (choice != 0);
    }
}
