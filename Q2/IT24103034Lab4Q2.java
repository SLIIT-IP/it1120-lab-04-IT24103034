
import java.util.Scanner;

public class IT24103034Lab4Q2 {
	
  public static void main(String[] args) {
	

	Scanner abc=new Scanner(System.in);

	System.out.print("Please enter exam marks (out of 100):");
	double examMarks=abc.nextDouble();

	if (examMarks>=0 && examMarks<=100);
	{
	System.out.print("Please enter the percentage given for the exam: ");
	}
	
	double examPercentage= abc.nextDouble();

	System.out.print("Please enter lab submission marks (out of 100): ");
	double labMarks=abc.nextDouble();

	if (labMarks>=0 && labMarks<=100);
	{
	System.out.print("Please enter the percentage given for the lab submission: ");
	}

	
	double labPercentage= abc.nextDouble(); 

	if (examPercentage+labPercentage !=100);

	{
	System.out.print("Invalid input for exam marks.Terminating program.: ");
	}

	
	double finalMarks= (examMarks*examPercentage/100)+(labMarks*labPercentage/100);

	System.out.print("Final Exam Mark is :"+finalMarks);
	
  }
}

	
	
	

	