package codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        int length = 0;
        int count = 0;
        int[] rsl;
        char[] dataArray = data.toCharArray();
        for (char c : dataArray) {
            if (c == 'o') length++;
        }
        rsl = new int[length];
        for (char c : dataArray) {
            switch (c) {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    rsl[count] = value;
                    count++;
                default:
            }
        }
        return rsl;
    }
}