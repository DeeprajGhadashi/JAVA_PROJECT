package assignment1;
 
import java.util.Scanner;
  
/*wap that ask two numbers from user and print greater number among two */

public class maximumnumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      
		int num1;
		System.out.print("Enter number1:");
		num1= s.nextInt();
		  
		int num2;
		System.out.print("Enter number2:");
		num2= s.nextInt();
		  
		int num3;
		System.out.print("Enter number3:");
		num3= s.nextInt();
		
		int maxresult = (num1>=num2) ?    ((num1>=num2)?num1:num2)  :((num2>=num3)?num2:num3 );
		
		//int maxresult = (num1<=num2)  ?  ((num2>=num3)?num2:num3)  :  ((num1>=num3)?num1:num3);
		
		System.out.println(maxresult);
		
		
		}
	}


