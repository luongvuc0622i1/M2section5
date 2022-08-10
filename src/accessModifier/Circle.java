package accessModifier;

public class Circle {
    private double radius;
    private String color;

    private Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14*getRadius()*getRadius();
    }
}
