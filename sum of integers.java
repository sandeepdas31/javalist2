import java.util.Scanner;
public class addint {


		public static void main(String[] args)
		{
			int num,remain,firstdigit,seconddigit,thirddigit,fourthdigit,total;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a integer value between 0-1000 ");
			num=sc.nextInt();
			
			firstdigit = num%10;
			remain = num/10;
			seconddigit= remain%10;
			remain = remain/10;
		    thirddigit = remain%1000;
			remain = remain/10;
			fourthdigit = remain%10;
			remain = remain/10;
			total= firstdigit + seconddigit + thirddigit + fourthdigit; 
			System.out.println("the sum of " +num+ "is:" +total);
		
			
			
			
		}
	}


