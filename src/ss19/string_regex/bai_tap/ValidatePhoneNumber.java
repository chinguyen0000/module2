package ss19.string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Valid phone number");

        } else {
            System.out.println("Invalid phone number");
        }
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
