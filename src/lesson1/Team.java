package lesson1;

public class Team {

    private String name;
    private Shooter[] shooters;

    public Team(String name, Shooter[] shooters) {
        this.name = name;
        this.shooters = shooters;
    }

    public String getName() {

        return name;
    }

    public Shooter[] getShooters() {
        return shooters;
    }
}

