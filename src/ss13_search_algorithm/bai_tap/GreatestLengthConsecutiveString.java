package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class GreatestLengthConsecutiveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        LinkedList<Character> maxChar = new LinkedList<>();
        LinkedList<Character> listOfChar = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (listOfChar.size() > 1 && string.charAt(i) <= listOfChar.getLast() && listOfChar.contains(string.charAt(i))) {
                listOfChar.clear();
            }
            listOfChar.add(string.charAt(i));
            if (listOfChar.size() > maxChar.size()) {
                maxChar.clear();
                maxChar.addAll(listOfChar);
            }
        }
        for (Character c : maxChar) {
            System.out.print(c);
        }
    }
}

//O(2n)
