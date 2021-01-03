package comon.thg.accelerator.week2_exercise.max_heap;

public class MaxHeap {

    public boolean isMaxHeap(int[] heap) {
        for (int i = heap.length - 1; i > 0; --i) {
            int parent = (i-1)/2;
            if (heap[i] > heap[parent]) {
                return false;
            }
        }
        return true;
    }
}
