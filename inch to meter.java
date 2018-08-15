import java.util.Scanner;

public class inchmeter {
	public static void main(String[] args)
	{
		float inch;
		double meter,inch1=0.0254;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inch to be converted to meter");
		inch=sc.nextInt();
		meter=(inch*inch1);
		System.out.println("the conversion of " +inch+ " inch to meter is:" +meter);
		
	}
}
