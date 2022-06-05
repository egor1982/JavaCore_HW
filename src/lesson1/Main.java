package lesson1;

public class Main {
    public static void main(String[] args) {

        Shooter[] shooters = new Shooter[4];

        shooters[0] = new Shooter ("Цветков", 7);
        shooters[1] = new Shooter ("Бажин", 8);
        shooters[2] = new Shooter ("Бабиков", 10);
        shooters[3] = new Shooter ("Серохвостов", 6);
        System.out.println(shooters.toString());

        Team team = new Team("Биатлонисты", shooters);


        Course course = new Course(8);

        String result = course.doIt(team);
        System.out.println(result);

    }
}
