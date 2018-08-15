import java.util.Scanner;
public class degcon { 
	
	public static void main(String[] args)
	{
		float farenheit,celcius;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the farenheit to be converted to celcius");
		farenheit=sc.nextInt();
		celcius=((farenheit-32)*5)/9;
		System.out.println("the conversion of farenheit to celcius is:" +celcius);
		
	}
}
