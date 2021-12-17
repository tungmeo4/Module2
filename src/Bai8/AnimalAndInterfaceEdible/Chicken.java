package Bai8.AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        System.out.println("---------------");
        return "Chicken: chíp chíp";
    }

    @Override
    public String howToEat() {
        return "Cách ăn: Vị ngon trên từng ngón tay";
    }
}
