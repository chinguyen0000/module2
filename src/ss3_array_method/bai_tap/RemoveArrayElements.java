package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be removed");
        int ele = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println(ele + " is removed from array !\n" + Arrays.toString(arr));
    }
}
