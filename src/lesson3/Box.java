package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    public Object add;

    public Box() {
    }

    private List<T> list = new ArrayList<>();

    public void add(T fruit) {
        list.add(fruit);
    }

    public void moveFruitsFrom(Box<T> anotherBox) {
        for (T fruit : anotherBox.list) {
            list.add(fruit);
        }
        anotherBox.list.clear();
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    private double getWeight() {
        double sum = 0.0;
        for (T fruit : list) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void info() {
        if (list.size() < 1) {
            System.out.println("Коробка пуста.");
            return;
        }

        String name = list.get(0).getName();
        double weight = list.get(0).getWeight();
        double totalWeight = weight * list.size();

        System.out.println("Фрукты: " + name + ", количество коробок " + list.size() +
                "шт. Общий вес: " + totalWeight);
    }
}
