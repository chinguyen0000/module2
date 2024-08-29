package ss2_loop.bai_tap;


import java.util.Scanner;

public class DisplayPicture {
    public static void main(String[] args) {
        //hình 1




        //hình 4


        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (bottom-left, top-left");
            System.out.println("3. Print the isoscles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }

                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (int i = 4; i > 0; i--) {
                        for (int j = 0; j <= 6; j++) {
                            if (j >= i && j <= 6 - i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
        }

    }
}
