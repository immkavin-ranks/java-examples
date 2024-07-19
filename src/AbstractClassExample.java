public class AbstractClassExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

abstract class Shape {}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

