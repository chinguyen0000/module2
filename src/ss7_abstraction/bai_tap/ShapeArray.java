package ss7_abstraction.bai_tap;

import java.util.Random;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Circle(10, "Red", true);
        shapes[3] = new Rectangle(2, 3, "blue", false);
        shapes[4] = new Square(5, "green", true);

        for (int i = 0; i < 5; i++) {
            if (shapes[i] != null) {
                Random rand = new Random();
                int ranNum = rand.nextInt(100)+1;
                System.out.println(ranNum);

                if (shapes[i] instanceof Circle) {
                    System.out.println("Current area is " + ((Circle) shapes[i]).getArea());
                    ((Circle) shapes[i]).resize(ranNum);
                } else if (shapes[i] instanceof Square) {
                    System.out.println("Current area is " + ((Square) shapes[i]).getArea());
                    ((Square) shapes[i]).resize(ranNum);
                    Colorable colorable = (Square) shapes[i];
                    colorable.howToColor();
                }
                else {
                    System.out.println("Current area is " + ((Rectangle) shapes[i]).getArea());
                    ((Rectangle) shapes[i]).resize(ranNum);
                }

            }
        }

    }
}
