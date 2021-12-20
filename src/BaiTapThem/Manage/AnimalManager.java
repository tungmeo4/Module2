package BaiTapThem.Manage;

import BaiTapThem.model.Animal;
import BaiTapThem.model.Cat;
import BaiTapThem.model.Dog;
import BaiTapThem.model.Mouse;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManager {
    ArrayList<Animal> animals = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public Animal createAnimal(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập tên thành viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập trọng lượng: ");
        double weight = scanner.nextDouble();
        if (choice == 1) {
            return new Dog(name, age, weight);
        } else if (choice == 2) {
            return new Cat(name, age, weight);
        } else if (choice == 3) {
            return new Mouse(name, age, weight);
        }
        return null;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void display() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public Animal delete(String name) {
        Animal animal = null;
        for (Animal anm : animals) {
            if (anm.getName() == name) {
                animal = anm;
            }
        }
        animals.remove(animal);
        return animal;
    }

    public Animal searchByName(String name) {
        for (Animal animal1 : animals) {
            if (animal1.getName() == name) {
                return animal1;
            }
        }
        return null;
    }

    public Animal searchByTeam(String searchTeam) {
        boolean check = false;
        for (Animal animal2: animals) {
            if (animal2 instanceof Dog) {
                if (((Dog) animal2).)
            }
        }
    }

}
