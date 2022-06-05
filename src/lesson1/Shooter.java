package lesson1;

public class Shooter {

    private String name;
    private int achievment;

    public Shooter(String name, int achievment) {
        this.name = name;
        this.achievment = achievment;
    }
    public String getName() {
        return name;
    }

    public int getAchievment() {
        return achievment;
    }
    public String toString() {
        String Shooter;
        return "Спортсмен" + " " + getName();
    }
}
