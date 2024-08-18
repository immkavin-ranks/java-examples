import java.util.Scanner;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1 = new Box(); // constructor with no parameters
        Box b2 = new Box(10.0); // constructor with one parameter
        Box b3 = new Box(10.0, 20.0, 30.0); // constructor with three parameters
        System.out.println("b1.volume() = "+b1.volume());
        System.out.println("b2.volume() = "+b2.volume());
        System.out.println("b3.volume() = "+b3.volume());
    }
}

class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        System.out.print("Enter the dimensions: ");
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        height = sc.nextDouble();
        depth = sc.nextDouble();
    }
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
