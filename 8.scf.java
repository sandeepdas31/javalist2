
import java.util.*;
public class scf {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        int val = in.nextInt();

        System.out.println("Square : \n" +(val * val));
        System.out.println("Cube : \n" +(val * val * val));
        System.out.println("Fourth power :\n" +(Math.pow(val, 4)));
    }
}
 