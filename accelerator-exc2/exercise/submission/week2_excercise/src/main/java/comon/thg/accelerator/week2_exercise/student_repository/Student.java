package comon.thg.accelerator.week2_exercise.student_repository;

public class Student {
    private final String name;
    private final int id;
    private final double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "{name=" + name +
                ", id=" + id +
                ", gpa=" + gpa +
                "}";
    }
}
