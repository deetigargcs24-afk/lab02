abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        double area = x * y;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * x * y;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        double area = 3.14 * x * x;
        System.out.println("Area of Circle: " + area);
    }
}

public class Demo {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(5, 8);
        Triangle t = new Triangle(6, 4);
        Circle c = new Circle(5);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
 