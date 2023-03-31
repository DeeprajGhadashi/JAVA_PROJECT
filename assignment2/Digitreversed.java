package assignment2;

/* Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
     For example,if the input is 12345, the output should be 54321.*/
 import java.util.Scanner;
 
public class Digitreversed {
         
	 public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		  System.out.println(" enter the value");
		   int n = s.nextInt();
		   

		   while( n!=0)
		   {
			   System.out.print(n%10);
			   n=n/10;
		   }			 
	}
}
