package ss2_loop.bai_tap;

public class Display20PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while (count < 20) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n);
                count++;
            }
            n++;
        }

    }
}
