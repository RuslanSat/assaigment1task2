public class Main {
    public static void main(String[] args) {
        Student student = new Student("Harry Potter", 21);
        student.addGrade(78);
        student.addGrade(89);
        student.addGrade(99);
        student.addGrade(51);

        System.out.println(student);
        System.out.println("GPA: " + student.calculateGPA());

        Teacher teacher = new Teacher("Severus Snape", 51, "Math", 7, 800000);
        System.out.println(teacher);

        teacher.giveRaise(10);
        System.out.println("New Salary: " + teacher.salary);
    }
}