import java.util.Scanner;
public class SquareRoot
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The square root of "+ n+ " is: "+squareRoot(n));
    }
    public static double squareRoot(int num)
    {
        double t;
        double sqrt= (double) num /2;
        do
        {
            t=sqrt;
            sqrt=(t+(num/t))/2;
        }
        while(t - sqrt != 0);
        return sqrt;
    }
}