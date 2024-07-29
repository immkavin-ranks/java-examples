class OuterClass1 {
    int x = 10;
    class InnerClass {
        public int myInnerClassMethod() {
            return x;
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass1 oc = new OuterClass1();
        OuterClass1.InnerClass obj = oc.new InnerClass();
        System.out.println(obj.myInnerClassMethod());
    }
}
