public class DecimalToBinary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StringBuffer sb = new StringBuffer(); // Integer.toBinaryString(n)
        while(n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }
        System.out.println(sb);
    }
}
