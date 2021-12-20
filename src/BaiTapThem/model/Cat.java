package BaiTapThem.model;

public class Cat extends Animal implements Function{
    public Cat(String name, int age, double weight) {
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Where's my food, hooman?";
    }
}
