import java.util.*;
public class least {

	
	public static void main(String[] args) {
		
		int[] a=new int[6];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 6 values");
		for(i=0;i<6;i++)
		{
			a[i]= sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<6;j++)
			{
				if(a[i]>(a[j]))
				{
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("the imput elements are: ");
for(i=0;i<6;i++)
{
	System.out.println(+a[i]);
}
if (a[0]==0)

	System.out.println("the minimum value in the array is 0.");
else
{
	System.out.println("least number in the array is " +a[0]+ 
			" and the number less than " +a[0]+ " is " +(a[0]-1) );
}
	}

}
