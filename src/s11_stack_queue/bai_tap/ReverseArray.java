package s11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value at the " + i + " position");
            numbers[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        int[] reverseArray = new int[5];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = stack.pop();
        }

        System.out.println(Arrays.toString(reverseArray));
    }
}
