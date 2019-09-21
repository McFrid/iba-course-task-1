package by.iba;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void init() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sortEmptyArray() {
        try {
            bubbleSort.sort(new int[]{});
        }
        catch (Exception e) {
            assertThat(e, not(instanceOf(RuntimeException.class)));
        }
    }

    @Test
    public void sortNull() {
        try {
            bubbleSort.sort(null);
        }
        catch (Exception e) {
            assertThat(e, not(instanceOf(RuntimeException.class)));
        }
    }

    @Test
    public void sortReversedArray() {
        try {
            int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] actual = bubbleSort.sort(array);
            assertArrayEquals(expected, actual);
        }
        catch (Exception e) {
            fail("Method failed with exception");
        }
    }

    @Test
    public void sortRandomPositiveArray() {
        try {
            int[] array = { 5, 4, 1, 10, 6, 7, 0, 3, 5, 2 };
            int[] expected = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 10 };
            int[] actual = bubbleSort.sort(array);
            assertArrayEquals(expected, actual);
        }
        catch (Exception e) {
            fail("Method failed with exception");
        }
    }

    @Test
    public void sortRandomArray() {
        try {
            int[] array = { 6, 11, -5, 0, -1, 2, 12, 34, -50, 0 };
            int[] expected = { -50, -5, -1, 0, 0, 2, 6, 11, 12, 34 };
            int[] actual = bubbleSort.sort(array);
            assertArrayEquals(expected, actual);
        }
        catch (Exception e) {
            fail("Method failed with exception");
        }
    }
}
