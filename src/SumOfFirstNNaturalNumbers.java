import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter N: ");
        int N = Integer.parseInt(reader.readLine());

        // int[] firstNNN = get1ToN(N, new int[N]);
        // System.out.println("firstNNN = " + Arrays.toString(firstNNN));
        System.out.println(N * (N + 1) / 2);

        System.gc();
    }

    // get 1 to N array in without looping
    public static int[] get1ToN(int N, int[] firstNNN) {
        if (N == 0) return firstNNN;
        firstNNN[N - 1] = N;
        return get1ToN(N-1, firstNNN);
    }
}
