package assignment2;

// Write a program to check if given number is prime or not
import java.util.Scanner;
public class Numberprime_or_not {

	public static void main(String[] args) {
		 
		Scanner  input = new Scanner(System.in);

	        System.out.print("Enter a number to check if it is prime: ");
	        int number = input.nextInt();

	        boolean isPrime = true;

	        if (number <= 1)
	          {
	            isPrime = false;
	           } 
	        else 
	          {
	           for (int i = 2; i <= number/2; i++) 
	            
	           {
	              if (number % i == 0)
	                  {
	                    isPrime = false;
	                    break;
	                  }
	           
	           
	           }
	        }

	        if (isPrime)
	            {
	            System.out.println(number + " is a prime number");
	            }
	        else 
	            {
	            System.out.println(number + " is not a prime number");
	            }
	    }
	

	}
D

