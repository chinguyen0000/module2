package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of the second array");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element " + i + " of the first array");
            arr1[i] = sc.nextInt();
        }
        System.out.println("The first array is: "+ Arrays.toString(arr1));
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element " + i + " of the second array");
            arr2[i] = sc.nextInt();
        }
        System.out.println("The second array is: "+ Arrays.toString(arr2));
        int[] arr3 = new int[n1+n2];
        for (int i = 0; i < arr3.length; i++) {
            if (i < n1) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i-n1];
            }
        }
        System.out.println("Merged array is: "+ Arrays.toString(arr3));
    }
}
