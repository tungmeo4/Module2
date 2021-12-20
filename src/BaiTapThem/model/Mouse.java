package BaiTapThem.model;

public class Mouse extends Animal implements Function {
    public Mouse(String name, int age, double weight) {
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Chít chít chít!!!!";
    }
}
