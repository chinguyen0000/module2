package ss15_exception.bai_tap;


import java.util.Scanner;

public class IllegalTriangleException {
    private int a, b, c;

    public IllegalTriangleException(int a, int b, int c) throws IllegalArgumentException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Cạnh tam giác không được là số âm");
        } else if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalArgumentException("Các cạnh tam giác đã nhập không hợp lệ");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "IllegalTriangleException{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ 1 của tam giác: ");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh thứ 2 của tam giác: ");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh thứ 3 của tam giác: ");
        int c = sc.nextInt();
        try {
            IllegalTriangleException illegalTriangle = new IllegalTriangleException(a, b, c);
            System.out.println(illegalTriangle.toString());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
