package assignment2;
/*Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the 
 * number is equal to the number itself, then the number is called an Armstrong number.
  For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/
 //  Write a program to print out  Armstrong numbers is or not
import java.util.Scanner;
 
public class ArmstronNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter the number: ");
		int i = s.nextInt();
		int temp = i;
		int r,sum=0;
		
		while(i>0)
		{
		r= i%10;
		i=i/10;
		sum = sum + r*r*r;

		}
		
		if (temp == sum)
			System.out.println("its an Armstrong number");
		else
			System.out.println("not an Armstrong number");
			
		}

	}


