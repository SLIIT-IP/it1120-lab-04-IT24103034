import java.util.Scanner;

public class IT24103034Lab4Q3 {

	public static void main(String[] args) {

		Scanner bcd=new Scanner(System.in);

		System.out.print("Enter a number");
		int number=bcd.nextInt();
		
		String result=(number>0)? "The number is positive": (number<0)?"The number is negative":"The number is zero";
		System.out.println(result);

	}
}		
		
		