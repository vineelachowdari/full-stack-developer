// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method to calculate area
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Interface representing a printable object
interface Printable {
    void print();
}

// Class implementing the Printable interface
class PrintableRectangle extends Rectangle implements Printable {
    // Constructor
    public PrintableRectangle(double length, double width) {
        super(length, width);
    }

    // Implementing the print method from the Printable interface
    @Override
    public void print() {
        System.out.println("Printing Rectangle...");
        System.out.println("Area: " + calculateArea());
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        // Displaying shape information
        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println();
        
        // Displaying shape information
        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println();
        
        // Using abstraction through interface
        PrintableRectangle printableRectangle = new PrintableRectangle(3, 7);
        printableRectangle.print();
    }
}