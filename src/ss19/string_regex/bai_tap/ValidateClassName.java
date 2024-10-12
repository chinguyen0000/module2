package ss19.string_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name: ");
        String className = sc.nextLine();
        if (isValidate(className)) {
            System.out.println("Valid class");

        } else {
            System.out.println("Invalid class");
        }
    }

    public static boolean isValidate(String classname) {
        String regex = "^[ACP][0-9]{4}[GHIK]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(classname);
        return matcher.matches();
    }
}
