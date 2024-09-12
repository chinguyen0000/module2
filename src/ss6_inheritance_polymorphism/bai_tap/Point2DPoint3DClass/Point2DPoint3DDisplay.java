package ss6_inheritance_polymorphism.bai_tap.Point2DPoint3DClass;

public class Point2DPoint3DDisplay {
    public static void main(String[] args) {
        Point2D point2d = new Point2D(1,2);
        System.out.println(point2d);
        Point3D point3d = new Point3D(1,2,3);
        System.out.println(point3d);
        point2d.setXY(10,20);
        System.out.println(point2d);
        point3d.setXYZ(10,20,30);
        System.out.println(point3d);

    }
}
