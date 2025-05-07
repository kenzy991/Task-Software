public class Employee extends Person {
    private String employeeName;
    private String position;

    public Employee(String name, int age, String employeeName, String position) {
        super(name, age);
        this.employeeName = employeeName;
        this.position = position;
    }

    @Override
    public void work() {
        System.out.println(employeeName + " is working as a " + position + ".");
    }

    public void takeBreak() {
        System.out.println(employeeName + " is taking a break.");
    }
}

