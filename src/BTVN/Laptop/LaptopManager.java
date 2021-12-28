package BTVN.Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager {
    private final ArrayList<Laptop> laptops;
    Scanner scanner = new Scanner(System.in);

    public LaptopManager() {
        this.laptops = new ArrayList<>();
    }

    public void show() {
        for (Laptop lt: laptops) {
            System.out.println(lt);
        }
    }

    public Laptop createLaptop() {
        System.out.println("Nhập hãng: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        return new Laptop(brand, color, price, quantity);
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public Laptop deleteById(int id) {
        Laptop laptop = null;
        for (Laptop lt : laptops) {
            if (lt.getId() == id) {
                laptop = lt;
            }
        }
        int index = laptops.indexOf(laptop);
        if (index != -1) {
            laptop = laptops.remove(index);
        }
        return laptop;
    }

    public Laptop editLaptop (int id) {
        Laptop laptop = null;
        for (Laptop lt : laptops) {
            if (lt.getId() == id) {
                laptop = lt;
            }
        }
        if (laptop != null) {
            int index = laptops.indexOf(laptop);
            scanner.nextLine();
            System.out.println("Nhập hãng mới: ");
            String brand = scanner.nextLine();
            laptop.setBrand(brand);
            System.out.println("Nhập màu sắc: ");
            String color = scanner.nextLine();
            laptop.setColor(color);
            System.out.println("Nhập giá tiền: ");
            double price = scanner.nextDouble();
            laptop.setPrice(price);
            System.out.println("Nhập số lượng: ");
            int quantity = scanner.nextInt();
            laptop.setQuantity(quantity);
            laptops.set(index, laptop);
        }
        return laptop;
    }

    public ArrayList<Laptop> searchByBrand(String brand) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop lt: laptops) {
            if (lt.getBrand().equals(brand)) {
                laptopArrayList.add(lt);
            }
        }
        return laptopArrayList;
    }

    public ArrayList<Laptop> searchByRange(double priceD, double priceU) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() >= priceD && laptop.getPrice() <= priceU) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }

    public ArrayList<Laptop> searchByColor (String color) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getColor().equals(color)) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }
}
