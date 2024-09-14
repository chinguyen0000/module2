package ss7_abstraction.bai_tap;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;
    public Square() {}
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return 4 * side;
    }
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent) {
        double newArea = getArea() * percent/100;
        System.out.println("New area is " + newArea);
    }
    public void howToColor() {
        System.out.println("Color all 4 sides");
    }
}
