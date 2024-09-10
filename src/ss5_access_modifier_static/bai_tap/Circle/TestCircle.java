package ss5_access_modifier_static.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("radius: " + circle.getRadius() + " Area: " + circle.getArea());
    }
}
