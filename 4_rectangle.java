//The ratio between the perimeter and the breadth of a rectangle is 5: 1. If the area of the rectangle is 216 sq. cm, design an algorithm to find the length of the rectangle


import java.lang.Math;

public class rectangle {

public static void main(String[] args)
 {
	double area=216,b=1.5,l;
	l=(area*b);
	l=Math.sqrt(l);
	System.out.println("Length="+l);
	
}

}