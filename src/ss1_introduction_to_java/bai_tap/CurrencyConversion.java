package ss1_introduction_to_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền theo USD: ");
        Scanner sc = new Scanner(System.in);
        double usd = sc.nextDouble();
        double vnd = usd * 23000;
        System.out.println("Giá trị theo tiền VND: " + vnd);
    }
}
