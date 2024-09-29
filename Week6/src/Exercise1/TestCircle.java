package Exercise1;
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1: " + c1.toString());
        System.out.println("Area of c1: " + c1.getArea());

        Circle c2 = new Circle(2.5);
        System.out.println("c2: " + c2.toString());
        System.out.println("Area of c2: " + c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println("c3: " + c3.toString());
        System.out.println("Area of c3: " + c3.getArea());

        c3.setRadius(4.0);
        c3.setColor("green");
        System.out.println("c3: " + c3.toString());
    }
}