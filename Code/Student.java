public class Student extends Person {
    private String schoolName;
    private int level;

    public Student(String name, int age, String schoolName, int level) {
        super(name, age);
        this.schoolName = schoolName;
        this.level = level;
    }

    public void study() {
        System.out.println(name + " is studying in level " + level + " at " + schoolName + ".");
    }

    @Override
    public void work() {
        System.out.println(name + " is working on school assignments.");
    }
}
