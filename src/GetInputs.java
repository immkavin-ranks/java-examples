import java.util.Scanner;
class GetInputs
{
    public static void main(String[] args)
    {
        int a;
        float b;
        String s;
        Scanner obj = new Scanner(System.in); /* create a object */

        System.out.println("Enter a string:");
        s = obj.nextLine(); /* Take string input and assign to variable */
        System.out.println("You entered string "+s); /* Print */

        System.out.println("Enter an integer:");
        a = obj.nextInt(); /* Take integer input and assign to variable */
        System.out.println("You entered integer "+a); /* Print */

        System.out.println("Enter a float:");
        b = obj.nextFloat(); /* Take float input and assign to variable */
        System.out.println("You entered float "+b); /* Print */
    }
}