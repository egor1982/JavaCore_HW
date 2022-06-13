package lesson3;

public class Apple extends Fruit {

    public Apple(String name, double weight) {
        super(name, weight);
    }

    public String getName() {
        return "Яблоко";
    }

    @Override
    public double getWeight() {
        return 180;
    }
}
