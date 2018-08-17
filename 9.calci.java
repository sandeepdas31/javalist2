import java.util.Scanner;
public class calci {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = sc.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = sc.nextInt();

        System.out.println("Sum of two integers: %d%n" +(firstInt + secondInt));
        System.out.println("Difference of two integers: %d%n" +(firstInt - secondInt));
        System.out.println("Product of two integers: %d%n" +(firstInt * secondInt));
        System.out.println("Average of two integers: %.2f%n" +((double) (firstInt + secondInt) / 2));
        System.out.println("Distance of two integers: %d%n" +(Math.abs(firstInt - secondInt)));
        System.out.println("Max integer: %d%n" +(Math.max(firstInt, secondInt)));
        System.out.println("Min integer: %d%n"  +(Math.min(firstInt, secondInt)));
    }
}