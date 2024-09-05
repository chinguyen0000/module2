package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrayElements {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of element you would like to add: ");
        int element = sc.nextInt();
        System.out.println("Enter the position of element you would like to add, start from 0: ");
        int position = sc.nextInt();
        if (position < 0 || position >= numbers.length) {
            System.out.println("Invalid position! Can't add an element into array!");
            System.exit(0);
        } else {
            int temp = numbers[position];
            for (int i = position + 1; i < numbers.length; i++) {
                int oldElement = temp;
                temp = numbers[i];
                numbers[i] = oldElement;
            }
            numbers[position] = element;
            System.out.println(Arrays.toString(numbers));
        }

    }
}
