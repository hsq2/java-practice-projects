package comon.thg.accelerator.week2_exercise.max_heap;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MaxHeapTest {

    private final int[][] VALID_CASES = {
            {90, 15, 10, 7, 12, 2},
            {93, 15, 87, 7, 15, 5},
            {16, 14, 10, 8, 7, 9, 3, 2, 4, 1},
            {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
            {100, 19, 36, 17, 3, 25, 1, 2, 7},
            {5, 5, 5, 5, 5, 5, 5, 5}
    };

    private final int[][] INVALID_CASES = {
            {4, 5, 5, 5, 5, 5, 5, 5},
            {90, 15, 10, 7, 12, 11},
            {1, 2, 3, 4, 5},
            {4, 8, 15, 16, 23, 42},
            {2, 1, 3},
    };

    //revisit this test and structure
    // assertcases should be within the @test scope - utilise before each for parts of this?

    public void iterateOverCases(int[][] cases, MaxHeap maxHeap, String outputText) {
        for (int i = 0; i < cases.length; i++) {
            boolean isMaxHeap = maxHeap.isMaxHeap(cases[i]);
            String outputMessage = Arrays.toString(cases[i]) + outputText;

            if (cases == VALID_CASES) {
                assertTrue(isMaxHeap, outputMessage);
            } else {
                assertFalse(isMaxHeap, outputMessage);
            }
        }
    }

    @Test
    public void testValidMaxHeap() {
        MaxHeap maxHeap = new MaxHeap();
        iterateOverCases(VALID_CASES, maxHeap, " is not a max heap.");
        iterateOverCases(INVALID_CASES, maxHeap, " is a max heap.");
    }


//    @Test
//    public void testMaxHeap() {
//        MaxHeap maxHeap = new MaxHeap();
//        for (int i = 0; i < validCases.length; i++) {
//            assertTrue(maxHeap.isMaxHeap(validCases[i]), Arrays.toString(validCases[i]) + " should be a max heap");
//        }
//
//        for (int i = 0; i < invalidCases.length; i++) {
//            assertFalse(maxHeap.isMaxHeap(invalidCases[i]), Arrays.toString(invalidCases[i]) + " should not be a max heap");
//        }
//    }

}