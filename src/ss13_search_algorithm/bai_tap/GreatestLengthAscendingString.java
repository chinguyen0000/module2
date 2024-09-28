package ss13_search_algorithm.bai_tap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GreatestLengthAscendingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            LinkedList<Character> checkChar = new LinkedList<>();
            checkChar.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j) >= checkChar.getLast()) {
                    checkChar.add(s.charAt(j));
                }
            }
            if (checkChar.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(checkChar);
            }
            checkChar.clear();
        }
        for (Character c : maxString) {
            System.out.print(c);
        }
    }
}

//O(n^2)
