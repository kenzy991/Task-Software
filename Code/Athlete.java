public class Athlete extends Person {
    private String sport;
    private String team;

    public Athlete(String name, int age, String sport, String team) {
        super(name, age);
        this.sport = sport;
        this.team = team;
    }

    @Override
    public void work() {
        System.out.println(name + " is training in " + sport + " for team " + team + ".");
    }

    public void train() {
        System.out.println(name + " is training hard.");
    }
}
