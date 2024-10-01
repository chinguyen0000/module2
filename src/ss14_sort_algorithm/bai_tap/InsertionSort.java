package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 5, 5, 1};
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}