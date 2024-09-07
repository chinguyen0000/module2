package ss4_oop.bai_tap;

import java.util.Scanner;

public class QuadraticEquationDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots "+equation.getRoot1()+" and "+equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root "+equation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
