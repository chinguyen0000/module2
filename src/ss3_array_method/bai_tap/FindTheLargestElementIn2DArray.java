package ss3_array_method.bai_tap;

import java.util.Scanner;

public class FindTheLargestElementIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 6}, {3, 5, 7}, {6, 8, 9}};
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("The largest number in the 2D array is " + max);
    }
}
