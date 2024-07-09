import java.util.Scanner;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1 = new Box(); // default constructor
        Box b2 = new Box(10.0); // constructor with one parameter
        Box b3 = new Box(10.0, 20.0, 30.0); // constructor with three parameters
        System.out.println("b1.volume() = "+b1.volume());
        System.out.println("b2.volume() = "+b2.volume());
        System.out.println("b3.volume() = "+b3.volume());
    }
}

class Box {
    double length;
    double breadth;
    double height;
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    Box() {
        System.out.print("Enter the dimensions: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        height = sc.nextDouble();
    }
    Box(double len) {
        length = breadth = height = len;
    }

    double volume() {
        return length * breadth * height;
    }
}
