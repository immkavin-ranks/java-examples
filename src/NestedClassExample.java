class Outer {
    int x = 100;

    void test() {
        Nest ob = new Nest();
        ob.display();
    }

    class Nest {
        void display() {
            System.out.println("x = " + x);
        }
    }
}

public class NestedClassExample {
    public static void main(String[] args) {
        Outer ob = new Outer();
        ob.test();
    }
}
