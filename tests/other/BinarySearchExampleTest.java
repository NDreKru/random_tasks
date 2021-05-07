package other;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchExampleTest {

    @Test
    public void whenFind564Then11() {
        int[] srcArray = {-7, 3, 43, 564, 4, 76, -2, -54, 2, 6, 89, 7};
        BinarySearchExample binarySearchExample = new BinarySearchExample();
        assertThat(binarySearchExample.binarySearch(srcArray, 564), is(11));
    }

    @Test
    public void whenFindNeg2Then2() {
        int[] srcArray = {-7, 3, 43, 564, 4, 76, -2, -54, 2, 6, 89, 7};
        BinarySearchExample binarySearchExample = new BinarySearchExample();
        assertThat(binarySearchExample.binarySearch(srcArray, -2), is(2));
    }

    @Test
    public void whenFindNeg54Then0() {
        int[] srcArray = {-7, 3, 43, 564, 4, 76, -2, -54, 2, 6, 89, 7};
        BinarySearchExample binarySearchExample = new BinarySearchExample();
        assertThat(binarySearchExample.binarySearch(srcArray, -2), is(2));
    }
}