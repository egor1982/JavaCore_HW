package lesson1;

public class Course {

    String result;
    private int standard;

    public Course(int standard) {
        this.standard = standard;
    }

    public String doIt (Team team) {

        result = "Команда " + team.getName() + ": " + '\n';
        System.out.println(result);

        for (Shooter shooter : team.getShooters()) {
            System.out.println(shooter.toString());
        }
        System.out.println();
        for(Shooter shooter: team.getShooters()){

            result += "Фамилия спортсмена : " + shooter.getName() + " " + '\n';
            System.out.println(result);
            int value = shooter.getAchievment();
            testStandard(value);
        }
        return result;
    }

    private void testStandard(int value) {
        if (value>=standard) {
            result += "Спортсмен сдал норматив" + '\n';
            System.out.println(result);
        } if (value<standard) {
            System.out.println("Спортсмен не выбил минимум 8 мишеней с 10 попыток. Норматив не сдан.");
        }
    }
}


