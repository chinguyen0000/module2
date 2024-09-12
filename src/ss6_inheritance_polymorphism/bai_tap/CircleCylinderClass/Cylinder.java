package ss6_inheritance_polymorphism.bai_tap.CircleCylinderClass;

public class Cylinder extends Circle {
    private float height;
    public Cylinder() {}
    public Cylinder(float radius, float height, String color) {
        super(radius, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    public String toString() {
        return super.toString() + " Cylinder[height=" + height + "]";
    }
}
