package comon.thg.accelerator.week2_exercise.student_repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


class StudentRepoTest {

    private final List<Student> studentList = new ArrayList<>();
    private final List<Student> orderedQueue = new ArrayList<>();
    StudentRepo studentRepo = new StudentRepo(studentList);

    @BeforeEach
    public void setup() {
        studentList.add(new Student("Haris", 1001, 4.3));
        studentList.add(new Student("Alpha", 1002, 4.5));
        studentList.add(new Student("Delta", 1003, 3.3));
        studentList.add(new Student("Bravo", 1004, 5.3));
        studentList.add(new Student("Charlie", 1006, 2.4));
    }

    public List<Student> loadPriorityQueue(PriorityQueue<Student> priorityQueue) {
        while (!priorityQueue.isEmpty()) {
            Student student = priorityQueue.poll();
            orderedQueue.add(student);
        }
        return orderedQueue;
    }

    @Test
    void getStudentNamePriorityQueue() {
        String expected = ("[{name=Alpha, id=1002, gpa=4.5}," +
                " {name=Bravo, id=1004, gpa=5.3}," +
                " {name=Charlie, id=1006, gpa=2.4}," +
                " {name=Delta, id=1003, gpa=3.3}," +
                " {name=Haris, id=1001, gpa=4.3}]");

        PriorityQueue<Student> studentNamePriorityQueue = studentRepo.getStudentNamePriorityQueue();
        assertEquals(expected, loadPriorityQueue(studentNamePriorityQueue).toString());
    }

    @Test
    void getStudentGPAPriorityQueue() {
        String expected = ("[{name=Bravo, id=1004, gpa=5.3}, " +
                "{name=Alpha, id=1002, gpa=4.5}, " +
                "{name=Haris, id=1001, gpa=4.3}, " +
                "{name=Delta, id=1003, gpa=3.3}, " +
                "{name=Charlie, id=1006, gpa=2.4}]");

        PriorityQueue<Student> studentGPAPriorityQueue = studentRepo.getStudentGPAPriorityQueue();
        assertEquals(expected, loadPriorityQueue(studentGPAPriorityQueue).toString());
    }
}