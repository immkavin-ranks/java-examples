import java.util.Arrays;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.length = 10;
        r1.height = 15;
        System.out.println("[l, h] = " + Arrays.toString(r1.getData()));
        System.out.println("Area = " + r1.getArea());

        Rect r2 = new Rect();
        r2.putData(20, 12);
        System.out.printf("[l, h] = [%d, %d]\n", r2.length, r2.height);
        System.out.println("Area = " + r2.getArea());
    }
}

class Rect {
    int length, height;

    public void putData(int l, int h) {
        length = l;
        height = h;
    }

    int getArea() {
        return length * height;
    }

    int[] getData() {
        return new int[] {length, height};
    }
}
