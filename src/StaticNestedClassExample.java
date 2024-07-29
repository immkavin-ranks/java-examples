class OuterClass {

    static class nest {
        int y = 5;
    }
}

public class StaticNestedClassExample {
    public static void main(String[] args) {
        OuterClass.nest ob = new OuterClass.nest();
        System.out.println(ob.y);
    }
}
