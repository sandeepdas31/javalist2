//50 students enrolled in a MBA program, of the enrolled students 90% took the final exam. Two
//thirds of the students who took the final exam passed the final exam. Design an algorithm to
//find out how many students passed the final exam.

public class pass {

	
	public static void main(String[] args)
	{
	double total=50,exam=90,passper= 0.67,pass;
		pass=((exam/100)*total)*passper;
		System.out.println("the total number of students passed in the exam is: " +pass);
		
	}

}
