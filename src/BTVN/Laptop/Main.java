package BTVN.Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaptopManager laptopManager = new LaptopManager();
        int choice;
        while (true) {
            System.out.println("Menu chọn");
            System.out.println("1. Hiển thị tất cả sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm trong khoảng giá");
            System.out.println("6. Tìm kiếm sản phẩm theo hãng");
            System.out.println("7. Tìm kiếm sản phẩm theo màu");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    laptopManager.show();
                    break;
                case 2:
                    Laptop laptop = laptopManager.createLaptop();
                    laptopManager.addLaptop(laptop);
                    break;
                case 3:
                    System.out.println("Nhập ID sản phẩm muốn sửa: ");
                    int editId = scanner.nextInt();
                    Laptop laptopEdit = laptopManager.editLaptop(editId);
                    System.out.println(laptopEdit);
                    break;
                case 4:
                    System.out.println("Nhập ID sản phẩm muốn xóa: ");
                    int deleteId = scanner.nextInt();
                    Laptop laptopDelete = laptopManager.deleteById(deleteId);
                    System.out.println(laptopDelete);
                    break;
                case 5:
                    System.out.println("Bạn muốn xem thông tin sản phẩm của hãng: ");
                    String brand = scanner.next();
                    ArrayList<Laptop> laptopBrand = laptopManager.searchByBrand(brand);
                    System.out.println("Hiển thị toàn bộ sản phẩm");
                    for (Laptop laptop1 : laptopBrand) {
                        System.out.println(laptop1);
                    }
                    break;
                case 6:
                    System.out.println("Nhập giá thấp nhất: ");
                    double priceDown = scanner.nextDouble();
                    System.out.println("Nhập giá cao nhất: ");
                    double priceUp = scanner.nextDouble();
                    ArrayList<Laptop> laptops = laptopManager.searchByRange(priceDown, priceUp);
                    System.out.println("Hiện thị toàn bộ sản phẩm trong khoảng giá: ");
                    for (Laptop lt : laptops) {
                        System.out.println(lt);
                    }
                    break;
                case 7:
                    System.out.println("Nhập màu sắc sản phẩm muốn tìm: ");
                    scanner.nextLine();
                    String color = scanner.next();
                    ArrayList<Laptop> laptopColor = laptopManager.searchByColor(color);
                    System.out.println("Hiển thị toàn bộ sản phẩm theo màu: ");
                    for (Laptop lt : laptopColor) {
                        System.out.println(lt);
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
