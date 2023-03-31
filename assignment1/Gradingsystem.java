package assignment1;

/*A school has following rules for grading system:
	 a. Below 25 - F
	 b. 25 to 45 - E
	 c. 45 to 50 - D
	 d. 50 to 60 - C
	 e. 60 to 80 - B
	 f. Above 80 - A
	 Ask user to enter marks and print the corresponding grade */
import java.util.Scanner;

public class Gradingsystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :");
		int num=s.nextInt();
		

		if(num<=25)
			System.out.println("F");
		else if(num<=45)
			System.out.println("E");
		else if(num<=50)
			System.out.println("D");
		else if(num<=60)
			System.out.println("C");
		else if(num<=80)
			System.out.println("B");
		else if(num>80)
			System.out.println("A");


	}

}
