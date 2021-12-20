package BaiTapThem.model;

public class Dog extends Animal implements Function{

    public Dog(String name, int age, double weight) {
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Gâu Gâu";
    }
}
