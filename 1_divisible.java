import java.util.Scanner;
public class array {

	public static void main(String[] args)
	{
		int[] a=new int[15];
		int i,flag=0;
		Scanner input=new Scanner(System.in);
	    
		System.out.println("enter 15 values");
		for(i=0;i<15;i++)
		{
		a[i]= input.nextInt();
		}
		for(i=0;i<15;i++)
		{
			if(a[i]%3==0)
			{
				System.out.println("these values are divisible by 3: " +a[i]);
				flag++;
				
			}
		}
			if (flag==0)
			{
				System.out.println("no values are divisible by 3");
			}
		
		
			
	}
}
