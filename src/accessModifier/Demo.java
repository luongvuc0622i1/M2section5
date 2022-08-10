package accessModifier;

public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "red");
        Circle circle2 = new Circle(3, "green");

        System.out.print("Hình tròn 1: ");
        System.out.print(circle1.getRadius() + " ");
        System.out.println(circle1.getArea());

        System.out.print("Hình tròn 2: ");
        System.out.print(circle2.getRadius() + " ");
        System.out.println(circle2.getArea());
    }
}
