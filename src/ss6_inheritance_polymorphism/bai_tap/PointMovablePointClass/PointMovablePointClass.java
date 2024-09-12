package ss6_inheritance_polymorphism.bai_tap.PointMovablePointClass;

public class PointMovablePointClass {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,1,5,5);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.setSpeed(10,15);
        System.out.println(movablePoint);
        MovablePoint checkMovablePoint = movablePoint.move();
        System.out.println(movablePoint);
        System.out.println(checkMovablePoint);

    }
}
