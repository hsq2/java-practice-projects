package comon.thg.accelerator.week2_exercise;

import comon.thg.accelerator.week2_exercise.max_heap.MaxHeap;
import comon.thg.accelerator.week2_exercise.student_repository.Student;
import comon.thg.accelerator.week2_exercise.student_repository.StudentRepo;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
//        MaxHeap maxHeap = new MaxHeap();
//        int[] heap = {100, 15, 10, 7, 12, 2};
//        System.out.println(maxHeap.isMaxHeap(heap));

//        for (int i = heap.length - 1; i > 0; --i) {
//            System.out.println(heap[i]);
//            System.out.println("parent = " + (i - 1) / 2);
//        }

        //excercise 1 --> maxheap

        final int[] heap = {90, 15, 10, 7, 12, 2};

        MaxHeap maxHeap = new MaxHeap();

        System.out.println(maxHeap.isMaxHeap(heap));

//        final int[][] maxHeapTrue = {
//                {90, 15, 10, 7, 12, 2},
//                {93, 15, 87, 7, 15, 5},
//                {16, 14, 10, 8, 7, 9, 3, 2, 4, 1},
//                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
//                {100, 19, 36, 17, 3, 25, 1, 2, 7},
//                {5, 5, 5, 5, 5, 5, 5, 5}
//        };
//
//        for (int i = 0; i < maxHeapTrue.length; i++) {
//            System.out.println(Arrays.toString(maxHeapTrue[i]));
//        }


        //exercise 2
//Test case
//        List<Student> studentList = new ArrayList<>();
//
//        studentList.add(new Student("Haris", 1001, 4.3));
//        studentList.add(new Student("Alpha", 1002, 4.5));
//        studentList.add(new Student("Delta", 1003, 3.3));
//        studentList.add(new Student("Bravo", 1004, 5.3));
//        studentList.add(new Student("Charlie", 1006, 2.4));
//
//        StudentRepo studentRepo = new StudentRepo(studentList);
//        PriorityQueue<Student> studentNamePriorityQueue = studentRepo.getStudentNamePriorityQueue();
//        PriorityQueue<Student> studentGPAPriorityQueue = studentRepo.getStudentGPAPriorityQueue();
//        while (!studentNamePriorityQueue.isEmpty()) {
//            Student student = studentNamePriorityQueue.poll();
//            System.out.println(student.getName());
//
//            Student student1 = studentGPAPriorityQueue.poll();
//            System.out.println(student1.getGpa());
//        }
//    }
//}
    }
}