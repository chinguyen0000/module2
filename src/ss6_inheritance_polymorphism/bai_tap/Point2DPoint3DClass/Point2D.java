package ss6_inheritance_polymorphism.bai_tap.Point2DPoint3DClass;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {}

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[] {x, y};
    }
    public String toString() {
        return "("+x+","+y+")";
    }
}
