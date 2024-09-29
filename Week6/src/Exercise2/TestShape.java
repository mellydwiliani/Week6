package Exercise2;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("blue", false);
        System.out.println(shape);
        
        Circle circle = new Circle(1.0);  
        System.out.println(circle);  
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(1.0, 1.0);
        System.out.println(rectangle);  
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());

        Square square = new Square(1.0);  
        System.out.println(square); 
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());
    }
}

