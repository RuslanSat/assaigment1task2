class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    public double salary;

    public Teacher(String name, int age, String subject, int yearsOfExperience, double salary) {
        super(name, age);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        salary += salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}
