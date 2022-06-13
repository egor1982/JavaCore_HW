package lesson3;

public class Orange extends Fruit {

    public Orange(String name, double weight) {
        super(name, weight);

    }
    public String getName() {
        return "Апельсин";
    }

    @Override
    public double getWeight() {
        return 250;
    }
}
