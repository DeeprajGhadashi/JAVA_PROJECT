package assignment2;

// Write a program in java to find the sum of the even and odd digits of the number which is given as input.
import java.util.Scanner;
public class Sumodd_even {

	public static void main(String[] args) {
		Scanner input= new Scanner ( System.in);
		
	System.out.print("Enter a number: ");
        int number = input.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            number /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum); 
    }
	 
			 
			 
	}

