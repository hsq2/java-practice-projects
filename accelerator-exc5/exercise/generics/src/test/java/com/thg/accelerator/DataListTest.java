package com.thg.accelerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataListTest {

    DataList<Integer> dataList;

    @BeforeEach
    void setup() {
        dataList = new DataList();

    }

    @Test
    void add() {
        assertTrue(dataList.add(8));
        assertTrue(dataList.add(9));
        assertTrue(dataList.add(10));
        assertFalse(dataList.add(12));
    }

    @Test
    void size() {
        dataList.add(1);
        dataList.add(3);
        dataList.add(5);
        dataList.add(7);
        assertEquals(dataList.size(), 3);
    }

    @Test
    void get() {
        dataList.add(2);
        dataList.add(4);

        assertEquals(4, dataList.get(1));

        assertThrows(IndexOutOfBoundsException.class, () -> {dataList.get(4);
        }
        );

    }
}