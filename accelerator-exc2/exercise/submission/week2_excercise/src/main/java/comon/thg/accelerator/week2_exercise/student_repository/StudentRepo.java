package comon.thg.accelerator.week2_exercise.student_repository;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class StudentRepo {

    private final List<Student> studentList;

    public StudentRepo(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public PriorityQueue<Student> getStudentNamePriorityQueue() {
        PriorityQueue<Student> pq = new PriorityQueue<>(sortName());
        return addToPriorityQueue(pq);
    }

    public PriorityQueue<Student> getStudentGPAPriorityQueue() {
        PriorityQueue<Student> pq = new PriorityQueue<>(sortGPA());
        return addToPriorityQueue(pq);
    }

    private Comparator<Student> sortName() {
        return Comparator.comparing(Student::getName);
    }

    private Comparator<Student> sortGPA() {
        return Comparator.comparing(Student::getGpa).reversed();
    }

    private PriorityQueue<Student> addToPriorityQueue(PriorityQueue<Student> pq) {
        pq.addAll(getStudentList());
        return pq;
    }
}
