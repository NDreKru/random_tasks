package other;

import java.util.Arrays;

public class BinarySearchExample {
    /**
     * @param srcArray source unsorted array
     * @param element  element to find
     * @return index of find element
     */
    public int binarySearch(int[] srcArray, int element) {
        Arrays.sort(srcArray);
        int start = srcArray.length / 2;
        int end = srcArray.length;
        int rslIndex;
        while (true) {
            if (element > srcArray[start]) {
                start = start + (end - start) / 2;
            } else {
                end = start;
                start /= 2;
            }
            if (element == srcArray[start]) {
                rslIndex = start;
                break;
            }
        }
        return rslIndex;
    }
}