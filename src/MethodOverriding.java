class HDFC {
    int getRateOfInterest() {
        return 9;
    }
}

class BOI extends HDFC{
    int getRateOfInterest() {
        return 7;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        HDFC h = new HDFC();
        System.out.println("HDFC Rate of interest is: " + h.getRateOfInterest());
        BOI b = new BOI();
        System.out.println("BOI Rate of interest is: " + b.getRateOfInterest());
    }

}


